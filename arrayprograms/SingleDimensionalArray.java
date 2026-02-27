package arrayprograms;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		
		//to find the length of an array
		
		int len = arr.length;
		
		int n=0;
		
		//to traverse the array
		
		//using for loop
		
		for(int i=0;i<len;i++) {
			
			
			System.out.println(arr[i]);
		}
		
		//using while loop
		
		while(n<len) {
			
			System.out.println("Printed using while:"+arr[n]);
			
			n++;
		}
		
		//using for each
		for(int x:arr){
			
			System.out.println("Using foreach:"+x);		
			
	
		}
		
		//using do while
		int j=0;
		do {
			
			System.out.println("printed using do while:"+arr[j]);
			j++;
		}while(j<len);
	}

}
