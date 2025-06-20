
import java.util.ArrayList;
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        ArrayList<String> array = new ArrayList<String>();

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {break;}

            array.add(input);

        }









    

       

        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }


    }
}
