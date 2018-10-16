import java.util.Scanner;

public class Opgave3_26 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int divisible = input.nextInt();

        if ((divisible % 5 == 0) && (divisible % 6 == 0)) {
            System.out.print(divisible % 6 == 0);

        }
            if ((divisible % 5 == 0) || (divisible & 6 == 0)) {
                System.out.print(divisible + "is divisible by 5 || 6");
            }
            if (divisible % 5 == 0) ^ (divisible % 6 == 0)){
                System.out.print(divisible + " is divisble by 5 ^ 6");

            }
        }

    }
