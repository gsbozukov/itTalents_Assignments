import java.util.Scanner;
public class Task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a sentence!");
        String text = sc.nextLine();
        System.out.println("Please enter a character");
        String character = sc.next();

        findOccurences(text, character, 0);

    }

    public static void findOccurences (String text, String character, int i){
        if (i == text.length()-1){
            return;
        }
        char symbol = character.charAt(0);
        if (text.charAt(i) == symbol){
            System.out.print(i+" ");
        }
        findOccurences(text, character, i+1);
    }
}
