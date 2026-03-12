package oopsconcepts;

public class MethodOverloading {
	
	
	public void login() {
		
		System.out.println("Logged in successfully - Guest Login");
	}
	
	public void login(String uname,String password) {
		
		if(uname.isEmpty() || password.isEmpty()) {
			
			System.out.println("Username and Password required to login");
		}
		else {
			
			System.out.println("Logged in Successfully:"+" "+"hi "+uname);
		}
	}
	
	public void login(String uname, String password,int otp) {
		
		if(String.valueOf(otp).length()!=3) {
			System.out.println("Three digit otp token is required to login");
		}
		
		else {
			
			System.out.println("Logged in Successfully with otp");
		}
		
	}

	public static void main(String[] args) {
		MethodOverloading mObj= new MethodOverloading();
		mObj.login();
		mObj.login("John","John123");
		mObj.login("John", "John123", 123);


	}

}
