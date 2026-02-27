package arrayprograms;

public class DiagonalSumofMatrix {

	public static void main(String[] args) {
		
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		
		int primaryDiagonalSum=0;
		
		int secondaryDiagonalSum=0;
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[i].length;j++) {
				
				if(i==j) {
					
					primaryDiagonalSum+=arr[i][j];
				}
				
				
				
			}
		}
		
		System.out.println("PrimaryDiagonalSum:"+primaryDiagonalSum);
		
		for(int j=0;j<arr.length;j++) {
			
			secondaryDiagonalSum+=arr[j][arr[j].length-1-j];
			
		}
		
		System.out.println("Secondary Diagonal Sum:"+secondaryDiagonalSum);

	}

}
