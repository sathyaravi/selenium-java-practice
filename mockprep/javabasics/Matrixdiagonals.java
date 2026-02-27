package mockprep.javabasics;

public class Matrixdiagonals {

	public static void main(String[] args) {
		
		
		
		int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
		
		//main diagonal = a[i][i]
		for(int i=0;i<a.length;i++) {
							
				System.out.print(a[i][i]+  " ");
			
			System.out.println();
		}
		
		//secondary diagonal = a[j][n-1-j]- n a.length
		for(int j=0;j<a.length;j++) {
			
			System.out.print(a[j][a.length-1-j]+  " ");
		
		System.out.println();
	}

	}

}
