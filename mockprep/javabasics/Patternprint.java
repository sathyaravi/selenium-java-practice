package mockprep.javabasics;

public class Patternprint {

	public static void main(String[] args) {
		
		

		for(int i=0;i<=5;i++){
			System.out.print(i+" "); //to print the values of i from 0 to 5
		}
		
		System.out.println();
		
		for(int i=5;i>=0;i--){
			System.out.print(i+" ");//to print the value of i from 5 to 0
			
		}

		System.out.println();
		

		for(int  p=0;p<=5;p++){
			
			for(int q=0;q<=5;q++){
				
				System.out.println(p+" "+","+" "+ q);//to print the pairs(p,q)
		
			}
			System.out.println();
		}
		// to print pattern
		/* 
		 * 
		 * 
		 *      ******
				******
				******
				******
				******
				******
		 * */

		for(int x=5;x>=0;x--){
			
			for(int  y=0;y<=5;y++){
	
				System.out.print("*"); 			}
			System.out.println();
		}

		/*
		 *  
		 */
		
		for(int i=0;i<=5;i++) {
			
			for(int j=5;j>=0;j--) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for(int i=0;i<=5;i++) {
			
			for(int j=0;j<=i;j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
	}

}
