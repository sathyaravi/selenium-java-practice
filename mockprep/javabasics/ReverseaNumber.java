package mockprep.javabasics;

public class ReverseaNumber {
	static int reversed_num=0;
	static int reverse_func(int num) {
			
		
		while(num!=0) {
			
			int rem=num%10;
			
			reversed_num=reversed_num*10+rem;
			
			num=num/10;
			
		}
		
		return reversed_num;
		
	}
	
	public static void main(String[] args) {
		
		
		int n = 123456;
		
		System.out.println(reverse_func(n));
		
		
	}

}
