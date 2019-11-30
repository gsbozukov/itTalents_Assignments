import java.util.Scanner;

public class ExerciseMatrixDiagonalPlacement {
    public static void main(String[] args) {
        int count = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter m:");
        int m = sc.nextInt();
        System.out.println("Please enter n:");
        int n = sc.nextInt();
        //initialize matrix
        int [][] matrix = new int[m][n];
        matrix[0][0] = count++;
        int sum = 1;
        //filling the matrix
        //filling the first half
        for (int i = 1; i < m; i++) {
            int localI = i;
            for (int j = 0; j < n; j++) {
                if (localI+j == sum){
                    matrix [localI][j] = count;
                    count++;
                    if (localI>=1){
                        localI--;
                    }
                    else {
                        break;
                    }
                }
            }
            sum++;
        }
        //filling the second half
        while (sum<=(m+n-2)) {
            int localI = (m - 1);
            for (int j = 1; j < n; j++) {
                if (localI + j == sum) {
                    matrix[localI][j] = count;
                    count++;
                    if (localI >= 1) {
                        localI--;
                    } else {
                        break;
                    }
                }
            }
            sum++;
        }

        printMatrix(matrix);
    }
    public static void printMatrix(int matrix [][]){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
