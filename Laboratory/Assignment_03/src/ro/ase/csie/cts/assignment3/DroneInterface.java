package ro.ase.csie.cts.assignment3;

public interface DroneInterface {
	
	//gets drone camera video stream
	public void getCameraStream();
	public void turnAuxiliaryLightOn();
	public void moveToLocation(float longitude, float latitude);
	
	public void moveUp();
	public void moveDown();
	public void moveLeft();
	public void moveRight();

}
