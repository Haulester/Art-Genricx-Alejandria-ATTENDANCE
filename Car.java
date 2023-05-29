package attendance_23;

public class Car extends Vehicle {
	@Override
	// Method to indicate that the Car is running
	void run() {
  
		System.out.println("Car is Driving"); 
  }
	
	void tires() {
		  System.out.println("Tires:Flat"); 
		  }
	// Method to indicate the speed of the Car
	void Speed() {
		   System.out.println("Speed:23492384mph");
	}
	// Method to indicate the color of the Plane
	void Color() {
		   System.out.println("Color:green");
	}
	// Method to indicate the price of the Plane
	void Price() {
		   System.out.println("Price:$100000000");
	}
	// Method to indicate the model of the Plane
	void model() {
	   System.out.println("Toyota-VIOS");
}	
}