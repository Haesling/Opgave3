import java.util.Scanner;

public class Opgave3_6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds ");
        double weightInpounds = input.nextDouble();
        System.out.print("Enter feet");
        double heightInfeet = input.nextDouble();
        System.out.print("Enter inches ");
        double heightInInches = input.nextDouble();

        double convertKilogramTopounds = 0.45359237;
        double convertInchesToMeters = 0.0254;

        double weightInkilograms = weightInpounds * convertKilogramTopounds;
        double convertHeightToMeter = (heightInfeet * 12) + heightInInches * convertInchesToMeters;

        double BMI = weightInkilograms / (convertInchesToMeters * convertInchesToMeters);

        System.out.println("BMI is " + BMI);
        if (BMI < 18.5) {
            System.out.println("Underweight");
        }
        else if (BMI < 25) {
            System.out.println("Normal");
        }
        else if (BMI < 30) {
            System.out.print("Overweight");
        }
        else
        System.out.println("obese");

    }
}
