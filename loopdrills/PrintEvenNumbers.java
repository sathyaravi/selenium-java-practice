package loopdrills;

public class PrintEvenNumbers {

	public static void main(String[] args) { 
		
		int num=20;
		System.out.println("Even Numbers:");
		for(int i=0;i<num;i++) {
			
			if(i%2==0) {
				
				System.out.print(i+" ");
			}
		}
		
		System.out.println();
		
		System.out.println("Odd Numbers:");
		
		for(int i=0;i<num;i++) {
			
			if(i%2!=0) {
				
				System.out.print(i+" ");
			}
		}

	}

}
