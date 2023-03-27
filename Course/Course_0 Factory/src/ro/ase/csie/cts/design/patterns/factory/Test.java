package ro.ase.csie.cts.design.patterns.factory;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IDocument pdf = new AdobePdf("Doc.pdf", true, "12");
		
		IDocument bitmap = new BitmapImage("Logo.bmp", 36, 36, true);
		
		pdf = DocumentFactory.getDocument(
				DocumentType.ADOBE, "Doc.pdf");
		bitmap = DocumentFactory.getDocument(
				DocumentType.BITMAP, "Logo.bmp");
	
	}

}
