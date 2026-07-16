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

class Hero extends Vehicle {
    int speed;

    Hero(String modelName, String registrationNumber, String ownerName, int speed) {
        super(modelName, registrationNumber, ownerName);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void radio() {
        System.out.println("Radio Facility Available");
    }
}

class Honda extends Vehicle {
    int speed;

    Honda(String modelName, String registrationNumber, String ownerName, int speed) {
        super(modelName, registrationNumber, ownerName);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void cdplayer() {
        System.out.println("CD Player Facility Available");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {

        Hero h = new Hero("Splendor", "AP01AB1234", "Aravind", 80);

        System.out.println("Hero Details");
        System.out.println("Model: " + h.getModelName());
        System.out.println("Registration No: " + h.getRegistrationNumber());
        System.out.println("Owner: " + h.getOwnerName());
        System.out.println("Speed: " + h.getSpeed());
        h.radio();

        System.out.println();

        Honda c = new Honda("City", "AP02CD5678", "Kumar", 120);

        System.out.println("Honda Details");
        System.out.println("Model: " + c.getModelName());
        System.out.println("Registration No: " + c.getRegistrationNumber());
        System.out.println("Owner: " + c.getOwnerName());
        System.out.println("Speed: " + c.getSpeed());
        c.cdplayer();
    }
}