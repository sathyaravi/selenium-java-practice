package mockprep.javabasics;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int a =0;
	
		int fib = 1;
		
		int n = in.nextInt();
		
		//int count = 2;
		
//		while(count<=n) {
//			
//			int temp=fib;
//			
//			fib = fib + a;
//			
//			a=temp;
//			
//			count++;
//		}
		for(int count =2;count<=n;count++) {
			
			int temp = fib;
			 
			fib = fib + a;
			
			a = temp;
		}
		
		System.out.println(fib);
		in.close();
	}

}
