import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        int countVowels = 0;
        int countCons = 0;
        //Reading input
        Scanner sc = new Scanner (System.in);
        System.out.println("Please enter a sentence:");
        String sentence = sc.nextLine();

        for (int i = 0; i < sentence.length(); i++) {
            char symbol = sentence.charAt(i);
            if (symbol>='a'&&symbol<='z'||symbol>='A'&&symbol<='Z'){
                if (symbol == 'a'||symbol =='A'||symbol =='i'||
                    symbol =='I'||symbol =='e'||symbol =='E'||
                    symbol =='o'||symbol =='O'||symbol =='u'||
                    symbol =='U'||symbol =='y'||symbol =='Y'){
                    countVowels++;
                }
                else {
                    countCons++;
                }
            }
        }
        System.out.println("Vowels " +countVowels);
        System.out.println("Consonents "+ countCons);

    }
}
