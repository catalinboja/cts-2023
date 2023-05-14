package ro.ase.csie.cts.assignment3;

public abstract class AbstractVisualObject {
	String imageFile;
	int noPixels;
	byte[] pixels;
	
	public AbstractVisualObject(String imageFile, int noPixels) {
		super();
		this.imageFile = imageFile;
		this.noPixels = noPixels;
		this.pixels = new byte[this.noPixels];
	}
	
	
	
}
