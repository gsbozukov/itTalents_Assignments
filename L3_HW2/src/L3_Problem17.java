import java.util.Scanner;
public class L3_Problem17 {
    //Make a square with user input n
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a positive integer between 3 and 20:");
        int n = sc.nextInt();
        System.out.println("Please enter your desired character:");
        char ch = sc.next().charAt(0);

        //Verify if it is possible to execute
        if (n<3||n>20){
            System.out.println("Invalid entry! Restart me.");
            return;
        }
        //Number of rows
        for (int rows = 1; rows<=n; rows++){
            //Dealing with stars
            // if it is the first or last rows, the problem stays the same
            if (rows == 1 || rows == n){
                for (int stars = 1; stars <= n; stars++){
                    System.out.print("*");
                }
            }
            //otherwise we add mid spaces
            else {
                System.out.print("*");
                for (int midchar = 1; midchar <= (n-2); midchar++){
                    System.out.print(ch);
                }
                System.out.print("*");
            }
            System.out.println();               //Enter for new line
        }
    }
}
