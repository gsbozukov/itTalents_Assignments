import java.util.Scanner;
public class Lecture2_Problem15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a time of the day between 0 and 24:");
        int time = sc.nextInt();
        if (time<0 || time>24){
            System.out.println("Please respect the conditions! Restart me!");
            return;
        }
        //Good evening
        if (time>18 || time<4){
            System.out.println("Good evening!");
        }
        //Good morning
        if (time>=4 && time<9){
            System.out.println("Good morning!");
        }
        //Good day
        if (time>=9 && time<=18){
            System.out.println("Good day!");
        }
    }
}
