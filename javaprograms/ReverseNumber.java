package javaprograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		reverse(n);
		
		in.close();

	}

	static void reverse(int n) {
		
		int reverse_number = 0;
		
		while(n!=0) {
			
			
			
			int rem = n % 10;
			
			reverse_number = reverse_number*10+rem;
			
			n = n / 10;
		}
		
		System.out.println("Reversed number:"+reverse_number);
		
	}

}
