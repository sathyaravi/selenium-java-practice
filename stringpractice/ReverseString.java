package stringpractice;

public class ReverseString {

	public static void main(String[] args) {
		
		String s = "Hello World";
		
		char[] ch = s.toCharArray();
		
		StringBuilder rev = new StringBuilder();

		//reverse a string without using built in method
		
		for(int i=ch.length-1;i>=0;i--) {
			
			rev.append(ch[i]);
		}
		
		System.out.println(rev);

	}

}
