package attendance_23;

   public class Main {
    public static void main(String[] args) {
        // Creating an instance of the Vehicle class
        Vehicle vehicle = new Vehicle();

      // Creating an instance of the Car class        
        Car car = new Car();

      
      // Creating an instance of the Plane class
     Plane plane = new Plane();


      // Creating an instance of the Boat class
        Boat boat = new Boat();

        // Calling methods on the Vehicle instance
        vehicle.run();

       // Calling methods on the Car instance

        car.model();
        car.run();
        car.tires();
        car.Color();
        car.Speed();
        car.Price();
        car.stop();

      // Calling methods on the Plane instance
         plane.model();
         plane.run();
         plane.wing();
         plane.Color();
         plane.Speed();
         plane.Price();
         plane.stop();


     // Calling methods on the Boat instance
        boat.model();
        boat.run();
        boat.sail();
        boat.Color();
        boat.Speed();
        boat.Price();
        boat.stop();
 }
}
