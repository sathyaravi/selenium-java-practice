package stringpractice;

public class PalindromeStringUsingTwoPointerTechnique {

	public static void main(String[] args) {
		
		String s = "racecr";
		
		System.out.println(palindromeString(s));
		
		System.out.println(palindromeString("hello"));
		
		System.out.println(palindromeString("madam"));

	}

	static boolean palindromeString(String s) {
		
		int left = 0;
		
		int right = s.length()-1;
		
		while(left<right) {
			
			if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))) {
				
				return false;
			}
			
			left++;
			right--;
		}
		
		return true;
	}

}
