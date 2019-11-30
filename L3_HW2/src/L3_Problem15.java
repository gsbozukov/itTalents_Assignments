import java.util.Scanner;
public class L3_Problem15 {
    //Sum of all numbers between 1 and N
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //User enters integer
        System.out.println("Please enter an integer greater than 1:");
        int a = sc.nextInt();
        int sum = 0;
        int i = 0;
        //Validate entry
        if (a<1){
            System.out.println("Invalid entry! Restart me.");
            return;
        }
        //Loop from 1 to a - and keep summing - using do-while
        do {
            sum = sum + i;
            i++;
        }
        while (i<=a);
        System.out.println("The sum is "+sum);
    }
}
