package arrayprograms;

public class BinarySearch1 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,3,4,5};
		
		int target = 3;
		
		System.out.println(firstOccurenceSearch(arr,target));

	}

	static int firstOccurenceSearch(int[] arr, int target) {
		
		int result =  -1;
		
		int left = 0;
		
		int right = arr.length-1;
		
		while(left<=right) {
			
			int mid = left  + (right-left)/2;
			
			if(arr[mid]==target) {
				
				result =  mid; //store the index
				
				right = mid - 1;//move to left to find any previous occurence of the object
			}
			else if (arr[mid]<target) {
				
				left = mid+1;//If the mid is less than target move to the right
				
			}
			
			else {
				
				right=mid-1;//if the mid is greater than target move to the left
			}
		}
		
		return result; //return the index
	}

}
