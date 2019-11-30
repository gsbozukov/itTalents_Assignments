import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a line of text with spaces and characters and press Enter:");
        String text = sc.nextLine();
        //Array created, words separated by space
        String [] wordByWord = text.split(" ");

        //Finding the biggest word
        int longest = -1;
        for (int i = 0; i < wordByWord.length; i++) {
            if (wordByWord[i].length()>longest){
                longest = wordByWord[i].length();
            }
        }

        //Printing results
        System.out.println("Your sentence has "+wordByWord.length+
                " words and the longest word has "+longest+" chars.");
    }
}
