
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here

        System.out.print("Where to? ");
        int whereTo = scanner.nextInt();

        System.out.print("Where from? ");
        int whereFrom = scanner.nextInt();

        for (int i = whereFrom; i <= whereTo; i++) {
            System.out.println(i);

            if (whereTo < whereFrom) {
                break;
            }
        }



    }
}
