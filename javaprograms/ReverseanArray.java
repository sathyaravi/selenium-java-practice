package javaprograms;

public class ReverseanArray {

	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,5,6};
		
		reverse(arr);
		
		 for (int i = 0; i < arr.length; i++) 
			 
			 
	            System.out.print(arr[i] + " ");
	    }
		

	
	static void reverse(int[] arr) {
		
		int[] temp = new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			
			temp[i] = arr[arr.length-i-1];
		}
		
		for(int i=0;i<temp.length;i++) {
			
			arr[i]=temp[i];
		}

	}

}



