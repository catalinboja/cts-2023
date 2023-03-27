package ro.ase.csie.cts.design.patterns.singleton;

import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
			
		//ILog logger = new LogService("logs.txt");	
		
		ILog logger = LogService.getLogger();
		logger.Debug("Testing Singleton ");
		logger.Info("The end");
		
		//ILog log = new LogService("myLogs.txt");
		ILog log = LogService.getLogger();
		log.Info("A different log file");
		
		//ILog newLogger = new LogService("logs.txt");
		ILog newLogger = LogService.getLogger();
		newLogger.Info("Another one");
		
		logger.Info("The end again");
		
		System.out.println("End of example");
	}

}
