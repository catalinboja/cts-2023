package ro.ase.csie.cts.singleton;

public class TestSingleton {
	
	public static void main(String[] args) {
	
	DBConnection connection1 = 
			DBConnection.getDbConnection(
					"127.0.0.1", "CTS", "user", "1234");
	DBConnection connection2 = 
			DBConnection.getDbConnection(
					"127.0.0.1", "CTS", "user", "1234");
	
	DBConnection connection3 = 
			DBConnection.getDbConnection(
					"127.0.0.1", "OOP", "user", "1234");
	}
}
