package ro.ase.csie.cts.design.patterns.singleton;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class LogService implements ILog{
	
	String fileName;
	File file;
	PrintWriter writer;
	
	private static LogService logger;
	
	private LogService() {
		
	}
	
	private LogService(String fileName) throws IOException {
		super();
		this.fileName = fileName;
		this.file = new File(fileName);
		if(!this.file.exists())
			this.file.createNewFile();
		this.writer = new PrintWriter(this.file);
	}
	
	public static ILog getLogger() throws IOException {
		//we get the name of the log file from settings
		
		if(logger == null) {
			logger = new LogService("logs.txt");
		}
		
		return logger;
	}

	@Override
	public void Error(String msg) {
		writer.write(
				String.format("*ERROR*: %s \n", msg));
		writer.flush();
	}

	@Override
	public void Debug(String msg) {
		writer.write(
				String.format("Debug: %s \n", msg));
		writer.flush();
	}

	@Override
	public void Info(String msg) {
		writer.write(
				String.format("Info: %s \n", msg));
		writer.flush();
	}

}
