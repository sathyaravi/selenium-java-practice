package arrayprograms;

public class MatrixTranspose {

	public static void main(String[] args) {
		
		int[][] arr1= {{1,2,3},{4,5,6},{7,8,9}};
		
		int[][] transposematrix = new int [3][3];
		
		for(int i=0;i<arr1.length;i++) {
			
			for(int j=0;j<arr1[i].length;j++) {
				
				transposematrix[j][i]=arr1[i][j];
			}
		}
		
		System.out.println("Transpose matrix:");
		for(int i=0;i<arr1.length;i++) {
			
			for(int j=0;j<arr1[i].length;j++) {
				
				System.out.print(" "+transposematrix[i][j]);
			}
			
			System.out.println();
		}
		
	}

}
