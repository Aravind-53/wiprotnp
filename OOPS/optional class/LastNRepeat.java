import java.util.Scanner;

public class LastNRepeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int n = sc.nextInt();

        String end = str.substring(str.length() - n);

        String result = "";

        for (int i = 0; i < n; i++) {
            result += end;
        }

        System.out.println(result);

        sc.close();
    }
}