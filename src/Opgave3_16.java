import java.util.Scanner;

public class Opgave3_16 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x = (int) (Math.random() * 51 * 2 - 50);
        int y = (int) (Math.random() * 101 * 2 -100);
        System.out.print("Random  rectangle cordinates: (" + x + "," + y +"), ");

    }
}
