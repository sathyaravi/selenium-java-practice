package mockprep.javabasics;

public class BasicInOut {

	public static void main(String[] args) {

//		        Scanner scan = new Scanner(System.in);
//		       
//		        int i = scan.nextInt();
//		        double d = scan.nextDouble();
//		        scan.nextLine();
//		        String t = scan.nextLine();
//		        
//
//		        System.out.println("String: " + t);
//		        System.out.println("Double: " + d);
//		        System.out.println("Int: " + i);
//		        
		        String s ="sun";
		        
		        
		        
		        String b = "flower";
		      
		        s.toLowerCase();
		        System.out.println(s.substring(0,1).toUpperCase()+s.substring(1)+" "+b.substring(0,1).toUpperCase()+b.substring(1));
		        
		        
		        int [] num = {12,35,1,10,34,35};
		        
		        int max = Integer.MIN_VALUE;
		        
		        int second_max = Integer.MIN_VALUE;
		        
		        for(int i=0;i<num.length;i++) {
		        	
		        	if(num[i]>max) {
		        		
		        		second_max=max;
		        		max=num[i];
		        	}
		        	else if (num[i]>second_max && num[i]!=max) {
		        		second_max=num[i];
		        	}
		        	
		        	
		        }
		        
		        if(second_max==Integer.MIN_VALUE) {
		        	
		        	System.out.println(-1);
		        }
		        else  {
		        	 System.out.println(second_max);
		        }
		        
		       
		    }
		

	}


