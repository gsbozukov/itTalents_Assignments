import java.util.Scanner;
public class Lecture2_Problem16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a 3-digit natural number:");
        int input = sc.nextInt();
        if (input<100 || input>999){
            System.out.println("Invalid entry! Restart me.");
            return;
        }

        int firstNum = input / 100;
        int secondNum = (input - firstNum * 100) / 10;
        int thirdNum = (input - firstNum * 100 - secondNum * 10);

        if (firstNum == secondNum && secondNum == thirdNum) {
            System.out.println("The numbers are equal!");
        }
        else {
            if (firstNum > secondNum && secondNum > thirdNum) {
                System.out.println("The numbers are in a descending order!");
            }
            else {
                if (firstNum < secondNum && secondNum < thirdNum) {
                    System.out.println("The numbers are in an ascending order!");
                }
                else {
                    System.out.println("The numbers are not in any particular order.");
                }
            }
        }
    }
}
