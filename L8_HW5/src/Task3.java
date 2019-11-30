import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String text1;
        String text2;

        do {
            System.out.println("1. Please enter some characters without space:");
            text1 = sc.nextLine();
        }
        while (text1.contains(" "));
        do {
            System.out.println("2. Please enter some more characters without space:");
            text2 = sc.nextLine();
        }
        while (text2.contains(" "));

        //checking if lengths are equal
        int shortestText = text1.length();
        if (text1.length() == text2.length()){
            System.out.println("Both strings have the same lengths!");
        }
        if (text1.length()<text2.length()) {
            System.out.println("The first string is shorter.");
        }
        if (text2.length()<text1.length()) {
            System.out.println("The second string is shorter.");
            shortestText = text2.length();
        }

        //showing the differences
        System.out.println("Differences between positions:");
        boolean areSame = true;
        for (int i = 0; i < shortestText; i++) {
            if (text1.charAt(i)!=text2.charAt(i)){
                System.out.println((i+1)+" "+text1.charAt(i)+"-"+text2.charAt(i));
                areSame = false;
            }
        }
        //if there are no differences, show it
        if (areSame){
            System.out.println("None! They are the same!");
        }

    }
}
