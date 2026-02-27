package stringpractice;

public class CountChars1 {

	public static void main(String[] args) {
		
		String s = "  Hello   World  Java   Programming  ";
		
		
		int totalChars = 0;
		int charWithoutspaces = 0;
		int spaces =0;
		int words = 0;
		
		for(char c:s.toCharArray()) {
			totalChars++;
			if(c!=' ') {
				
				charWithoutspaces++;
				
			}
			else {
				spaces++;
			}
			
		}
		 
		String trimmed = s.trim();
	    String[] parts = trimmed.split("\\s+");  
	    words = parts.length;
	    
	     if (trimmed.isEmpty()) {
	            words = 0;
	        }
		System.out.println("Total Characters in the given string:"+totalChars);
		System.out.println("Characters without spaces:"+charWithoutspaces);
		System.out.println("Number of spaces:"+spaces);
		System.out.println("Number of words: " + words);

	}

}
