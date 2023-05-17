package ro.ase.cts.design.patterns.command;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<BackgroundTaskInterface> backgroundTasks = 
				new ArrayList<>();
		
		backgroundTasks.add(
				new BackgroundUpdateTask(1, "127.0.0.1", new UpdateService()));
		backgroundTasks.add(
				new BackgroundUpdateTask(3, "10.0.0.1", new UpdateService()));
		
		backgroundTasks.get(0).doTask();
		backgroundTasks.remove(0);

	}

}
