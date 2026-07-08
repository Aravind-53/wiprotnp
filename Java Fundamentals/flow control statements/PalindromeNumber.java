public class PalindromeNumber {
    public static void main(String[] args) {

        int num = 110011;
        int temp = num;
        int rev = 0;

        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }

        if (num == rev)
            System.out.println(num + " is a palindrome");
        else
            System.out.println(num + " is not a palindrome");
    }
}