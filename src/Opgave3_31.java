
import java.util.Scanner;

public class Opgave3_31 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the exchange rate from dollars to RMB: ");
        double currency = input.nextDouble();
        System.out.print("Enter the type of exchange 0 or 1 ");
        double exchange = input.nextDouble();

        if (exchange == 0)
            System.out.print(currency * 100);
        else {
            System.out.print(currency / 100);
        }


    }
}

