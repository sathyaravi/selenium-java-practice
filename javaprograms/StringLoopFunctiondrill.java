package javaprograms;

public class StringLoopFunctiondrill {
	
	public static void main(String[] args) {
		
		String s = "sUNfLOWER IS YELLOW in color";
		
		System.out.println(s.toLowerCase());
		
		System.out.println(s.toUpperCase());
		
		//to capitalize each word  in String
		
		String[] words = s.split(" ");
		
		StringBuilder sb = new StringBuilder();
		
		
		for(String w:words) {
			
			if(!w.isEmpty()) {
				
				sb.append(w.substring(0,1).toUpperCase())
				.append(w.substring(1).toLowerCase())
				.append(" ");
			}
		}
		System.out.println(sb.toString().trim());
		
		
		//to find the length of a string
		System.out.println(s.length());
		
		String s1 = "sUNfLOWER IS YELLOW in color";
		
		String s2 = "SUNFLOWER IS YELLOW IN COLOR";
		
		System.out.println(s1.isEmpty());
		System.out.println(s2.isBlank());
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		System.out.println(s1.strip());
		
		String[] splittedWords = s2.split("\\s+");
		
		for(String w:splittedWords) {
			System.out.println(w);
		}
		
		String joinedString = String.join(" ",splittedWords);
		
		System.out.println("Merged String:"+joinedString);
		
		
		System.out.println(s2.contains("YELLOW"));
		
		System.out.println(s2.indexOf('Y'));
		
		System.out.println(s2.lastIndexOf('S'));
		
		System.out.println(s2.startsWith("SUN"));
		
		System.out.println(s2.endsWith("COLOR"));
		
		System.out.println(s1.replace('s', 'F'));
		

	}

}
