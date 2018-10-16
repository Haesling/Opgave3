import java.util.Scanner;

public class Opgave3_32 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter three points p0, p1 and p2: ");
        double x0 = input.nextDouble();
        double y0 = input.nextDouble();
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double condition = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);

        if (condition > 0) {
            System.out.print("p2 is on the left side of the line ");
        } else if (condition == 0) {
            System.out.print("p2 is on the same line ");
        } else {
            System.out.print("p2 is on the right side of the line ");

        }

    }

}
