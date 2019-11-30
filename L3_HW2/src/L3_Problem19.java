import java.util.Scanner;
public class L3_Problem19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //User enters integer
        System.out.println("Please enter an integer between 10 and 99:");
        int n = sc.nextInt();
        //Validate entry
        if (n<10 || n>99){
            System.out.println("Invalid entry! Restart me.");
            return;
        }
        while (n>1){
            //Checking if even
            if (n%2==0){
                n = n/2;
                System.out.print(n+", ");
            }
            else {
                n = n*3+1;
                System.out.print(n+", ");
            }
        }
    }
}
