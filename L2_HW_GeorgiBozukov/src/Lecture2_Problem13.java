import java.util.Scanner;
public class Lecture2_Problem13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a temperature between -100 and 100 Celsius:");
        int temp = sc.nextInt();
        if (temp<-100 || temp>100){
            System.out.println("Please respect the conditions! Restart me!");
            return;
        }
        //Freezing cold
        if (temp<-20){
            System.out.println("It's FREEZING cold!!!");
        }
        //Cold
        if (temp>=-20 && temp<0){
            System.out.println("It is cold!");
        }
        //Chilly
        if (temp>=0 && temp<15){
            System.out.println("It is chilly.");
        }
        //Warm
        if (temp>=15 && temp<=25){
            System.out.println("It is warm.");
        }
        //Hot
        if (temp>25){
            System.out.println("It is HOT!!!");
        }
    }
}
