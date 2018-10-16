import java.util.Scanner;

public class Opgave3_12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a three-digit integers: ");
        int digit = input.nextInt();
        String number = digit + "";
        int leftToRight = digit / 100;
        int rightToLeft = digit % 10;

        if (rightToLeft == leftToRight) {
            System.out.print(number + " number is palindrome!");
        }
            else
        {
            System.out.println(number + " not is a palindrome");
        }
    }
}
