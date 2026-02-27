package mockprep.javabasics;

import java.util.Scanner;

public class SumOfNnaturalnumbers {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number to get first natural numbers:");
		
		int finalSum=NaturalSum(scan.nextInt());
		
		System.out.println(finalSum);
		
		scan.close();
	}
	
	public static int NaturalSum(int i) {
		
		int sum=0;
		for(int j=0;j<=i;j++) {
			
			sum+=j;
			
			
		}
		
		return sum;

	}

}
