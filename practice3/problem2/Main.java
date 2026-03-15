package problem2;

import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Vector<Person> people = new Vector<>();

        while (true) {
            System.out.println("\n1) Add person");
            System.out.println("2) Print all");
            System.out.println("0) Exit");
            System.out.print("Choose: ");

            String choice = in.nextLine().trim();

            if (choice.equals("0")) {
                break;
            } else if (choice.equals("1")) {
                addPerson(in, people);
            } else if (choice.equals("2")) {
                printAll(people);
            } else {
                System.out.println("Wrong choice, try again.");
            }
        }
        System.out.println("Poka Brat");
    }

    private static void addPerson(Scanner in, Vector<Person> people) {
        System.out.println("\nChoose type:");
        System.out.println("1) Person");
        System.out.println("2) Student");
        System.out.println("3) Staff");
        System.out.print("Type: ");

        String type = in.nextLine().trim();

        System.out.print("Name: ");
        String name = in.nextLine();

        System.out.print("Address: ");
        String address = in.nextLine();

        if (type.equals("1")) {
            people.add(new Person(name, address));
            System.out.println("Person added.");
        } else if (type.equals("2")) {
            System.out.print("Program: ");
            String program = in.nextLine();

            System.out.print("Year: ");
            int year = Integer.parseInt(in.nextLine());

            System.out.print("Fee: ");
            double fee = Double.parseDouble(in.nextLine());

            people.add(new Student(name, address, program, year, fee));
            System.out.println("Student added.");
        } else if (type.equals("3")) {
            System.out.print("School: ");
            String school = in.nextLine();

            System.out.print("Pay: ");
            double pay = Double.parseDouble(in.nextLine());

            people.add(new Staff(name, address, school, pay));
            System.out.println("Staff added.");
        } else {
            System.out.println("Wrong type. Nothing added.");
        }
    }

    private static void printAll(Vector<Person> people) {
        if (people.isEmpty()) {
            System.out.println("\nNo people yet.");
            return;
        }

        System.out.println("\n--- All people ---");
        for (Person p : people) {
            System.out.println(p); // вызывает toString()
        }
    }
}