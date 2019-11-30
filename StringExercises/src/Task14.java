import java.util.Scanner;
public class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a sentence!");
        String text = sc.nextLine();
        System.out.println("Please enter a character");
        String character = sc.next();

        System.out.println(findOccurences(text, character, 0 ,0));

    }

    public static int findOccurences (String text, String character, int i, int count){
        if (i == text.length()-1){
            return count;
        }
        char symbol = character.charAt(0);
        if (text.charAt(i) == symbol){
            count++;
        }
        return findOccurences(text, character, i+1, count);
    }

}
