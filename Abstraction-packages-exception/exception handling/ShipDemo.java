class ShipCompartment {
    private int height;
    private int width;
    private int breadth;

    public ShipCompartment(int height, int width, int breadth) {
        this.height = height;
        this.width = width;
        this.breadth = breadth;
    }

    public void display() {
        System.out.println("Height : " + height);
        System.out.println("Width  : " + width);
        System.out.println("Breadth: " + breadth);
    }
}

public class ShipDemo {
    public static void main(String[] args) {
        ShipCompartment s = new ShipCompartment(10, 20, 30);
        s.display();
    }
}