package problem2;

public class Student {

    //ENUM
    public enum Year {
        FIRST, SECOND, THIRD, FOURTH
    }

    private static int studentCount;

    public static final String UNIVERSITY_NAME = "KBTU";

    private final int id;

    private String name;
    private Year year;

    static {
        studentCount = 0;
        System.out.println("Student class loaded.");
    }

    {
        System.out.println("New student object created.");
    }

    // Конструкт
    public Student(int id, String name, Year year) {
        this.id = id;
        this.name = name;
        this.year = year;

        studentCount++;
    }

    public void changeYear(Year year) {
        this.year = year;
    }

    public void changeYear(int yearNumber) {
        this.year = Year.values()[yearNumber - 1];
    }

    public int getId() {
        return id;
    }

    public static int getStudentCount() {
        return studentCount;
    }

    public void setYear(Year year) {
        this.year = year;
    }
    public void set
}
