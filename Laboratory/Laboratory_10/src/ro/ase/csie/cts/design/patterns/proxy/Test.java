package ro.ase.csie.cts.design.patterns.proxy;

public class Test {

	public static void main(String[] args) {
		
		AbstractChatServerClient chatServer = new ChatServerClient();
		
		chatServer.sendMessage("Luke", "Vader is coming. He will hit you");
		chatServer.sendMessageToAll("Run for your life");
		
		chatServer = new ChatServerFilterProxy(chatServer);
		
		chatServer.sendMessage("Luke", "Vader is coming. He will hit you");
		chatServer.sendMessageToAll("Run for your life");
		
	}

}
