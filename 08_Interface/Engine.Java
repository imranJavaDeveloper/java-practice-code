interface Engine {
    void startEngine();
}

interface Electric extends Engine {
    void chargeBattery();
}


interface AutoPilot {
    void enableAutoPilot();
}

class TeslaModelS implements Electric, AutoPilot {
    public void startEngine() {
        System.out.println("Tesla engine started silently.");
    }

    public void chargeBattery() {
        System.out.println("Charging battery to 100%.");
    }

    public void enableAutoPilot() {
        System.out.println("Autopilot enabled.");
    }
}

public class InterfaceMultiInheritanceExample {
    public static void main(String[] args) {
        TeslaModelS car = new TeslaModelS();
        car.startEngine();       // Output: Tesla engine started silently.
        car.chargeBattery();     // Output: Charging battery to 100%.
        car.enableAutoPilot();   // Output: Autopilot enabled.
    }
}
