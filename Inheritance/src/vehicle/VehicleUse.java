package vehicle;

public class VehicleUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v = new Vehicle();
		v.color = "Black";
		v.setMaxSpeed(20);
		v.print();
		
		Car c = new Car();
		c.numGears = 10;
		c.color = "Blue";
		c.setMaxSpeed(200);
		c.print();
		c.printCar();

	}

}
