import java.util.Scanner;

public class LastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        boolean result = (a % 10) == (b % 10);

        System.out.println(result);

        sc.close();
    }
}