package mockprep.javabasics;

import java.util.Arrays;

public class ConcatenationOfArrays {

	public static void main(String[] args) {
	
		int nums [] = {1,2,3,1};
		
		int n = nums.length;
		
		int [] ans = new int[n*2];
		
		for(int i=0;i<ans.length;i++) {
					
			ans[i]=nums[i%nums.length];
		}
		
		System.out.println(Arrays.toString(ans));
		
	}

}

