package javaprograms;

import java.util.Scanner;

public class Fibonacciseries {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the value to generate fibonacci series");
		
		int n = in.nextInt();
	
		fibonacci(n);
		
		in.close();
	}
	
	static void fibonacci(int n) {
		
		int n1=0;int n2=1;
		
		for(int i=0;i<=n;i++) {
			
			System.out.print(n1+" ");
			
			int fib=n2+n1;
			
			n1 = n2;
			
			n2 =fib;
			
		}
		
		
		
		
	}

}
