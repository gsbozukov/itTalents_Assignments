import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a sentence and press Enter:");
        String text = sc.nextLine();
        //Array created, words separated by space
        String [] wordByWord = text.split(" ");
        for (int i = 0; i < wordByWord.length; i++) {
            //decomposing the word in 2; first letter is uppercase, the rest is lower
            System.out.print(wordByWord[i].substring(0,1).toUpperCase()+
                    wordByWord[i].substring(1).toLowerCase()+" ");
        }
    }
}
