import java.util.Scanner;

public class L3_Problem7 {
    //Starting from 3, print the first 'n' numbers divisible by 3. Answer should be printed with ','
    public static void main(String[] args) {
        //Input from user and validation of entry
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an integer greater than 0:");
        int n = sc.nextInt();
        if (n<=0){
            System.out.println("Respect the conditions! Restart me.");
            return;
        }
        for (int i = 3; i <= 3*n; i+=3){
            //In order to eliminate the annoying ',' if the user enters 1 or at the end of the sequence.
            if (n==1 || i==3*n){
                System.out.print(i);
            }
            else {
                System.out.print(i + ", ");
            }
        }

    }
}
