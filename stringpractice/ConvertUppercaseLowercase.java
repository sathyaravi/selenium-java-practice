package stringpractice;

public class ConvertUppercaseLowercase {

	public static void main(String[] args) {
		
		String s = "Hello World Java Programming";
		
		
		
		ToggleCase(s);
	}

	static void ToggleCase(String s) {
		
		StringBuilder result = new StringBuilder();
		
		
		
		
			
			for(int i=0;i<s.length();i++) {
				
				char ch = s.charAt(i);
				
				if(ch>='a'&&ch<='z') {
					
					result.append((char)(ch+32));
					
					
				}
				else if(ch>='A'&&ch<='Z') {
					
					result.append((char)(ch-32));
					
				}
				else {
					result.append(ch);
				}
			}
		
		System.out.println(result.toString());
	}

	

}
