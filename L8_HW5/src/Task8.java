import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a line of text without spaces and press Enter:");
        String text = sc.next();
        boolean isPalindrome = true;        //flag
        //We verify if the first half is the same as the second
        for (int i = 0; i <= (text.length()/2); i++) {
            if (text.charAt(i) != text.charAt(text.length()-(i+1))){
                isPalindrome = false;
                break;
            }
        }
        //Print results
        System.out.println(isPalindrome? "It is a palindrome!" : "Nope, it is not a palindrome.");
    }
}
