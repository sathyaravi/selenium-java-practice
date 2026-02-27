package arrayprograms;

import java.util.Arrays;

public class ReversetheArray {

	public static void main(String[] args) {
		
		int[] arr = {1,3,8,25,18,7};
		
		int start = 0;
		
		int end = arr.length-1;
		
		while(start<end) {
			
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
