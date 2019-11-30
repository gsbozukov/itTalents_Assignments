import java.util.Scanner;
public class L3_Problem22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //User enters integer
        System.out.println("Please enter an integer between 1 and 999:");
        int n = sc.nextInt();
        //Validate entry
        if (n<1 || n>999){
            System.out.println("Invalid entry! Restart me.");
            return;
        }
        n++;                //Incrementing entry by one to start with next number as requested by problem
        int counter = 1;    //Counter shows the 10th number retrieved

        while (counter<=10){
            if (n%2==0 || n%3==0 || n%5==0 ){
                System.out.println(counter+" : "+n);
                counter++;
            }
            n++;
        }
    }
}
