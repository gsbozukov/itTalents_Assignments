import java.util.Scanner;
public class Task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a sentence!");
        String text = sc.nextLine();
        System.out.println("Please enter a character");
        String character = sc.next();

        int lastIndex = text.lastIndexOf(character.charAt(0));

        if (lastIndex == -1){
            System.out.println("Your sentence doesnt contain the char: "+ character.charAt(0));
        }
        else {
            System.out.println(lastIndex);
        }

    }
}
