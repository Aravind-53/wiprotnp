import java.util.Arrays;

public class arrays{
    public static void main(String[] args) {

        int arr[] = {10, 5, 20, 8, 30, 2};

        Arrays.sort(arr);

        System.out.println("Smallest numbers: "
                + arr[0] + " " + arr[1]);

        System.out.println("Largest numbers: "
                + arr[arr.length - 1] + " "
                + arr[arr.length - 2]);
    }
}