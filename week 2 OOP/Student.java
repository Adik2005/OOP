package Week2;

public class Student {
	
	private String studentName;
	private int studentID;
	private int studentYOS;
	
	public Student(String name, int id, int yos) {
		this.studentName = name;
		this.studentID = id;
		this.studentYOS = yos;
	}
	
	public void displayDetails() {
		System.out.println("Name - " + studentName);
		System.out.println("ID - " + studentID);
		System.out.println("Year of Study - " + studentYOS);
	}
	public void incrementID() {
		studentID+=1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stud = new Student("Miras", 1, 2024);
		
		stud.displayDetails();
		stud.incrementID();
		stud.displayDetails();		
	}

}
