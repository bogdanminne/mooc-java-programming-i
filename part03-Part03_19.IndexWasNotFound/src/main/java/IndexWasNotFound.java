

import java.util.Scanner;

public class IndexWasNotFound {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        array[0] = 6;
        array[1] = 2;
        array[2] = 8;
        array[3] = 1;
        array[4] = 3;
        array[5] = 0;
        array[6] = 9;
        array[7] = 7;

        System.out.print("Search for? ");
        int searching = Integer.valueOf(scanner.nextLine());

        // Implement the search functionality here

        
        boolean found = false;

        // while (indece < array.length) {
        //     if (array[indece] == searching) {
        //         flag = true;
        //     } 
            
        //     else if (array[indece] != searching) {flag = false;}

        //     if (flag == true) {System.out.println(searching + " is at index " + indece);}
        //     else {System.out.println(searching + " was not found.");}
            

        //     indece += 1;
        // }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == searching) {
                    found = true;
            System.out.println(searching + " is at index " + i + ".");
            break; // Exit the loop early since we've found the number
       }}

       if (!found) {System.out.println(searching + " was not found.");}

        }

}

