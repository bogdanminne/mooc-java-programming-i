
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = "";

        while (true) {
            String input = scanner.nextLine();

            text += input + " ";

            if (input.equals("")) {
                break;
            }
        }

        String[] split = text.split(" ");

        for (int i = 0; i < split.length; i++) {
            if (split[i].contains("av")) {
                System.out.println(split[i]);
            }
        }

    }
}
