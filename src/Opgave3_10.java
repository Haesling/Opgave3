import java.util.Scanner;

public class Opgave3_10 {

    public static void main(String[] args) {

        int number1 = (int) (Math.random() * 100);
        int number2 = (int) (Math.random() * 100);

        System.out.println(number1 + " + " + number2 + " = ");
        Scanner input = new Scanner(System.in);
        int usersAnswer = input.nextInt();

        if ((number1 + number2 == usersAnswer))
            System.out.print("Correct answer");


        else
            System.out.print("Your answer should have been: " + (number1 + number2));

        }
    }

