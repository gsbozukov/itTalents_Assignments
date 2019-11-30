import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        do {
            System.out.println("Please enter 2 full names separated with comma: ");
            input = sc.nextLine();
        }
        //keep repeating until user separates names with comma
        while (!input.contains(","));

        //create array that contains both names, if more than 2 names are detected, something is wrong.
        String [] names = input.split(", ");
        if (names.length!=2){
            System.out.println("You have put more than one comma, please reset me!");
            return;
        }

        //find sum of ASCII codes for each name
        int sumFirstName = 0;
        int sumSecondName = 0;

        for (int i = 0; i < names[0].length(); i++) {
            sumFirstName = sumFirstName + names[0].charAt(i);
        }

        for (int i = 0; i < names[1].length(); i++) {
            sumSecondName = sumSecondName + names[1].charAt(i);
        }

        //Printing whichever has the greatest sum

        if (sumFirstName>sumSecondName){
            System.out.println("The name "+names[0]+" has a greater ASCII sum.");
        }
        if (sumFirstName<sumSecondName){
            System.out.println("The name "+names[1]+" has a greater ASCII sum.");
        }
        if (sumFirstName==sumSecondName){
            System.out.println("Both names have the same ASCII sum!");
        }
    }
}
