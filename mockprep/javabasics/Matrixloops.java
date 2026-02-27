package mockprep.javabasics;

import java.util.ArrayList;
import java.util.List;

public class Matrixloops {

	public static void main(String[] args) {

		int[][] a= {{1,2,3}, {4,5,6},{7,8,9}};
		List<Integer> row_wise_sum = new ArrayList<Integer>();
		List<Integer> col_wise_sum = new ArrayList<Integer>();
		
		
				//row wise sum
				for(int i=0;i<a.length;i++){
					int row =0;
					for(int j=0;j<a[i].length;j++){
						
							System.out.print(a[i][j]+" ");
							row += a[i][j];
							
						}
					row_wise_sum.add(row);	
					System.out.println();
					
				}
				//col wise sum
				for(int j=0;j<a[0].length;j++){
					int col =0;
					for(int i=0;i<a.length;i++){
						col += a[i][j];
					}
					
				col_wise_sum.add(col);
				System.out.println();
			
				}
			
				System.out.println("The sum of all elements in a row:"+row_wise_sum);
				System.out.println("The sum of all elements in a column:"+col_wise_sum);

}
}
