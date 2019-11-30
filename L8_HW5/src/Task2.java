import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1;
        String input2;

        do{
            System.out.println("Please enter your first word between 10 and 20 letters, press Enter:");
            input1 = sc.nextLine();
        }
        while (input1.length()<10||input1.length()>20);
        do{
            System.out.println("Please enter your second word between 10 and 20 letters, press Enter:");
            input2 = sc.nextLine();
        }
        while (input2.length()<10||input2.length()>20);

        //detecting the longest word and printing its length
        if (input1.length()>input2.length()){
            System.out.println("The longest word is: "+input1.length()+" letters long.");
        }
        else {
            System.out.println("The longest word is: "+input2.length()+" letters long.");
        }
        //creating the first new word -
        // creating a word with the first 5 chars of the second input
        // and ending the first input from the 5th index to the end
        String newInput1 = input2.substring(0,5)+input1.substring(5);
        System.out.print(newInput1+", ");
        String newInput2 = input1.substring(0,5)+input2.substring(5);
        System.out.print(newInput2);
    }
}
