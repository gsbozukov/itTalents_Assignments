import java.util.Scanner;
public class L3_Problem21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //User enters integer
        System.out.println("Please enter a card (integer) between 1 and 51:");
        int n = sc.nextInt();
        //Validate entry
        if (n<1 || n>51){
            System.out.println("Invalid entry! Restart me.");
            return;
        }

        while (n<=52) {
            int color = (n-1)%4;
            int card = (n-1)/4;


            switch (card) {
                case 0:
                    System.out.print("2 of ");
                    break;
                case 1:
                    System.out.print("3 of ");
                    break;
                case 2:
                    System.out.print("4 of ");
                    break;
                case 3:
                    System.out.print("5 of ");
                    break;
                case 4:
                    System.out.print("6 of ");
                    break;
                case 5:
                    System.out.print("7 of ");
                    break;
                case 6:
                    System.out.print("8 of ");
                    break;
                case 7:
                    System.out.print("9 of ");
                    break;
                case 8:
                    System.out.print("10 of ");
                    break;
                case 9:
                    System.out.print("Jack of ");
                    break;
                case 10:
                    System.out.print("Queen of ");
                    break;
                case 11:
                    System.out.print("King of ");
                    break;
                case 12:
                    System.out.print("Ace of ");
                    break;
            }

            switch (color) {
                case 0:
                    System.out.print("Clubs");
                    break;
                case 1:
                    System.out.print("Diamonds");
                    break;
                case 2:
                    System.out.print("Hearts");
                    break;
                case 3:
                    System.out.print("Spades");
                    break;
            }
            System.out.println();
            n++;
        }
    }
}

