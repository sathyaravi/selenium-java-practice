package oopsconceptsabstraction;

public class Parser extends DataParser {

	public static void main(String[] args) {
		
		
		Parser parseObj = new Parser();
		
		parseObj.convertType();
		
		parseObj.printDoctype("JSON");
	

	}

	@Override
	void convertType() {
		System.out.println("Document will be parsed into JSON");
		
	}

}
