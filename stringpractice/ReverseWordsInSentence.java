package stringpractice;

public class ReverseWordsInSentence {

	public static void main(String[] args) {
		
		String s  = "Hello World Java Programming";
		
		String[] splitWords = s.split(" ");
		
		StringBuilder result = new StringBuilder();

		for(String s1:splitWords) {
			
			StringBuilder rev = new StringBuilder();

			for(int i=s1.length()-1;i>=0;i--) {
				
				rev.append(s1.charAt(i));
				
				
			}
			
			result.append(rev).append(" ");
		}
		
		
		System.out.println(result);

	}

}
