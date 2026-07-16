abstract class Vehicle {
    String modelName;
    String registrationNumber;
    String ownerName;

    Vehicle(String modelName, String registrationNumber, String ownerName) {
        this.modelName = modelName;
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
    }

    public String getModelName() {
        return modelName;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }
}

class Logan extends Vehicle {
    int speed;

    Logan(String modelName, String registrationNumber, String ownerName, int speed) {
        super(modelName, registrationNumber, ownerName);
        this.speed = speed;
    }

    public int speed() {
        return speed;
    }

    public int gps() {
        System.out.println("GPS Facility Available");
        return 1;
    }
}

class Ford extends Vehicle {
    int speed;

    Ford(String modelName, String registrationNumber, String ownerName, int speed) {
        super(modelName, registrationNumber, ownerName);
        this.speed = speed;
    }

    public int speed() {
        return speed;
    }

    public int tempControl() {
        System.out.println("Air Conditioning Facility Available");
        return 1;
    }
}

public class VehicleTest {
    public static void main(String[] args) {

        Logan l = new Logan("Logan", "AP01AB1234", "Aravind", 100);

        System.out.println("Logan Details");
        System.out.println("Model: " + l.getModelName());
        System.out.println("Reg No: " + l.getRegistrationNumber());
        System.out.println("Owner: " + l.getOwnerName());
        System.out.println("Speed: " + l.speed());
        l.gps();

        System.out.println();

        Ford f = new Ford("Ford", "AP02CD5678", "Kumar", 120);

        System.out.println("Ford Details");
        System.out.println("Model: " + f.getModelName());
        System.out.println("Reg No: " + f.getRegistrationNumber());
        System.out.println("Owner: " + f.getOwnerName());
        System.out.println("Speed: " + f.speed());
        f.tempControl();
    }
}