package javaprograms;

public class MaxandMinElement {

	public static void main(String[] args) {
	
		int [] arr = {3, 5, 4, 9, 1};
		
		int min = arr[0];
		
		int max = arr[0];
		//Iterative approach
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]<min) {
				
				min = arr[i];
			}
			if(arr[i]>max) {
				
				max = arr[i];
			}
		}

		System.out.println("Minimum element of the array:"+min);
		
		System.out.println("Maximum element of the array:"+max);
	}

}
