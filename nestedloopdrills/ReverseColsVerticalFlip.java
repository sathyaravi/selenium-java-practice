package nestedloopdrills;

public class ReverseColsVerticalFlip {

	public static void main(String[] args) {
		
		int[][] arr =  {{1,2,3},{4,5,6},{7,8,9}};
		
		
			
			int top =0;
			int bottom = arr.length-1;
			
			while(top<bottom) {
				
				for(int col=0;col<arr[0].length;col++) {
				
				int temp = arr[top][col];
				arr[top][col]=arr[bottom][col];
				arr[bottom][col]=temp;
				
			}
				top++;
				bottom--;
			
			}
			
			for(int row=0;row<arr.length;row++) {
				
				for(int col=0;col<arr[0].length;col++) {
					
					System.out.print(arr[row][col]+" ");
				}
				System.out.println();
			}
	}

}
