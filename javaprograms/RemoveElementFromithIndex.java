package javaprograms;

public class RemoveElementFromithIndex {

	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,5,6,7,8,9,10};
		
		int remove_index = 3;
		
		int[] result_array = new int[9];
		
		//remove the element from the given index in the array
		
		for(int i=0,j=0;i<arr.length;i++) {
			
			if(i!=remove_index) {
				
				result_array[j++] = arr[i];
				
			}
		}
		
		System.out.println("The Original array:");
		for(int a : arr) {
			
			System.out.print(a+" ");
		}
		System.out.println();
		System.out.println("New Resultant array:");
		for(int n : result_array) {
			
			System.out.print(n+" ");
		}

	}

}
