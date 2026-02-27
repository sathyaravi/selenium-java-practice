package javaprograms;

public class MatrixSearch {

	public static void main(String[] args) {
		int[][] arr = {{1,60,5,7},{10,11,16,20},{23,30,34,3}};
		
		int target = 3;
				
		boolean targetFound = false;
		int row = -1;int col = -1;
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[i].length;j++) {
				
				if(arr[i][j]==target) {
					
					targetFound = true;
					row = i;
					col = j;
					break;
				}
				
				
			
				}
			if(targetFound) {
				
				break;
			}
				
			}
		
		if(targetFound) {
			
			System.out.println("Target found at the location:"+row+" "+col);
		}
		
		else {
			
			System.out.println("Target not found");
		}
		
		}
		
		
	}


