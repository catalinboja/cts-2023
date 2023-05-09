package ro.ase.csie.cts.design.patterns.observer;

public class Test {

	public static void main(String[] args) {
		
		GameServerConnection gameServerConnection = new 
				GameServerConnection();
		
		
		UserNotificationModule uiNotifications = new UserNotificationModule();
		AutoSaveModule autosave = new AutoSaveModule();
		AutoReconnectModule autoReconnect = new AutoReconnectModule();
		
		gameServerConnection.connectionStatusChanged();
		
		gameServerConnection.registerConnectionHandler(uiNotifications);
		gameServerConnection.registerConnectionHandler(autoReconnect);
		gameServerConnection.registerConnectionHandler(autosave);
		
		gameServerConnection.connectionStatusChanged();
		
		gameServerConnection.unregisterConnectionHandler(autosave);
		
		gameServerConnection.connectionStatusChanged();
		
		gameServerConnection.registerConnectionHandler(new ConnectionStatusInterface() {
			
			@Override
			public void connectionUpdate(boolean isConnected) {
				System.out.println("Extra job !");
				
			}
		});
		
		gameServerConnection.connectionStatusChanged();
		
	}

}

