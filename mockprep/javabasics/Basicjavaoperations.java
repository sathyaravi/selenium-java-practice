package mockprep.javabasics;

import java.util.Scanner;

public class Basicjavaoperations {

	public static void main(String[] args) {
		
		
		for (int i = 1; i <= 3; i++) {
			System.out.println(i);
		    for (int j = 1; j <= 2; j++) {
		    	System.out.println(j);
		        System.out.print(i + "," + j);
		        System.out.println(" ");
		    }
		}
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number of rows:");
		
		int row  = s.nextInt();
		
		System.out.println("Enter the number of columns:");
		
		int col = s.nextInt();
		
		int [][] arr = new int [row][col];
		
		System.out.println("Enter the numbers:");
		
		for(int i=0;i<row;i++) {
			
			for(int j=0;j<col;j++) {
				
				arr[i][j]=s.nextInt();
				
				
			}
		}
		
		System.out.println("Elements of the array:");
		for(int i=0;i<row;i++) {
			
			for(int j=0;j<col;j++) {
			
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
		}
		
		s.close();
		
	}

}
