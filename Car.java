package attendance_23;

public class Car extends Vehicle {
	
	String tire;
	
	public Car (int speed, String color, int price, String tire) {
		super(speed, color, price);
		this.tire = tire;
	}
	   
     public void Drive() {
			   System.out.print("The car is Driving"); 
		     }
    @Override
     public void stop() {
			System.out.print("Car is stoping"); 
		}
}