package nestedloopdrills;

public class PrintDiagonals {

	public static void main(String[] args) {
		
		int [][] arr= {{1,3,5},{7,8,9},{11,15,17}};
		
		System.out.println("Primary Diagonal:");
		for(int row=0;row<arr.length;row++) {
			
			for(int col=0;col<arr[row].length;col++) {
				
				if(row==col) {
					
					System.out.print(arr[row][col]+" ");
					
				}
			
				
			}
			
		}
		
		System.out.println();
		System.out.println("Secondary Diagonal:");
			for(int row=0;row<arr.length;row++) {
				
				for(int col=0;col<arr[row].length;col++) {
					
					if (row + col == arr.length - 1) {
					    System.out.print(arr[row][col] + " ");
					}
				
					
				}
			
		}
		

	}

}
