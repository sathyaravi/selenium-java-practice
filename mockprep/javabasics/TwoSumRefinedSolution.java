package mockprep.javabasics;

import java.util.HashMap;
import java.util.Map;

public class TwoSumRefinedSolution {

	public static void main(String[] args) {
		
		int[] nums = {3,2,4};
		
		int target =6;
		
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int i=0;i<nums.length;i++) {
			
			int complement = target-nums[i];
			
			if(map.containsKey(complement)) {
				
				System.out.println(map.get(complement)+","+i);
				return;
			}
			
			map.put(nums[i], i);
		}
		

	}

}
