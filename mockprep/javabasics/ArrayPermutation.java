package mockprep.javabasics;

public class ArrayPermutation {

	public static void main(String[] args) {
	
		int[] array = {0,2,1,5,3,4};
;
		
		int array_size=array.length;
		
		int[] permutated_array=new int[array_size];
		for(int i=0;i<array.length;i++) {
			
			permutated_array[i]=array[array[i]];
			
		}
		
		
		for(int p:permutated_array) {
			
			System.out.print(p+" ");
		}
		
	}

}
