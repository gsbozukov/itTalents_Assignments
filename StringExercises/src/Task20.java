import java.util.Scanner;
public class Task20 {
    public static void main(String[] args) {
        String text = "I Love Programming";
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a char you want to remove");
        String input = sc.next();
        //Making sure to take only the first chart
        String check = input.substring(0,1);
        StringBuilder newText = new StringBuilder(text);

        if (newText.lastIndexOf(check) == -1){
            System.out.println("Your char: "+check+" is not in the sentence");
        }
        else {
            newText.deleteCharAt(newText.lastIndexOf(check));
            System.out.println(newText);
        }



    }
}
