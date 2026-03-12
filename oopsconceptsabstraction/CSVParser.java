package oopsconceptsabstraction;

public class CSVParser extends DataParser {

	public static void main(String[] args) {
		
		
		CSVParser csvObj = new CSVParser();
		
		csvObj.convertType();
		
		csvObj.printDoctype("CSV");

	}

	@Override
	void convertType() {
		System.out.println("CSV Parser....");
	}

}
