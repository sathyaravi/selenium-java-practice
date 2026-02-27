package stringpractice;

public class ReverseWordsInSentence1 {

	public static void main(String[] args) {
		
		String s  = "Hello World Java Programming";
		
		String[] splitWords = s.split(" ");
		
		StringBuilder rev = new StringBuilder();
		
		for(int i=splitWords.length-1;i>=0;i--) {
						
			rev.append(splitWords[i]).append(" ");
		}
		
		
		System.out.println(rev.toString().trim());
	}

}
