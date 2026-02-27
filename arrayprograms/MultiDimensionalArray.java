package arrayprograms;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		
		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		
		int row = arr.length;
		
		
		
		for(int i=0;i<row;i++ ) {
			
			for(int j=0;j<arr[i].length;j++) {
				
				System.out.print(" "+arr[i][j]);
			}
			System.out.println();
		}

	}

}
