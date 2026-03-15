package problem1;

public class Main {
    public static void main(String[] args) {

        Horse h1 = new Horse();
        Horse h2 = new Horse("Gooner");

        h1.makeSound();
        h2.makeSound();

        h2.eat();
        h2.eat("Carrot");

        h2.play();
        h2.play("carrot");
    }
}