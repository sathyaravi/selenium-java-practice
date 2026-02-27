package javaprograms;

public class ArrayLoopdrill {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		
		//to print elements from an array
		//using enhanced loop
		
		for(int i:arr) {
			
			System.out.print(i+" ");
		}
		
		System.out.println();
		//print alternate elements
		for(int i=0;i<arr.length;i=i+2) {
			
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		//print the total sum
		
		int totalSum=0;
		for(int i:arr) {
			
			totalSum +=i;
		}
		System.out.println("Total Sum:"+totalSum);
		
		
	}

}
