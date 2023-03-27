package ro.ase.csie.cts.design.patterns.singleton.registry;

import java.util.HashMap;

public class DbConnectionsRegistry implements IDbConnection {

	private static HashMap<String, IDbConnection> connections =
			new HashMap<>();
	
	private DbConnectionsRegistry() {
		
	}
	
	public static IDbConnection getConnection(String ip) {
		IDbConnection connection = connections.get(ip);
		if(connection == null) {
			connection = new DbConnectionsRegistry();
			connections.put(ip, connection);
		}
		return connection;
	}

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void query() {
		// TODO Auto-generated method stub
		
	}
	
}
