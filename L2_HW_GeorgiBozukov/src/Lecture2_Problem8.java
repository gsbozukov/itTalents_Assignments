import java.util.Scanner;
public class Lecture2_Problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a positive four-digit number:");
        int input = sc.nextInt();
        int first = input/1000;
        int second = (input-first*1000)/100;
        int third = (input-first*1000-second*100)/10;
        int fourth = (input-first*1000-second*100-third*10);

        int number1 = first*10+fourth;
        int number2 = second*10+third;

        if (input>9999 || input<1000){
            System.out.println("Invalid entry! Restart me.");
            return;
        }

        if (number1<number2){
            System.out.println("The first number is smaller than the second: "+number1+ " < "+number2);
        }
        if (number1>number2){
            System.out.println("The first number is larger than the second: "+number1+ " > "+number2);
        }
        if (number1==number2){
            System.out.println("The first number is equal to the second: "+number1+ " = "+number2);
        }
    }
}
