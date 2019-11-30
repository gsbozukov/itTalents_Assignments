import java.util.Scanner;
public class L3_Problem13 {
    //Prints natural 3-digit numbers which digits are equal to 'n' input by user
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number between 2 and 27:");
        int n = sc.nextInt();
        if (n<2 || n>27){
            System.out.println("Invalid entry! Restart me.");
            return;
        }
        // Loop that loops all 3-digit numbers
        for (int i = 100; i<999; i++){
            //explosion of number
            int firstNum = i/100;
            int secondNum = (i-firstNum*100)/10;
            int thirdNum = (i-firstNum*100-secondNum*10);
            //If they're equal to 'n', print them
            if (firstNum+secondNum+thirdNum == n){
                System.out.println(i);
            }
        }
    }
}
