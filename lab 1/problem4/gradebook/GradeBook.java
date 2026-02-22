package problem4.gradebook;

import problem4.practice2.Student;

public class GradeBook {
    private Course course;
    private Student[] students;
    private int[] grades;

    public GradeBook(Course course, Student[] students) {
        this.course = course;
        this.students = students;
        this.grades = new int[students.length];
    }

    public void setGrade(int index, int grade) {
        grades[index] = grade;
    }

    public void displayMessage() {
        System.out.println("Welcome to the grade book for " + course.getName());
        System.out.println(course.getDescription() + "!");
        System.out.println();
    }

    public void displayGradeReport() {
        double avg = determineClassAverage();
        int minIndex = indexOfMinGrade();
        int maxIndex = indexOfMaxGrade();

        System.out.printf("Class average is %.2f. ", avg);
        System.out.println("Lowest grade is " + grades[minIndex] + " (" + students[minIndex].getName() +
                ", id: " + students[minIndex].getId() + ").");
        System.out.println("Highest grade is " + grades[maxIndex] + " (" + students[maxIndex].getName() +
                ", id: " + students[maxIndex].getId() + ").");
        System.out.println();

        System.out.println("Grades distribution:");
        outputBarChart();
    }

    private double determineClassAverage() {
        int sum = 0;
        for (int g : grades) {
            sum += g;
        }
        return (double) sum / grades.length;
    }

    private int indexOfMinGrade() {
        int minIndex = 0;
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] < grades[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    private int indexOfMaxGrade() {
        int maxIndex = 0;
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] > grades[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    private void outputBarChart() {
        int[] freq = new int[11]; // 0..10 (10 = 100)

        for (int g : grades) {
            int bucket = g / 10;
            if (bucket > 10) bucket = 10;
            freq[bucket]++;
        }

        for (int i = 0; i < freq.length; i++) {
            if (i == 10) {
                System.out.print("  100: ");
            } else {
                System.out.printf("%02d-%02d: ", i * 10, i * 10 + 9);
            }

            for (int star = 0; star < freq[i]; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return "GradeBook for " + course.toString() + ", students: " + students.length;
    }
}

