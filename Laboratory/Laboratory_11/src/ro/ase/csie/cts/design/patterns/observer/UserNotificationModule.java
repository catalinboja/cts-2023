package ro.ase.csie.cts.design.patterns.observer;

public class UserNotificationModule implements ConnectionStatusInterface{

	@Override
	public void connectionUpdate(boolean isConnected) {
		System.out.println("Connection status: " + 
				(isConnected ? "connected" : "disconnected"));
	}

}
