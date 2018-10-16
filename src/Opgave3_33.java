import java.util.Scanner;

public class Opgave3_33 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight and price for package 1 ");
        double weight1 = input.nextDouble();
        double price1 = input.nextDouble();
        double package1 = price1 / weight1;

        System.out.print("Enter weight and price for package 2 ");
        double weight2 = input.nextDouble();
        double price2 = input.nextDouble();
        double package2 = price2 / weight2;

        if (package1 < package2) {
            System.out.print("package1 is a better choice");
        } else if (package2 < package1) {
            System.out.println("package2 is a better choice");
        }
        else{
            System.out.print("Both package have equal-value");
        }


    }
}
