import java.util.Scanner;

public class RepeatTwoChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        String firstTwo = str.substring(0, 2);
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            result += firstTwo;
        }

        System.out.println(result);

        sc.close();
    }
}