package mockprep.javabasics;

import java.util.Scanner;

public class CountingVowelsinaString {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String input=s.nextLine();
				
		System.out.println("Enter the string:");
		
		String newString = input.toLowerCase();
		
		char[] array_str= newString.toCharArray();
		
		char[] vowel_list= {'a','e','i','o','u'};
		
		int vowelCount = 0;
		
		System.out.println("Vowels in the string are:");
		
		for(int i=0;i<array_str.length;i++) {
			
			for(int j=0;j<vowel_list.length;j++) {
				
				if(array_str[i]==vowel_list[j]) {
					
					System.out.println(array_str[i]);
					vowelCount++;
					break;
					
					
				}
				
			}
			
		}
		System.out.println("Total number of vowels: " + vowelCount);

        s.close();
		
		

	}

}
