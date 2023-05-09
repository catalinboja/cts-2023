package ro.ase.csie.cts.design.patterns.observer;

import java.util.ArrayList;
import java.util.Random;

public class GameServerConnection {
	
	ArrayList<ConnectionStatusInterface> connectionHandlers = 
			new ArrayList<>();
	
	public void registerConnectionHandler(ConnectionStatusInterface monitor) {
		this.connectionHandlers.add(monitor);
	}
	
	public void unregisterConnectionHandler(ConnectionStatusInterface monitor) {
		this.connectionHandlers.remove(monitor);
	}
	
	//event starter 
	public void connectionStatusChanged() {
		//generate a random status and notify observers
		Random random = new Random();
		boolean isConnected = random.nextBoolean();
		
		for(ConnectionStatusInterface monitor : connectionHandlers) {
			monitor.connectionUpdate(isConnected);
		}
	}
	
}
