public class Task5 {
    public static void main(String[] args) {
        int [][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        // check if someone changed the size of the matrix
        if (matrix.length!=4){
            System.out.println("Please don't change the 4x4 matrix size");
            return;
        }
        int columnSum = 0;
        int columnSumMax = 0;
        int rowSum = 0;
        int rowSumMax = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                //check if all numbers are positive
                if (matrix[i][j]<0){
                    System.out.println("Please don't input negative numbers!");
                    return;
                }
                //check if someone changed the size of the matrix
                if (matrix[i].length!=4){
                    System.out.println("Please don't change the 4x4 matrix size");
                    return;
                }
                //calculating the rowSum
                rowSum = rowSum + matrix[i][j];
                //calculating the columnSum
                columnSum = columnSum + matrix[j][i];
            }
            if (rowSum>rowSumMax){
                rowSumMax = rowSum;
            }
            if (columnSum>columnSumMax){
                columnSumMax = columnSum;
            }
            columnSum = 0;  //reseting the rowSum
            rowSum = 0;     //reseting the rowSum
        }
        System.out.println("The largest sum for the rows is: "+rowSumMax);
        System.out.println("The largest sum for the columns is: "+columnSumMax);
        if (rowSumMax<columnSumMax){
            System.out.println("The largest sum for ROWS is < than the sum for COLUMNS");
        }
        else {
            System.out.println("The largest sum for ROWS is > than the sum for COLUMNS");
        }
    }
}
