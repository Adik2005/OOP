package Task5;

import java.util.Objects;

public abstract class Person {
    private String name;
    private int age;
    private Animal pet;
    private Animal vacationPet; // чтобы помнить, какого питомца человек временно отдал

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Animal getPet() {
        return pet;
    }

    public boolean hasPet() {
        return pet != null;
    }

    public void assignPet(Animal pet) {
        if (pet == null) {
            System.out.println(name + ": pet is null.");
            return;
        }

        if (!canTakePet(pet)) {
            System.out.println(name + " cannot take this pet: " + pet.getClass().getSimpleName());
            return;
        }

        if (hasPet()) {
            System.out.println(name + " already has a pet.");
            return;
        }

        this.pet = pet;
    }

    public void removePet() {
        this.pet = null;
    }

    public abstract String getOccupation();

    public boolean canTakePet(Animal pet) {
        return true;
    }

    public void leavePetWith(Person caretaker) {
        if (!hasPet()) {
            System.out.println(name + " has no pet to leave.");
            return;
        }

        if (caretaker == null) {
            System.out.println("Caretaker is null.");
            return;
        }

        if (caretaker.hasPet()) {
            System.out.println(caretaker.getName() + " already has a pet.");
            return;
        }

        Animal temp = this.pet;

        if (!caretaker.canTakePet(temp)) {
            System.out.println(caretaker.getName() + " cannot take pet " + temp.getClass().getSimpleName());
            return;
        }

        caretaker.assignPet(temp);
        if (caretaker.getPet() == temp) {
            this.vacationPet = temp;
            this.removePet();
        }
    }

    public void retrievePetFrom(Person caretaker) {
        if (caretaker == null) {
            System.out.println("Caretaker is null.");
            return;
        }

        if (this.hasPet()) {
            System.out.println(name + " already has a pet.");
            return;
        }

        if (vacationPet == null) {
            System.out.println(name + " has no pet to retrieve.");
            return;
        }

        if (caretaker.getPet() == null || !caretaker.getPet().equals(vacationPet)) {
            System.out.println(caretaker.getName() + " does not have " + name + "'s pet.");
            return;
        }

        this.assignPet(vacationPet);
        if (this.getPet() != null) {
            caretaker.removePet();
            vacationPet = null;
        }
    }

    @Override
    public String toString() {
        String petInfo = hasPet() ? pet.toString() : "no pet";
        return getClass().getSimpleName() +
                "{name='" + name + "', age=" + age +
                ", occupation='" + getOccupation() +
                "', pet=" + petInfo + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}