package attendance_23;

public class Boat extends Vehicle {
   String mainsail;
   public Boat (int speed, String color, int price, String mainsail) {
		super(speed, color, price);
		this.mainsail = mainsail;
	}
	   
    public void Float() {
			   System.out.print("The boat is floating"); 
		     }
    @Override
    public void stop() {
			System.out.print("Boat is stoping"); 
		}

}