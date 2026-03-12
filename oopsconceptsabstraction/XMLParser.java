package oopsconceptsabstraction;

public class XMLParser extends DataParser {

	public static void main(String[] args) {
		
		XMLParser xmlObj = new XMLParser();
		
		xmlObj.convertType();
		
		xmlObj.printDoctype("xml");

	}

	@Override
	void convertType() {
		System.out.println("XML Parser.....");
		
	}

}
