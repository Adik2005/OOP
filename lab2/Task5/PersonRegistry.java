package Task5;

import java.util.ArrayList;

public class PersonRegistry {
    private ArrayList<Person> people;

    public PersonRegistry() {
        people = new ArrayList<>();
    }

    public void addPerson(Person person) {
        if (person != null) {
            people.add(person);
        }
    }

    public void removePerson(Person person) {
        people.remove(person);
    }

    public void printAllPeople() {
        for (Person person : people) {
            System.out.println(person);
        }
    }

    public void printPeopleWithPets() {
        for (Person person : people) {
            if (person.hasPet()) {
                System.out.println(person);
            }
        }
    }

    public void printPeopleWithoutPets() {
        for (Person person : people) {
            if (!person.hasPet()) {
                System.out.println(person);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PersonRegistry:\n");
        for (Person person : people) {
            sb.append(person).append("\n");
        }
        return sb.toString();
    }
}