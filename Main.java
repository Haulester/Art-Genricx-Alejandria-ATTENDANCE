package attendance_23;

   public class Main {

	public static void main(String[] args) {
	
	
		U_2 plane = new U_2(180197, "Orange", 2131, 385);
		System.out.println("U-2 PLANE");
		plane.fly();
		System.out.println("");
		System.out.println("Color: "+ plane.color);
		System.out.println("Price:" + plane.price);
		System.out.println("Wingspan:"+ plane.wingspan);
		System.out.println("Speed: "+ plane.speed);
		plane.stop();
	
	      
	    ToyotaVios car = new ToyotaVios(31286, "Blue", 31312, "Flat");
	    System.out.println("");
	    System.out.println("ToyotaVios");
	    car.Drive();
	    System.out.println("");
	    System.out.println("Color:"+ car.color);
		System.out.println("Price:"+ car.price);
		System.out.println("Tire:"+ car.tire);
		System.out.println("Speed: "+ car.speed);
	    car.stop();
	
	
	    Fandango boat = new Fandango(12413, "Green", 9013570, "Yellow");
	    System.out.println("");
	    System.out.println("Fandango");
	    boat.Float();
	    System.out.println("");
	    System.out.println("Color:"+ boat.color);
		System.out.println("Price:"+ boat.price);
		System.out.println("Mainsail:"+ boat.mainsail);
		System.out.println("Speed: "+ boat.speed);
	    boat.stop();
	}
}
