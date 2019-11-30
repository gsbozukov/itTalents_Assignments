import java.util.Scanner;
public class Lecture2_Problem11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a 3-digit natural number (must not contain a zero):");
        int input = sc.nextInt();

        int firstNum = input/100;
        int secondNum = (input-firstNum*100)/10;
        int thirdNum = (input-firstNum*100-secondNum*10);

        if(firstNum==0 || secondNum==0 || thirdNum==0 || input>999 || input<100){
            System.out.println("You had to disregard the rules, didn't you? Restart me!");
            return;
        }
        if(input%firstNum==0){
            System.out.println(input+" is divisible by "+firstNum+", the result is: "+(input/firstNum));
        }
        else {
            System.out.println(input+" is not divisible by "+firstNum);
        }
        if(input%secondNum==0){
            System.out.println(input+" is divisible by "+secondNum+", the result is: "+(input/secondNum));
        }
        else {
            System.out.println(input+" is not divisible by "+secondNum);
        }
        if(input%thirdNum==0){
            System.out.println(input+" is divisible by "+thirdNum+", the result is: "+(input/thirdNum));
        }
        else {
            System.out.println(input+" is not divisible by "+thirdNum);
        }
    }
}
