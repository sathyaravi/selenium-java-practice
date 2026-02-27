package mockprep.javabasics;

public class MatrixMultiply {

	public static void main(String[] args) {
		
		
		/*
		 * If you have two matrices  and  (both 3×3 here), their product  is also a 3×3 matrix where:

• i	 → row index of A 
• j	 → column index of B
• k	 → iterates through elements of row i in A and column j in B */
		
		int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
		
		int[][] b = {{5,5,5},{5,5,5},{5,5,5}};
		
		int[][] c =  new int[3][3];
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<b.length;j++) {
				
				c[i][j]=0;
				
				for(int k=0;k<3;k++) {
					
					c[i][j] += a[i][k] * b[k][j];
				}
				
			}
		}
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				
				System.out.print(c[i][j] +  " ");
			}
			
		System.out.println();
		}

	}

}
