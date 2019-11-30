import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrSize;
        // Accepts size of array
        do {
            System.out.println("Please enter a size of an array greater than 1:");
            arrSize = sc.nextInt();
        }
        while (arrSize < 2);

        //Entering the values for the array
        int[] arr = new int[arrSize];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Please enter the " + (i + 1) + " number:");
            arr[i] = sc.nextInt();
        }

        int count = 1;              //counts the numbers equal to each other
        int largestSeries = 1;      //keeps track of record 'count'
        int iEnd=0;                   //remembers last i of the series
        int iBeg=0;                   //beginning of series
        //Starting to compare the ith with the previous one
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]==arr[(i-1)]){
                count ++;
                //increments the record if count exceeds the previous record
                if (count>largestSeries){
                    largestSeries = count;
                    iEnd = i;
                    iBeg = iEnd-(largestSeries-1);
                }

            }
            //if values are not the same, we restart the count
            else {
                count = 1;
            }
        }
        //Stop program if count = 1
        if (largestSeries == 1){
            System.out.println("The array doesn't contain repeating numbers in a series.");
            return;
        }

        //Printing new 'array' which is the series of numbers contained in the original array
        System.out.println("The longest series is "+largestSeries+" numbers long:");
        System.out.print("[");
        for (int i = iBeg; i <= iEnd; i++) {
            if (i==(iEnd)){
                System.out.print(arr[i]);
                break;
            }
            System.out.print(arr[i]+ ", ");
        }
        System.out.print("]");
    }
}
