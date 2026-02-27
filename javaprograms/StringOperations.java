package javaprograms;

public class StringOperations {

	public static void main(String[] args) {
		
		String S = "Java String Operations";
		
		//Convert the string to lowercase
		System.out.println("Converting the given string to lowercase:"+S.toLowerCase());
		
		//Convert the string to uppercase
		System.out.println("Converting the given string to uppercase:"+S.toUpperCase());
		
		//Splitting the string to list of words
		String [] words= S.split(" ");
		System.out.println("SplittedWords:"+words);
		
		//Finding the length of the string
		System.out.println("Length of the string:"+S.length());
		
		//Find the character at the given index
		System.out.println("Character present at the given index"+S.charAt(4));
		
		//Replace method
		System.out.println("Replaced String:"+S.replace('J', 'L'));
		
		
		//Replace all method
		String new_string = "Hello World!!!";
		String replaced_value = new_string.replaceAll("[a-z]", "*");
		System.out.println("Replace all characters in a string:"+replaced_value);
		
		//Contains method
		boolean contains = replaced_value.contains("*");
		System.out.println(contains);
		
		//Comparing strings
		String s1 = "Eclipse";
		String s2 = "eclipse";
		
		if (s1.equals(s2)) {
			System.out.println("Both the strings are equal");
		}
		else {
			System.out.println("strings are not equal");
		}
		
		//Comparing string using Ignorecase
		
		if (s1.equalsIgnoreCase(s2)) {
			
			System.out.println("String the equal ignoring cases");
		}
		else {
			
			System.out.println("Strings are not equal");
		}
		

	}

}
