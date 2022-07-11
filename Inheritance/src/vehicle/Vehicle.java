package vehicle;

public class Vehicle {                  //          Parent Class
	String color;
    private int maxSpeed;
	
	public void print() {
		System.out.println("Vehicle color:"+ color);
		System.out.println("Vehicle Speed:" + maxSpeed);
	}
	
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	

}
