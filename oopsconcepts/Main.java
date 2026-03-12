package oopsconcepts;

public class Main {

	public static void main(String[] args) {
		
		DocumentProcessor dObj;
		
		dObj = new PDFDocument();
		
		dObj.convertdocumentType();
		
		dObj = new WordDocument();
		
		dObj.convertdocumentType();
		
		dObj = new ExcelDocument();
		
		dObj.convertdocumentType();
	}

}
