package loopdrills;

public class PrintcharsAtoZZtoA {

	public static void main(String[] args) {
		
		System.out.println("Printing characters from A to Z:");
		for(char c='A'; c <='Z';c++) {
			
			System.out.print(c+" ");
		}
		
		System.out.println();
		System.out.println("Printing characters from Z to A:");
		
		for(char ch='Z';ch>='A';ch--) {
			
			System.out.print(ch+" ");
		}
	}

}
