interface Vehicle {
    void start();  // Abstract method

    // Default method
    default void fuelType() {
        System.out.println("Runs on Petrol or Diesel");
    }

    // Static method
    static void serviceReminder() {
        System.out.println("Service every 6 months");
    }
}


class Car implements Vehicle {
    public void start() {
        System.out.println("Car starts with key");
    }
}


public class DefaultMethodExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();        // Output: Car starts with key
        myCar.fuelType();     // Output: Runs on Petrol or Diesel

        Vehicle.serviceReminder(); // Output: Service every 6 months
    }
}
