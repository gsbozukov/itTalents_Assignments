import java.util.Scanner;
public class Task30 {
    public static void main(String[] args) {
        //Write a program to remove all occurrences of a given word in string
        Scanner sc = new Scanner(System.in);
        String sentence = "I love programming. I love coding";
        String toRemove = "love";

        sentence = sentence.replaceAll(toRemove, "");
        System.out.println(sentence);

    }
}
