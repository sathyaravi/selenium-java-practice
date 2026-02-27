package arrayprograms;
/*Linear search is ideal when the array is unsorted or small.
It runs in O(n) time because we check each element sequentially.
If the array is large and sorted, binary search is a better choice.”
*/
public class LinearSearchin2DArray {

	public static void main(String[] args) {
		
		int[][] arr= {{1,2,3},{9,10,15},{25,30,35}};
		
		
		int target = 15;
		
		int[] result = search2DArray(arr, target);
		if (result[0] != -1) {
		    System.out.println("Found at Row: " + result[0] + ", Col: " + result[1]);
		} else {
		    System.out.println("Element not found");
		}


		

	}

	 static int[] search2DArray(int[][] arr, int target) {
		 
		 for(int i=0;i<arr.length;i++) {
			 
			 for(int j=0;j<arr[i].length;j++) {
				 
				 if (arr[i][j]==target) {
					 
					 return  new int[] {i,j};
				 }
			 }
		 }
		
		 return new int[] {-1,-1};
		
	}

}
