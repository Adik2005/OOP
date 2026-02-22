package problem5;

public class problem5 {
    public static void main(String[] args) {

        DragonLaunch dl = new DragonLaunch();
        dl.kidnap(new Person("A", Gender.BOY));
        dl.kidnap(new Person("B", Gender.BOY));
        dl.kidnap(new Person("C", Gender.GIRL));
        dl.kidnap(new Person("D", Gender.GIRL));

        System.out.println("Will dragon eat? " + dl.willDragonEatOrNot()); // false
    }
}

