package mockprep.javabasics;

public class AmazonShopping {

	public static void main(String[] args) {
		
		String st1=  "Computer";

		char[] ch = st1.toCharArray();

		String st2 = "";


		for(int i=ch.length-1;i>=0;i--){
			
				st2+=ch[i];
				
		}
		System.out.println(st2);
	}

}
