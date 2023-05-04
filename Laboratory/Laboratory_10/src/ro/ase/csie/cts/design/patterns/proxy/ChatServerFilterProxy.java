package ro.ase.csie.cts.design.patterns.proxy;

import java.util.ArrayList;

public class ChatServerFilterProxy extends AbstractChatServerClient{
	
	AbstractChatServerClient chatServer;
	
	ArrayList<String> forbiddenWordsList = new ArrayList<String>();
	
	
	public ChatServerFilterProxy(AbstractChatServerClient chatServer) {
		super();
		this.chatServer = chatServer;
		this.forbiddenWordsList.add("hate");
		this.forbiddenWordsList.add("hit");
	}

	@Override
	public void sendMessage(String username, String msg) {
		for(String word : this.forbiddenWordsList) {
			if(msg.toLowerCase().contains(word)) {
				return;
			}
		}
		this.chatServer.sendMessage(username, msg);
	}

	@Override
	public void sendMessageToAll(String msg) {
		for(String word : this.forbiddenWordsList) {
			if(msg.toLowerCase().contains(word)) {
				return;
			}
		}
		this.chatServer.sendMessageToAll(msg);
	}

	@Override
	public void getMessagesForUser(String username) {
		this.chatServer.getMessagesForUser(username);
	}

}
