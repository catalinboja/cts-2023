package ro.ase.csie.cts.assignment3;

public interface DroneOpsInterface {

	public void gotToLocation(float longitude, float latitude);
	
	public void increaseAltitude();
	public void lowerAltitude();
	public void left(float distance);
	public void right(float distance);
}
