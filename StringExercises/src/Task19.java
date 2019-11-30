import java.util.Scanner;
public class Task19 {
    public static void main(String[] args) {
        //Write a sentence, user inputs which char  he wants to remove
        Scanner sc = new Scanner(System.in);
        String text = "Wassup big boyyyy";
        System.out.println("Please enter the char you want to remove");
        String input = sc.next();
        char check = input.charAt(0);

        StringBuilder newText = new StringBuilder("Wassup big boyyyy");
        boolean charNotFound = true;
        for (int i = 0; i < newText.length(); i++) {
            if (newText.charAt(i) == check){
                newText.deleteCharAt(i);
                charNotFound = false;
                break;
            }
        }
        if (charNotFound){
            System.out.println("Your char: "+check+" is not in the sentence.");
        }
        else {
            System.out.println(newText);
        }

    }
}
