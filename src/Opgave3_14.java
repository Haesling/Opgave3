import java.util.Scanner;

public class Opgave3_14 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int coin = (int) (Math.random() * 10) % 2;
        System.out.print("Enter 0 or 1: ");
        int guess = input.nextInt();

        if (coin == guess) {
            System.out.print("Correct: Result: " + coin);
        }
        else{

            System.out.print("Incorrect: Result " + coin);

        }
    }

}
