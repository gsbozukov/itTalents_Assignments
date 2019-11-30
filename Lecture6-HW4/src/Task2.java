import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] matrix = new int[4][4];
        //user inputs matrix
        System.out.println("Please enter 16 natural numbers for a 4x4 matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("You are entering the "+(i+1)+"-"+(j+1)+" value:");
                matrix [i][j] = sc.nextInt();
                if (matrix[i][j] < 0){
                    j--;
                }
            }
        }
        //finding diagonals
        int [] diagonal1 = new int [matrix.length];
        int [] diagonal2 = new int [matrix.length];
        for (int i = 0; i < diagonal1.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i==j){
                    diagonal1 [i]=matrix[i][j];
                }
                if (i+j==3){
                    diagonal2 [i]=matrix[i][j];
                }
            }
        }

        //printing both arrays - diagonals
        System.out.println("The first diagonal is: ");
        System.out.print("[");
        for (int i = 0; i < diagonal1.length; i++) {
            if (i==(diagonal1.length-1)){
                System.out.print(diagonal1[i]);
                break;
            }
            System.out.print(diagonal1[i]+ ", ");
        }
        System.out.println("]");
        //printing second diagonal
        System.out.println("The second diagonal is: ");
        System.out.print("[");
        for (int i = 0; i < diagonal2.length; i++) {
            if (i==(diagonal2.length-1)){
                System.out.print(diagonal2[i]);
                break;
            }
            System.out.print(diagonal2[i]+ ", ");
        }
        System.out.println("]");
    }
}
