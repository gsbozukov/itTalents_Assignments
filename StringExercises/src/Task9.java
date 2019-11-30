import java.util.Scanner;
public class Task9 {
    public static void main(String[] args) {
        //write a program that counts the number of words in a sentence
        Scanner sc = new Scanner (System.in);
        System.out.println("Please enter a sentence:");
        String sentence = sc.nextLine();
        System.out.println(numberOfWords(sentence));


    }

    public static int numberOfWords(String sentence){
        String [] words = sentence.split(" ");
        return words.length;
    }

}
