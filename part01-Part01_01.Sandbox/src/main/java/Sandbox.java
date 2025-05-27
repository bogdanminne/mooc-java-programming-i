import java.util.Arrays;
import java.util.Scanner;

public class Sandbox {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        
        System.out.print("Input a string: ");
        String a = input.nextLine();

        String[] splitted = a.split("(?!^)");

        System.out.println(Arrays.toString(splitted));

        

    }
}