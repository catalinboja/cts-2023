package ro.ase.csie.cts.design.patterns.factory;

public class BitmapImage implements IDocument{

	String name;
	int height;
	int width;
	boolean isGrayscale;
	
	
	public BitmapImage(
			String name, int height, int width, boolean grayscale) {
		super();
		this.name = name;
		this.height = height;
		this.width = width;
		this.isGrayscale = grayscale;
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void write() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

}
