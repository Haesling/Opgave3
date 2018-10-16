package DanishDynamite;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double discriminant = Math.pow((b * b) - (4 * a * c), 0.5);

        if (discriminant > 0)
        {
            double r1 = (- b + discriminant) / (2 * a);
            double r2 = (- b - discriminant) / (2 * a);
            System.out.print("The equation has two roots " + r1 + "" + r2);
        }
         else if (discriminant == 0) {

            double r2 = (- b + discriminant) / (2 * a);
            System.out.print("The equation has one root " + r2);
        }

        else {

            System.out.print("The equation has on roots " + discriminant);


        }



    }
}
