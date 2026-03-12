package oopsconcepts;

public class UserAccount {

	public static void main(String[] args) {
		
				Encapsulation myObj = new Encapsulation();
				myObj.setPassword("Atleast 8 characters,1 number,1 special character");
				System.out.println("Current rule:"+myObj.getPassword());
				myObj.updatePassword();
				
			}
			
		

	}

	

