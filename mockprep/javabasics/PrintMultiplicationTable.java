package mockprep.javabasics;

public class PrintMultiplicationTable {

	public static void main(String[] args) {
		
		//to print the multiplication table
		
		int multiplier = 5;
		
		for(int i=1;i<11;i++) {
			
			int multiplicant = i*multiplier;
			
			System.out.println(i+"*"+multiplier+"="+multiplicant);
		}

	}

}
