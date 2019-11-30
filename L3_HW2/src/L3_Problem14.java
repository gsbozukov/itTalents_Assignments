import java.util.Scanner;
public class L3_Problem14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a natural number between 10 and 200:");
        int n = sc.nextInt();
        //Make sure the user respects you
        if (n<10 || n>200){
            System.out.println("Invalid entry! Restart me.");
            return;
        }
        // Loops from N -> 10 and verifies if it is divisible by 7
        for (int i=n; i>=10; i--){
            if (i%7==0){
                System.out.println(i);      //Prints them, they have to be smaller than N
            }
        }
    }
}
