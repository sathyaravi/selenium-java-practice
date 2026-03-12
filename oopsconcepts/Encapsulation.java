package oopsconcepts;

public class Encapsulation {
	
	

		private String passwordRules;
		void updatePassword(){
		
			System.out.println("Password rule updated Successfully");
		}
		



	public String getPassword(){

		return passwordRules;
		
	}

	public void setPassword(String newRule){
		
		if(newRule==null|| newRule.isEmpty()) {
			
			System.out.println("Password cannot be empty");
		}
		else {
			this.passwordRules=newRule;
		}
		
		
	}

}



