package mockprep.javabasics;

public class ShuffletheArray {

	public static void main(String[] args) {
		
		int num1[] = {1,2,3,4,2,4,5,1};
		
		int n = 4;
		
		int left = 0;
		
		int right=n;
		
		int index = 0;
		
		int ans[] =new int[num1.length];
		
		
		while(left<n && right<2*n) {	
		
		
			ans[index++]=num1[left++];
			
			ans[index++]=num1[right++];
	
			
		}
			
		
		
		for(int num:ans) {
			
			System.out.print(num+" ");
		}

	}

}
