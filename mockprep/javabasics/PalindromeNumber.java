package mockprep.javabasics;

import java.util.Scanner;

public class PalindromeNumber {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		boolean isPalindrome = palindromeNumber(num);
		
		scan.close();
		
		System.out.println(isPalindrome);
		
		
		
	

	}
	
	public static boolean palindromeNumber(int num) {
		
		if (num<0) {
			
			return false;
		}
		
		int rev=0;
		
		int original = num;
		
		while(num!=0) {
			
			int rem=num%10;
			
			rev=rev*10+rem;
			
			num=num/10;
		
			
		}
		
		
		return original==rev;
		
		
		
		
	}

}
