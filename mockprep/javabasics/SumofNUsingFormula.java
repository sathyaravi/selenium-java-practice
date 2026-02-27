package mockprep.javabasics;

import java.util.Scanner;

public class SumofNUsingFormula {
	
	
	public static int nSum(int num) {
		
		return num*(num+1)/2;
	}

	public static void main(String[] args) {
		
		Scanner n = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int num = n.nextInt();
		
		System.out.println("Sum of first"+" " + num+"  given numbers:"+nSum(num));
		
		n.close();
		
	}
}
