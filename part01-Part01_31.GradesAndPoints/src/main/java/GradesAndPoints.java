
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Give points [0-100]: ");

        int points = scan.nextInt();

        if (points > 100) {
            System.out.println("incredible!");
        } else if ((points >= 90) & (points <= 100)) {
            System.out.println("5");
        } else if ((points >= 80) & (points <= 89)) {
            System.out.println("4");
        } else if ((points >= 70) & (points <= 79)) {
            System.out.println("3");
        } else if ((points >= 60) & (points <= 69)) {
            System.out.println("2");
        } else if ((points >= 50) & (points <= 59)) {
            System.out.println("1");
        } else if ((points >= 0) & (points <= 49)) {
            System.out.println("failed");
        } else if (points < 0) {
            System.out.println("impossible!");
        } 

    }
}
