package nestedloopdrills;

public class ReverseRowsHorizontalflip {

	public static void main(String[] args) {
		
		
		int[][] arr =  {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int row=0;row<arr.length;row++) {
			
			int left = 0;
			
			int right = arr[row].length-1;
			
			while(left<right) {
				
				int temp=arr[row][left];
				
				arr[row][left]=arr[row][right];
				
				arr[row][right]=temp;
				
				left++;
				right--;
			
			}
			
			
			
		}
		
		for(int row=0;row<arr.length;row++) {
			
			for(int col=0;col<arr[0].length;col++) {
				
				System.out.print(arr[row][col]+" ");
			}
			System.out.println();
		}
		

	}

}
