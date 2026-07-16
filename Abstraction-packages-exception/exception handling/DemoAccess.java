
class Foundation {
    int var2 = 20;
    protected int var3 = 30;
    public int var4 = 40;
}

public class DemoAccess {
    public static void main(String[] args) {

        Foundation f = new Foundation();

        // Accessible within the same package
        // System.out.println(f.var1); // Error: private

        System.out.println("var2 = " + f.var2);
        System.out.println("var3 = " + f.var3);
        System.out.println("var4 = " + f.var4);
    }
}