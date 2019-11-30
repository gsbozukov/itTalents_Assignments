import java.util.Scanner;
public class L3_Problem16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number between [10-5555]:");
        int a = sc.nextInt();
        System.out.println("Please enter another number between [10-5555]:");
        int b = sc.nextInt();
        if (a<10||a>5555||b<10||b>5555||a==b){
            System.out.println("Invalid entry! Restart me.");
            return;
        }
        //detects smaller number and asssigns it to A
        if (a>b){
            int memory = b;
            b = a;
            a = memory;
        }
        //Loop from bigger to smaller number and detect+print if divisible by 50
        for (int i=b; i>=a; i--){
            if (i%50==0){
                System.out.print(i+", ");
                i=i-49;    //I put this to accelerate the loop once in has found the first 50, the program can work without it
            }
        }
    }
}
