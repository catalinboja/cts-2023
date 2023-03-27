package ro.ase.csie.cts.design.patterns.factory;

public class MSWord implements IDocument{

	String name;
	String charset;
	int version;
	
	public MSWord(String name, String charset, int version) {
		super();
		this.name = name;
		this.charset = charset;
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
