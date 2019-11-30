public class Task7 {
    public static void main(String[] args) {
        int [][] matrix = {
                {11, 12, 13, 14, 15, 16},
                {21, 22, 23, 24, 25, 26},
                {31, 32, 33, 34, 35, 36},
                {41, 42, 43, 44, 45, 46},
                {51, 52, 53, 54, 55, 56},
                {61, 62, 63, 64, 65, 66}
        };

        int totalRowSum = 0;
        int row = 0;    //rows of the matrix
        int col = 0;    //cols of the matrix
        int rowsum = 0; // sum for the chosen values

        for (int i = 0; i < (matrix.length * matrix[0].length); i++) {

            //if the sum of the indices is even
            if ((row+col)%2==0){
                System.out.print(matrix[row][col]+" ");
                rowsum = rowsum + matrix[row][col];
            }
            //if we reach the end of the row, next row and reset col to 0 and print the sum;
            // if not we will only increment col.
            if (col++==(matrix[row].length-1)){
                row++;
                col = 0;
                System.out.println(" --- The sum for the row is: " +rowsum);
                totalRowSum = totalRowSum + rowsum;
                rowsum = 0;         //resetting the rowsum for next  row
            }
        }
        System.out.println("The total sum is: " +totalRowSum);
    }
}
