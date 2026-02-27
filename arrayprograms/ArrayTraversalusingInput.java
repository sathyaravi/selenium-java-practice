package arrayprograms;

import java.util.Scanner;

public class ArrayTraversalusingInput {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the number of rows:");
		
		int row = in.nextInt();
		
		int[][] arr  = new int[row][];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the number of columns for each row:"+i+":");
			int col = in.nextInt();
			arr[i]=new int[col];
		}
		
		System.out.println("Enter the elements:");
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[i].length;j++) {
				
				arr[i][j]=in.nextInt();
			}
		}
		
		//to print the array
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				
				System.out.print(" "+arr[i][j]);
			}
			
			System.out.println();
		}
		
		in.close();
	}
	

}
