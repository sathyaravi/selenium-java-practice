package oopsconceptsConstructorChaining;

public class CalculateArea {
	
	
	public final float PI = 3.14f;
	
	public CalculateArea() {
		
		System.out.println("Default Area...");
		
	}
	
	
	
	public CalculateArea(int r) {
		
		
		this();
		
		System.out.println("Area of the circle will be:"+ PI*r*r);
		
		
	}
	
	
	public CalculateArea(int length,int breadth) {
		
		
		this(breadth);
		
		System.out.println("Perimeter of the rectangle will be:"+ 2*(length+breadth));
		
		
	}
	
	
	public static void main(String[] args) {
		
		CalculateArea cObj = new CalculateArea(2,2);
		
		System.out.println("The value of PI:"+cObj.PI);
		
		
	
	}
	
	

}
