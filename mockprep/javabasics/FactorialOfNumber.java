package mockprep.javabasics;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number to get the factorial:");
		
		int factorialNum=factorial(scan.nextInt());
		
		System.out.println(factorialNum);
				
		scan.close();
	}
	
	public static int factorial(int i) {
		
		int fact=1;
		
		while(i!=0) {
			
			fact=fact*i;
			i--;
		}
		
		return fact;
		

	}
	

}
