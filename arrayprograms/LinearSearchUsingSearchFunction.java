package arrayprograms;

public class LinearSearchUsingSearchFunction {

	public static void main(String[] args) {
		int[] arr= {1,5,8,16,25,45};
		
		int target = 16;
		
		System.out.println(searchArr(arr,target));

	}

	static int searchArr(int[] arr, int target) {
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==target) {
				
				return i;
			}
		}
		return -1;
		
		
		
	}

}
