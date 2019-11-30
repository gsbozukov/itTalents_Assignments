import java.util.Scanner;
public class Lecture2_Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the volume of the tank (natural number between 10 and 9999):");
        int input = sc.nextInt();

        int buckets = input/5;
        int remainder = input%5;

        if (input<10 || input>9999){
            System.out.println("Invalid entry! Restart me.");
            return;
        }

        if (remainder==0){
            System.out.println("You would need: "+(buckets)+ " pcs. 2L buckets and "+(buckets)+" pcs. 3L buckets");
        }
        if (remainder==1){
            System.out.println("You would need: "+(buckets-1)+ " pcs. 2L buckets and "+(buckets+1)+" pcs. 3L buckets");
        }
        if (remainder==2){
            System.out.println("You would need: "+(buckets+1)+ " pcs. 2L buckets and "+(buckets)+" pcs. 3L buckets");
        }
        if (remainder==3){
            System.out.println("You would need: "+(buckets)+ " pcs. 2L buckets and "+(buckets+1)+" pcs. 3L buckets");
        }
        if (remainder==4){
            System.out.println("You would need: "+(buckets+2)+ " pcs. 2L buckets and "+(buckets)+" pcs. 3L buckets");
        }
    }
}
