import java.util.Scanner;
public class L3_Problem25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //User enters integer
        System.out.println("Please enter an integer between 1 and 20:");
        int n = sc.nextInt();
        //Validate entry
        if (n < 1 || n > 20) {
            System.out.println("Invalid entry! Restart me.");
            return;
        }
        long result = 1L;
        int i = 1;

        do {
            result = result*i;
            i++;
        }
        while (i<=n);
        System.out.println(result);
    }
}
