import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter two words divided by space and press enter.");
        String textVert = sc.next();
        String textHor = sc.next();

        //coordinates of the intersection
        int iX=-1;
        int jY=-1;
        boolean noIntersection = true;
        //verifying if they have the same char.
        outerloop:          //naming the outerloop - outerloop in order to break it
        for (int i = 0; i < textVert.length(); i++) {
            for (int j = 0; j < textHor.length(); j++) {
                if (textVert.charAt(i) == textHor.charAt(j)){
                    iX = i;
                    jY = j;
                    noIntersection = false;
                    break outerloop;      //break since we need only one intersection
                }
            }
        }
        if (noIntersection){
            System.out.println("There are no common characters. Try again.");
            return;
        }
        //Creating the result matrix
        //Now that we have iX and jY, print the words when we are on the given columns or rows
        //Else print spaces
        char [][]result = new char[textVert.length()][textHor.length()];
        for (int i = 0; i < textVert.length(); i++) {
            for (int j = 0; j < textHor.length(); j++) {
                if (i==iX) {
                    result[i][j] = textHor.charAt(j);
                }
                if (j==jY) {
                    result[i][j] = textVert.charAt(i);
                }
                if (i!=iX && j!=jY){
                    result [i][j] = ' ';
                }
            }
        }

        //print it
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }
}
