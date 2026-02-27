package arrayprograms;

public class MaximumElementintheArray {

	public static void main(String[] args) {
		
		int[] arr = {1,5,18,35,7,6};
		int[] arr1 = {1,6,45,7,3,2};
		
		System.out.println("Maximum number in the array:"+max(arr));
		
		System.out.println("Maximum number in the range:"+maxRange(arr1,1,3));
		System.out.println("Maximum number in the range:"+maxRange(arr1,0,2));
		System.out.println("Maximum number in the range:"+maxRange(arr1,4,5));
		

	}

	static int maxRange(int[] arr1, int start, int end) {
		
		
		if (arr1 == null || arr1.length == 0) {
            return -1;
        }
		
		if (start < 0 || end >= arr1.length || start > end) {
            return -1;  // invalid range
        }
		
				
		int maxRangeNum=arr1[start];
		
		for(int i=start;i<=end;i++) {
			
			if(arr1[i]>maxRangeNum) {
				
				maxRangeNum=arr1[i];
			}
		}
		return maxRangeNum;
		
		
		
	}

	static int max(int[] arr) {
		
		int maxNum = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>maxNum) {
				
				maxNum=arr[i];
			}
		}
		
		return maxNum;
		
	}

}
