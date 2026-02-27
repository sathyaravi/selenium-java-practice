package mockprep.javabasics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FindLargestNumber {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter numbers");
		
		String numbers = s.nextLine();
		
		String[] nums = numbers.split("\\s+");
		
		int[] num_list = new int[nums.length];
		
		for(int i =0;i<nums.length;i++) {
			
			num_list[i]=Integer.parseInt(nums[i]);
			
		}
		
		List <Integer> array_list=new ArrayList<Integer>();
		for(int n:num_list) {
			
						
			System.out.println(n);
			
			array_list.add(n);
			
		}
		
		//to find the largestnumber

		Collections.sort(array_list);
		
		
		
		System.out.println("Sorted Array:"+array_list);
		
		System.out.println("Largest number in the array:"+array_list.get((array_list.size()-1)));
		
		s.close();

	}

}
