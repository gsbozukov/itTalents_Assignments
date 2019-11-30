import java.util.Scanner;
public class Task25 {
    public static void main(String[] args) {
        //using method replace a given char with another
        Scanner sc = new Scanner(System.in);
        String text = "I love Java programming!";
        //char to remove
        System.out.println("Please insert the character you want removed: ");
        String input1 = sc.next();
        String remove = input1.substring(0,1);
        System.out.println("Please insert the character you want it replaced with: ");
        String input2 = sc.next();
        String replace = input2.substring(0,1);

        System.out.println(replaceChars(text, remove, replace));

    }

    public static String replaceChars(String text, String remove, String replace){
        if (!text.contains(remove)){
            return "Your char to remove is not in the text";
        }
        text = text.replace(remove, replace);
        return text;
    }

}
