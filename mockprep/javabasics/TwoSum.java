package mockprep.javabasics;

import java.util.ArrayList;
import java.util.List;

public class TwoSum {

	public static void main(String[] args) {
		int[] nums = {};
		int target =6;
		int n = nums.length;
		List <Integer> sum_list = new ArrayList <Integer>();
		if (n>1) {
		
		for(int i=0;i<nums.length-1;i++){
			if(nums[i]+nums[i+1]==target){//this only checks the neighbours not the possible pair
				
				sum_list.add(i);
				sum_list.add(i+1);
				
			}
		}
		System.out.println(sum_list);//no early exit - problem statement states that only one possible pair exist.

	}
		
/****	
 * 
 * These checks are not required the problem statement said that length of the array >=2	
		if(n==1) {
			
			if(nums[0]==target) {
				sum_list.add(0);
			}
			System.out.println(sum_list);
		}
		
		if(n==0) {
			System.out.println(sum_list);
		}
	*********/	

}

}