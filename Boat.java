package attendance_23;

public class Boat extends Vehicle {
    @Override
 // Method to indicate that the Boat is running
    void run() {
        System.out.println("Boat is Floating");
    }

   
    // Method to indicate the sail color of the boat
    void sail() {
        System.out.println("Mainsail: orange");
    }

    // Method to indicate the speed of the boat
    void Speed() {
        System.out.println("Speed: 123124512mph");
    }

    // Method to indicate the color of the boat
    void Color() {
        System.out.println("Color: Violet");
    }

    // Method to indicate the price of the boat
    void Price() {
        System.out.println("Price: $192782131");
    }

    // Method to indicate the model of the boat
    void model() {
        System.out.println("Model: Fandango");
    }
}