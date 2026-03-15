package problem1;

public class Horse extends Animal {
    public Horse(){
        super();
    }
    public Horse(String name){
        super(name);
    }
    @Override
    public void makeSound() {
        System.out.println(name + " says: ~Farts~");
    }
    public void play() {
        System.out.println(name + " is playing.");
    }
    public void play(String toy) {
        System.out.println(name + " is playing with " + toy + ".");
    }
}
