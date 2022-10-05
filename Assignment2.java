// Import libraries here
import java.util.Scanner;


public class Assignment2 {
    public static void main(String[] args) {
        int numberOfRows = 0;
        Scanner scan = new Scanner(System.in);

        //Ask for the number of rows/columns
        System.out.println ("Please enter a number.");
        numberOfRows = scan.nextInt();

        //The code below is for the top half of the diamond
                //i denotes the row number
        for(int i = 0; i < numberOfRows; i++){

                //j denotes the number of spaces before the asterisks
                for (int j = numberOfRows - 2; j>=i; j--){

                   System.out.print (" ");
             }
                //k denotes the number of asterisks in each line
                for (int k = 0; k<=i; k++){

                   System.out.printf ("* ");
             }
                System.out.println (" ");
            }


         //The code below is for the bottom half of the diamond
             for(int i = 0; i < numberOfRows; i++){

                for (int j = 1; j <= i; j++){

                   System.out.print (" ");
                }
                for (int k = 0; k < (numberOfRows-1); k++){

                   System.out.printf (" *");
                }
                System.out.println();
             }



    }
}
