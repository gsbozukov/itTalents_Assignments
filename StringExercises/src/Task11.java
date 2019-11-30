import org.omg.CORBA.WStringSeqHelper;

import java.util.Arrays;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        //reading input
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a sentence:");
        String sentence = sc.nextLine();
        String [] strArr = sentence.split(" ");

        System.out.println(Arrays.toString(reverse(strArr, 0)));
    }

    public static String [] reverse (String [] strArr, int i){
        if (i==strArr.length/2){
            return strArr;
        }
        //swapping the first and last
        String temp = strArr[i];
        strArr[i] = strArr[strArr.length-(i+1)];
        strArr[strArr.length-(i+1)] = temp;
        return reverse(strArr, i+1);
    }

}
