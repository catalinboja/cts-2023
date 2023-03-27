package ro.ase.csie.cts.singleton;

public class DBConnection {
	String ip;
	String schema;
	String user;
	String pass;
	
	private static DBConnection theOne = null;
	
	private DBConnection(String ip, String schema, String user, String pass) {
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
	
	public static DBConnection getDbConnection(
			String ip,
			String schema,
			String user,
			String pass
			) {
		if(theOne == null) {
			theOne = new DBConnection(ip, schema, user, pass);
		}
		return theOne;
	}
	
}
