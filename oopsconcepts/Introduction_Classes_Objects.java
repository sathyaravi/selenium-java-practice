package oopsconcepts;

public class Introduction_Classes_Objects {

	public static void main(String[] args) {
		
		Students student = new Students();
		
		student.rollno = 20;
		student.name="John";
		student.marks=88.5f;
		
		System.out.println(student.rollno);	
		System.out.println(student.name);	
		System.out.println(student.marks);	
		
	}
	

}
class Students{
	
	int rollno = 21;
	String name;
	float marks = 90.0f;
	
}