import java.util.Scanner;

public class L3_Problem6 {
    public static void main(String[] args) {
        //Read number from console 'n' and add all numbers from 1 to n
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an integer greater than 1:");
        int n = sc.nextInt();
        int sum=0;
        // Verify entry
        if (n<=1){
            System.out.println("Respect the conditions! Restart me!");
            return;
        }
        for (int i=1; i<=n; i++){
            sum = sum + i;
        }
        System.out.println("The result is: "+sum);
    }
}
