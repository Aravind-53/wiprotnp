class FoodItem {
    String name;
    String taste;
    String size;

    FoodItem(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    void consume() {
        System.out.println(name + " tastes " + taste);
    }
}

class Mango extends FoodItem {
    Mango() {
        super("Mango", "Sweet", "Medium");
    }

    @Override
    void consume() {
        System.out.println("Mango tastes Sweet");
    }
}

class Lemon extends FoodItem {
    Lemon() {
        super("Lemon", "Sour", "Small");
    }

    @Override
    void consume() {
        System.out.println("Lemon tastes Sour");
    }
}

public class Assignment1 {
    public static void main(String[] args) {
        Mango m = new Mango();
        Lemon l = new Lemon();

        m.consume();
        l.consume();
    }
}