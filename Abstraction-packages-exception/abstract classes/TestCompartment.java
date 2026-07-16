import java.util.Random;

abstract class Compartment {
    public abstract String notice();
}

class FirstClass extends Compartment {
    @Override
    public String notice() {
        return "Notice: Welcome to First Class Compartment";
    }
}

class Ladies extends Compartment {
    @Override
    public String notice() {
        return "Notice: Reserved for Ladies";
    }
}

class General extends Compartment {
    @Override
    public String notice() {
        return "Notice: General Compartment";
    }
}

class Luggage extends Compartment {
    @Override
    public String notice() {
        return "Notice: Luggage Compartment";
    }
}

public class TestCompartment {
    public static void main(String[] args) {

        Compartment[] compartments = new Compartment[10];
        Random random = new Random();

        for (int i = 0; i < compartments.length; i++) {

            int choice = random.nextInt(4) + 1; // 1 to 4

            switch (choice) {
                case 1:
                    compartments[i] = new FirstClass();
                    break;
                case 2:
                    compartments[i] = new Ladies();
                    break;
                case 3:
                    compartments[i] = new General();
                    break;
                case 4:
                    compartments[i] = new Luggage();
                    break;
            }
        }

        System.out.println("Compartments and Notices:");

        for (int i = 0; i < compartments.length; i++) {
            System.out.println((i + 1) + ". " + compartments[i].notice());
        }
    }
}