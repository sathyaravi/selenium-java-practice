package stringpractice;

public class PalindromeString {

	public static void main(String[] args) {
		String s = "racecr";
		
		System.out.println(palindromeString(s));
		
		System.out.println(palindromeString("hello"));
		
		System.out.println(palindromeString("madam"));

	}

	static boolean palindromeString(String s) {
		
				
		StringBuilder rev = new StringBuilder();
		
		for(int i=s.length()-1;i>=0;i--) {
						
			rev.append(s.charAt(i));
		}
		
		return (s.equalsIgnoreCase(rev.toString()));
		
		
	}

}
