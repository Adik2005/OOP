package problem4.gradebook;

import problem4.practice2.Student;

import java.util.Scanner;

public class GradeBookTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Course course = new Course(
                "CS101",
                "Object-oriented Programming and Design",
                5,
                "None"
        );

        Student[] students = new Student[] {
                new Student("Student A", 1),
                new Student("Student B", 2),
                new Student("Student C", 3),
                new Student("Student D", 4),
                new Student("Student E", 5),
        };

        GradeBook gb = new GradeBook(course, students);

        gb.displayMessage();

        System.out.println("Please, input grades for students:");
        for (int i = 0; i < students.length; i++) {
            int grade = readGrade(in, students[i]);
            gb.setGrade(i, grade);
        }
        System.out.println();

        gb.displayGradeReport();
    }

    private static int readGrade(Scanner in, Student s) {
        while (true) {
            System.out.print(s.getName() + " (id: " + s.getId() + "): ");
            String text = in.nextLine().trim();

            try {
                int grade = Integer.parseInt(text);
                if (grade < 0 || grade > 100) {
                    System.out.println("Grade must be between 0 and 100. Try again.");
                } else {
                    return grade;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Enter an integer number 0..100.");
            }
        }
    }
}

