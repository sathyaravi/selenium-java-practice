package nestedloopdrills;

public class PrintRowSumandColsum {

	public static void main(String[] args) {
		
		int [][] arr= {{10,10,10},{5,5,5},{20,20,20}};
		
		for(int col=0;col<arr[0].length;col++) {
			
			int colSum = 0;
			
			for(int row=0;row<arr.length;row++) {
				
				colSum += arr[row][col];
			}
			
			System.out.println("Column " + col + " sum = " + colSum);

		}
		
		for(int row=0;row<arr.length;row++) {
			
			int rowSum=0;
			
			for(int col=0;col<arr[row].length;col++) {
				
				
				
				rowSum += arr[row][col];
			
			}
			
			 System.out.println("Row " + row + " sum = " + rowSum);

			
			
		}
		

	}

}
