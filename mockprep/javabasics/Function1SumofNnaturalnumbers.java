package mockprep.javabasics;

import java.util.Scanner;

public class Function1SumofNnaturalnumbers {
	
	
	public static int nSum(int num) {
		int totalSum = 0;
		for(int i=0;i<=num;i++){
			
			totalSum += i;
		}
		
	return totalSum;

	}

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);

		int num = n.nextInt();
		
		System.out.println("Sum of first given Natural numbers:"+nSum(num));
		
		n.close();

	}

}
