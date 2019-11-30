import java.util.Scanner;
public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a word without spaces and press Enter:");
        String word = sc.next();
        //loop the whole word and add 5 to each ASCII code,
        // transform to number and print the char interpretation

        String result = "";
        for (int i = 0; i < word.length(); i++) {
            //taking each symbol of the original, saving it to a char
            char symbol = word.charAt(i);
            //adding 5 to the ASCII char number and getting a certain numerical
            int numerical = symbol+5;
            //keep adding the new chars (transformed from their numerical value) to a new string
            result = result + (char)numerical;
        }
        System.out.println(result);
    }
}
