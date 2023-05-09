package ro.ase.csie.cts.design.patterns.observer;

public class AutoReconnectModule implements ConnectionStatusInterface{

	@Override
	public void connectionUpdate(boolean isConnected) {
		if(!isConnected) {
			System.out.println("Reconnecting in .... 10 seconds");
		}
	}

}
