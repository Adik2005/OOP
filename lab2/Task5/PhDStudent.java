package Task5;

public class PhDStudent extends Student {
    private String researchTopic;

    public PhDStudent(String name, int age, String major, String researchTopic) {
        super(name, age, major);
        this.researchTopic = researchTopic;
    }

    @Override
    public String getOccupation() {
        return "PhD Student, research topic: " + researchTopic;
    }

    @Override
    public boolean canTakePet(Animal pet) {
        return !(pet instanceof Dog);
    }
}