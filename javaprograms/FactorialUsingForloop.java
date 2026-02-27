package javaprograms;

import java.util.Scanner;

public class FactorialUsingForloop {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int n= in.nextInt();
		
		factorial(n);
		
		in.close();

	}

	static void factorial(int n) {
		
		int fact=1;
		
		for(int i=1;i<=n;i++) {
			
			fact=fact*i;
		}
		
		System.out.println(fact);
	}

}
