package ro.ase.csie.cts.nopattern;

public class DBConnection {
	String ip;
	String schema;
	String user;
	String pass;
	
	public DBConnection(String ip, String schema, String user, String pass) {
		super();
		this.ip = ip;
		this.schema = schema;
		this.user = user;
		this.pass = pass;
		
		this.connect();
	}
	
	public void connect() {
		System.out.println("Connect to "+ schema);
	}
	
	
}
