package problem1;

public class Animal {
    protected String name;
    public Animal(){
        this.name = "Unknown";
    }
    public Animal(String name){
        this.name = name;
    }
    public void makeSound(){
        System.out.println("Some animal make a sound");
    }
    public void eat() {
        System.out.println(name + " is eating.");
    }
    public void eat(String food) {
        System.out.println(name + " is eating " + food + ".");
    }
    public String getName() {
        return name;
    }
}