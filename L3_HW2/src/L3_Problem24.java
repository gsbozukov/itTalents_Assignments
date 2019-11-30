import java.util.Scanner;
public class L3_Problem24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a natural number between 10 and 30 000:");
        int input = sc.nextInt();
        if (input<10 || input>30000){
            System.out.println("Invalid entry! Restart me.");
            return;
        }
        boolean isPalindrom = true;
        int frontDiv;
        int backDiv = 1;

        //Checking the size of the number
        if (input<=99){
            frontDiv = 10;
        }
        else {
            if (input<=999){
                frontDiv = 100;
            }
            else {
                if (input<=9999){
                    frontDiv = 1000;
                }
                else {
                    frontDiv = 10000;
                }
            }
        }
        int backResult = input;                 //this will be chipped from the back
        int frontResult = input/frontDiv;       //this one is chipped from the front

        do {
            if (frontResult != backResult%10){
                isPalindrom = false;
                break;
            }
            backDiv = backDiv*10;
            backResult = backResult/backDiv;                            //always divide with an additional 10
            frontDiv = frontDiv/10;
            frontResult = (input - frontResult*frontDiv*10)/frontDiv;   //formula for that removes the first integer
        }
        while (frontDiv>backDiv);                                       // makes sure to stop when the front chipping is equal to the back chipping
        if (isPalindrom){
            System.out.println(input+" Is a palindrome!");
        }
        else {
            System.out.println(input+" Is not a palindrome.");
        }
    }
}
