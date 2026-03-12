package oopsconceptscomposition;

public class Main {

	public static void main(String[] args) {
		
	
		
		Address addr = new Address("123 Main St", "Portland", 97005);

	    Person p = new Person("John", 30, addr);

	    p.printPersonDetails();

		
		
		

	}

}
