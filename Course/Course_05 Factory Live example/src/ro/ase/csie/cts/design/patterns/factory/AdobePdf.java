package ro.ase.csie.cts.design.patterns.factory;

public class AdobePdf implements IDocument{

	
	String name;
	boolean allowsAnnotations;
	String version;
	
	
	
	public AdobePdf(String name, 
			boolean allowsAnnotations,
			String version) {
		super();
		this.name = name;
		this.allowsAnnotations = allowsAnnotations;
		this.version = version;
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
