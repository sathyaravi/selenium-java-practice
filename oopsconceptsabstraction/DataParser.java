package oopsconceptsabstraction;

public abstract class DataParser {
	
	
		abstract void convertType();
		
		public void printDoctype(String docType) {
			
			System.out.println("The document type after parsing will be:"+docType);

		}
		

}

