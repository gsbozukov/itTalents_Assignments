import java.util.Scanner;
public class Task23 {
    public static void main(String[] args) {
        //Write a sentence, user inputs which char  he wants to remove
        Scanner sc = new Scanner(System.in);
        String text = "Wassup big boyyyy";
        System.out.println("Please enter the char you want to remove");
        String input = sc.next();
        char check = input.charAt(0);
        System.out.println("Please enter the char you want to replace it with");
        String replace = sc.next();
        String rep = replace.substring(0,1);

        StringBuilder newText = new StringBuilder(text);
        boolean charNotFound = true;
        for (int i = 0; i < newText.length(); i++) {
            if (newText.charAt(i) == check){
                newText.replace(i, i+1, rep);
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
