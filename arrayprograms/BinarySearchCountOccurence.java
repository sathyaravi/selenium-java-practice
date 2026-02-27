package arrayprograms;

public class BinarySearchCountOccurence {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,3,3,3,3,4,5};
		
		int target = 3;
		
		
		
		System.out.println(countOccurrence(arr,target));
	}

	static int countOccurrence(int[] arr, int target) {
		
		int first = firstOccurrence(arr, target);
	    
		if (first == -1) return 0; // target not found

	    int last = lastOccurrence(arr, target);

	    return last - first + 1;

	}
	static int firstOccurrence(int[] arr, int target) {
		int result=-1;
		
		int left =0;
		
		int right = arr.length-1;
		
		while(left<=right) {
			
			int mid = left + (right-left)/2;
			
			if(arr[mid]==target) {
				
				result=mid; //store the index
				
				right=mid-1;//to move to left to find the previous occurrences
			}
			
			else if(arr[mid]<target) {
				
				left = mid + 1;//if the mid value is less than target move to the right
			}
			
			else {
				
				right = mid - 1 ;
			}
		}
		return result;
		
	
	}
	static int lastOccurrence(int[] arr, int target) {
		
		int result=-1;
		
		int left =0;
		
		int right = arr.length-1;
		
		while(left<=right) {
			
			int mid = left + (right-left)/2;
			
			if(arr[mid]==target) {
				
				result=mid; //store the index
				
				left=mid+1;//to move to right
			}
			
			else if(arr[mid]<target) {
				
				left = mid + 1;//if the mid value is less than target move to the right
			}
			
			else {
				
				right = mid - 1 ;
			}
		}
		return result;
		
	}
	
	
}
