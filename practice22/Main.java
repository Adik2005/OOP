package practice22;

public class Main {
    public static void main(String[] args) {

        Student s = new Student("Adilet", 123);

        System.out.println(s.getName());
        System.out.println(s.getId());
        System.out.println(s.getYearOfStudy());

        s.incrementYear();

        System.out.println(s.getYearOfStudy());
        
        
        
        System.out.println();
        
        
        
        StarTriangle small = new StarTriangle(3);
        System.out.println(small);
        
        
        
        System.out.println();
        
        
        
        Time t = new Time(23, 5, 6);
        System.out.println(t.toUniversal());
        System.out.println(t.toStandard());

        Time t2 = new Time(4, 24, 33);
        t.add(t2);

        System.out.println(t.toUniversal());
        System.out.println(t.toStandard());
    }
}
