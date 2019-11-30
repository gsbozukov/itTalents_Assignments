import java.util.Scanner;

public class L3_Problem11a {
    //Make a triangle with user input n
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a positive integer:");
        int n = sc.nextInt();
        //Verify if it is possible to execute
        if (n<1){
            System.out.println("Invalid entry! Restart me.");
            return;
        }
        //Number of rows
        for (int rows = 1; rows<=n; rows++){
            //Dealing with spaces
            for (int spaces = n-rows; spaces >= 0; spaces--){
                System.out.print(" ");
            }
            //Dealing with stars
            for (int stars = 1; stars <= (2*rows-1); stars++){
                System.out.print("*");
            }
            System.out.println();               //Enter for new line
        }
    }
}
