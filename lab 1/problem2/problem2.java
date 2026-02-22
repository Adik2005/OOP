package problem2;
public class problem2 {
    public static void main(String[] args) {

        Student s1 = new Student(1, "Adilet", Student.Year.FIRST);
        Student s2 = new Student(2, "Adik", Student.Year.SECOND);

        System.out.println(Student.getStudentCount());
        System.out.println(Student.UNIVERSITY_NAME);
    }
}

