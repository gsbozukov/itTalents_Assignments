import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text1;
        String text2;

        //Verification of limit of 40 characters per word
        do {
            System.out.println("Please enter your first word with 40" +
                    " or less characters and press ENTER:");
            text1 = sc.nextLine();
            System.out.println("Please enter your second word with 40" +
                    " or less characters and press ENTER:");
            text2 = sc.nextLine();
        }
        while (text1.length()>40 || text2.length()>40 );

        //Creating uppercase and lower case
        String UpperText1 = text1.toUpperCase();
        String LowerText1 = text1.toLowerCase();
        String UpperText2 = text2.toUpperCase();
        String LowerText2 = text2.toLowerCase();

        //Printing
        System.out.println(UpperText1+" "+LowerText1+" "+
                UpperText2+" "+LowerText2);
    }
}
