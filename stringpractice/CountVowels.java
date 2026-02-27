package stringpractice;

public class CountVowels {

	public static void main(String[] args) {
		
		String s = "Hello   World  Java   Programming";
		
		int countVowels = 0;
	
		for(char ch  : s.toLowerCase().toCharArray()) {
			
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				
				countVowels++;
				
			}
				
				
			
		}
		
		System.out.println(countVowels);
		
		int switchcaseVowels = 0;
		for(char ch  : s.toLowerCase().toCharArray()) {
			
			switch(ch) {
			
			case 'a':
				
			case 'e':
				
			case 'i':
				
			case 'o':
				
			case 'u':
				switchcaseVowels++;
				break;
			
			}
			
		}
		System.out.println("Count vowels using switch case:"+switchcaseVowels);

	}

}
