package chap06.sec08;

public class DriverEx {

	public static void main(String[] args) {
		new DriverEx().controller();;
	}
	
	public void controller() {
		Driver driver = new Driver();
		
		Taxi taxi = new Taxi();
		driver.drive(taxi);
		driver.drive(new Bus(15));
	}
}
