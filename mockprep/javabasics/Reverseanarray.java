package mockprep.javabasics;

import java.util.Arrays;

public class Reverseanarray {

	public static void main(String[] args) {
		int [] arr = {1, 4, 3, 2, 6, 5};
		
		int n=arr.length;
		
		int left = 0;
		
		int right=n-1;
		
		while(left<right) {
			
			int temp = arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
		}
		System.out.println(Arrays.toString(arr));

	}

}
