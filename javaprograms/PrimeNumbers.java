package javaprograms;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		//print prime numbers less than 100
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the number to print prime numbers:");
		
		int n = in.nextInt();
		
		
		for(int i=2;i<=n;i++) {
			
			boolean isPrime=true;
			
			//to check if the current number is divisible by the number from 2 to any given number
			
			for(int j=2;j<=Math.sqrt(i);j++) {
				
				if(i%j==0) {
					
					isPrime=false;
					break;
				}
			}
			if(isPrime) {
			System.out.print(i+" ");
			}
		}
		
		in.close();
	}

}
