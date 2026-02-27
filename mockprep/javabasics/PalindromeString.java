package mockprep.javabasics;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String input = s.nextLine();
		
		String replace_space = input.replaceAll("[\\s+|$|@]", "");
		
		char[] ch = replace_space.toCharArray();
		
		String reversed_string="";
		
		for(int i=ch.length-1;i>=0;i--) {
			
			reversed_string = reversed_string+ch[i];
		}
		System.out.println(replace_space);
		System.out.println(reversed_string);
		if (replace_space.equalsIgnoreCase(reversed_string)) {
			System.out.println("The given string is a Palindrome");
		}
		
		else {
			System.out.println("The given string is not a Palindrome");
		}
		
		s.close();
	}

}
