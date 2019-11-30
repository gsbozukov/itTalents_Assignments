import java.util.Scanner;
public class L3_Problem8 {
    //By using user entered N, make the shown table in HW L3 - problem 8
    public static void main(String[] args) {
        //Reading and validating input
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a positive integer greater than 0:");
        int n = sc.nextInt();
        if (n<1){
            System.out.println("Respect the conditions! Restart me!");
            return;
        }
        //Dealing with rows - n = number of rows and times we repeat the command
        int numbers = n-1;              //Initializing the first number of the first row
        for (int rows = 1; rows <= n; rows++){
            // Dealing with columns - n = number of columns
            for (int columns = 1; columns <= n; columns++ ){
                System.out.print(numbers+" ");
            }
            numbers += 2;               //increments the numbers on the next row with 2
            System.out.println();       //Next line
        }
    }
}
