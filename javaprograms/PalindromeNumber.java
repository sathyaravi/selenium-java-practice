package javaprograms;

import java.util.Scanner;

public class PalindromeNumber {
	static int palindrome_number = 0;
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		palindrome(n);
		
		in.close();
		
		if(n==palindrome_number) {
		
				System.out.println("The given number is a palindrome");
		
		}
		
		else {
			
			System.out.println("Not a palindrome number");
			
		}

	}

	static int palindrome(int n) {
		
		
		
		while(n!=0) {
			
			
			
			int rem = n % 10;
			
			palindrome_number = palindrome_number*10+rem;
			
			n = n / 10;
		}
		
		return palindrome_number;
		
	}

		
	}


