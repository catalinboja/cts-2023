package ro.ase.csie.cts.design.patterns.singleton;

public interface ILog {
	public abstract void Error(String msg);
	public abstract void Debug(String msg);
	public abstract void Info(String msg);
}
