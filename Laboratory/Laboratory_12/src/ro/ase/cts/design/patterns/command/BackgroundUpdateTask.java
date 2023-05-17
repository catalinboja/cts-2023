package ro.ase.cts.design.patterns.command;

public class BackgroundUpdateTask implements BackgroundTaskInterface{
	
	int hoursInterval;
	String serverIP;
	
	UpdateService service;
	
	
	public BackgroundUpdateTask(int hoursInterval, String serverIP, UpdateService service) {
		super();
		this.hoursInterval = hoursInterval;
		this.serverIP = serverIP;
		this.service = service;
	}


	@Override
	public void doTask() {
		this.service.doUpdate(this.serverIP);
	}
	
	

}
