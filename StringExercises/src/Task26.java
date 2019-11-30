import java.util.Scanner;
public class Task26 {
    public static void main(String[] args) {
        //Program to find the first occurrence of a word in a string, return position (index +1)
        Scanner sc = new Scanner(System.in);
        String sentence = "I Java love Java Java programming!";
        String [] wordByWord = sentence.split(" ");
        //reading the word to check
        System.out.println("Please enter a word");
        String word = sc.next();

        boolean doesntContain = true;
        for (int i = 0; i < wordByWord.length; i++) {
            if (wordByWord[i].equals(word)){
                System.out.println("The first occurrence is at: "+(i+1));
                doesntContain = false;
                break;
            }
        }
        if (doesntContain){
            System.out.println("Your word is not in the sentence");
        }
    }
}
