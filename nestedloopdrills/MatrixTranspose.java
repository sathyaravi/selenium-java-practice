package nestedloopdrills;

public class MatrixTranspose {

	public static void main(String[] args) {
		
		
		int [][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		
		
		int rows = arr.length;
		
		int cols = arr[0].length;
		
		int [][] tranpose_matrix = new int [cols][rows];
		
		
		for(int col=0;col<arr[0].length;col++) {
			
			for(int row=0;row<arr.length;row++) {
				
				tranpose_matrix[col][row]=arr[row][col];
				
			}
		}
		
		
		for(int i=0;i<tranpose_matrix.length;i++) {
			
			for(int j=0;j<tranpose_matrix[0].length;j++) {
				
				System.out.print(tranpose_matrix[i][j]+" ");
			}
			
			System.out.println();
		}
	}

}
