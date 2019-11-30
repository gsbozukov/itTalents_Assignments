import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a sentence!");
        String text = sc.nextLine();
        System.out.println("Please enter a character");
        String character = sc.next();

        int index = text.indexOf(character.charAt(0));

        if (index== -1){
            System.out.println("Your sentence does not contain the character: "+character.charAt(0));
        }
        else {
            System.out.println("It can be found at: " + index);
        }
    }
}
