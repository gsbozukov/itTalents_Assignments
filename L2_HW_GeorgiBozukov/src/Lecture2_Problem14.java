import java.util.Scanner;
public class Lecture2_Problem14 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.println("Please enter first X coordinate (1-8)");
        int x1 = cs.nextInt();
        System.out.println("Please enter first Y coordinate (1-8)");
        int y1 = cs.nextInt();
        System.out.println("Please enter second X coordinate (1-8)");
        int x2 = cs.nextInt();
        System.out.println("Please enter second Y coordinate (1-8)");
        int y2 = cs.nextInt();

        if (x1<1 || x1>8 || x2<1 || x2>8 || y1<1 || y1>8 || y2<1 || y2>8){
            System.out.println("Please respect the conditions. Restart me!");
            return;
        }

        // Case when both coordinates are even or odd
        //EVEN
        if (x1%2==0 && y1%2==0){
            if (x2%2==0 && y2%2==0){
                System.out.println("They are the same color!");
            }
            else {
                if (x2 % 2 != 0 && y2 % 2 != 0) {
                    System.out.println("They are the same color!");
                } else {
                    System.out.println("They are different colors!");
                }
            }
        }
        //ODD
        if (x1%2!=0 && y1%2!=0){
            if (x2%2==0 && y2%2==0){
                System.out.println("They are the same color!");
            }
            else {
                if (x2 % 2 != 0 && y2 % 2 != 0) {
                    System.out.println("They are the same color!");
                }
                else {
                    System.out.println("They are different colors!");
                }
            }

        }
        // Case when one coordinate is even, the other one odd

        if (x1%2==0 ^ y1%2==0){
            if (x2%2==0 ^ y2%2==0){
                System.out.println("They are the same color!");
            }
            else {
                System.out.println("They are different colors!");
            }
        }
    }
}
