// Define the Flyable interface
interface Flyable {
    void fly_obj();
}

// Implement the Flyable interface in the Spacecraft class
class Spacecraft implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("Spacecraft is flying in space.");
    }
}

// Implement the Flyable interface in the Airplane class
class Airplane implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("Airplane is flying in the sky.");
    }
}

// Implement the Flyable interface in the Helicopter class
class Helicopter implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("Helicopter is hovering in the air.");
    }
}

public class FlyableDemo {
    public static void main(String[] args) {
        // Create instances of each class
        Spacecraft spacecraft = new Spacecraft();
        Airplane airplane = new Airplane();
        Helicopter helicopter = new Helicopter();

        // Call the fly_obj() method for each instance
        spacecraft.fly_obj();
        airplane.fly_obj();
        helicopter.fly_obj();
    }
}

