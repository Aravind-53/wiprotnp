class Figure {
    void display() {
        System.out.println("Displaying Figure");
    }

    void remove() {
        System.out.println("Removing Figure");
    }
}

class Oval extends Figure {
    @Override
    void display() {
        System.out.println("Displaying Oval");
    }

    @Override
    void remove() {
        System.out.println("Removing Oval");
    }
}

class Polygon extends Figure {
    @Override
    void display() {
        System.out.println("Displaying Polygon");
    }

    @Override
    void remove() {
        System.out.println("Removing Polygon");
    }
}

class RectangleFigure extends Figure {
    @Override
    void display() {
        System.out.println("Displaying Rectangle");
    }

    @Override
    void remove() {
        System.out.println("Removing Rectangle");
    }
}

public class Assignment2 {
    public static void main(String[] args) {

        Figure f1 = new Oval();
        Figure f2 = new Polygon();
        Figure f3 = new RectangleFigure();

        f1.display();
        f1.remove();

        f2.display();
        f2.remove();

        f3.display();
        f3.remove();
    }
}