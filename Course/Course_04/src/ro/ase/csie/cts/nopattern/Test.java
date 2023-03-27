package ro.ase.csie.cts.nopattern;

public class Test {
	
	public static void main(String[] args) {
		
		DBConnection connection1 = 
				new DBConnection(
						"127.0.0.1", "CTS", "user", "1234");
		//later...
		DBConnection connection2 = 
				new DBConnection(
						"127.0.0.1", "CTS", "user", "1234");
	}

}
