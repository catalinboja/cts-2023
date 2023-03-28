package ro.ase.csie.cts.design.patterns.factory;

public class DocumentFactory {
	public static IDocument getDocument(DocumentType type, String filename) {
		switch (type) {
		case ADOBE:
			return new AdobePdf(filename, false, "10");
		case MSWORD:
			return new MSWord(filename, "UTF8", 12);
		case BITMAP:
			return new BitmapImage(filename, 100, 100, false);
		default:
			throw new UnsupportedOperationException();
		}
	}
}
