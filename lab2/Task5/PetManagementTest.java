package Task5;

public class PetManagementTest {
    public static void main(String[] args) {
        Person john = new Employee("John", 30, "Engineer");
        Person alice = new PhDStudent("Alice", 26, "Computer Science", "AI");
        Person bob = new Student("Bob", 20, "Mathematics");

        Animal murka = new Cat("Murka", 5);
        Animal rex = new Dog("Rex", 3);
        Animal goldie = new Fish("Goldie", 1);

        john.assignPet(murka);
        bob.assignPet(goldie);

        PersonRegistry registry = new PersonRegistry();
        registry.addPerson(john);
        registry.addPerson(alice);
        registry.addPerson(bob);

        System.out.println("=== Initial registry ===");
        System.out.println(registry);

        System.out.println("=== John leaves Murka with Alice ===");
        john.leavePetWith(alice);
        System.out.println(registry);

        System.out.println("=== John retrieves Murka from Alice ===");
        john.retrievePetFrom(alice);
        System.out.println(registry);

        System.out.println("=== Trying to give Dog to PhDStudent ===");
        Employee mike = new Employee("Mike", 40, "Manager");
        registry.addPerson(mike);

        mike.assignPet(rex);
        mike.leavePetWith(alice); // должно не разрешиться
        System.out.println(registry);

        System.out.println("=== People with pets ===");
        registry.printPeopleWithPets();

        System.out.println("=== People without pets ===");
        registry.printPeopleWithoutPets();
    }
}