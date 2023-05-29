package attendance_23;

public class Plane extends Vehicle {
	
	double wingspan; 
	 
	public Plane(int speed, String color, int price, int wingspan) {
		super(speed, color, price);
		this.wingspan = wingspan;
	}
	   
   public void fly() {
			   System.out.print("The plane is flying"); 
		     }
   @Override
   public void stop() {
			System.out.print("Plane is stoping"); 
		}
	}