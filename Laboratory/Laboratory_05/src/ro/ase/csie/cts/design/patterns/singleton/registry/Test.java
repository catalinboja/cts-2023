package ro.ase.csie.cts.design.patterns.singleton.registry;

public class Test {

	public static void main(String[] args) {
		
		IDbConnection testDb = 
				DbConnectionsRegistry.getConnection("127.0.0.1");
		
		IDbConnection testingDb = 
				DbConnectionsRegistry.getConnection("127.0.0.1");
		
		if(testDb == testingDb) {
			System.out.println("Reference the same object");
		}
		else {
			System.out.println("Different objects");
		}
	}

}
