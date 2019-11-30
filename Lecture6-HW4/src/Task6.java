public class Task6 {
    public static void main(String[] args) {
        int [][] matrix = {
                {11, 12, 13, 14, 15, 16},
                {21, 22, 23, 24, 25, 26},
                {31, 32, 33, 34, 35, 36},
                {41, 42, 43, 44, 45, 46},
                {51, 52, 53, 54, 55, 56},
                {61, 62, 63, 64, 65, 66}
        };
        // check if someone changed the size of the matrix
        if (matrix.length!=6){
            System.out.println("Please don't change the 6x6 matrix size");
            return;
        }
        int rowSum = 0;
        int totalRowSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                //check if all numbers are positive
                if (matrix[i][j]<0){
                    System.out.println("Please don't input negative numbers!");
                    return;
                }
                //check if someone changed the size of the matrix
                if (matrix[i].length!=6){
                    System.out.println("Please don't change the 6x6 matrix size");
                    return;
                }
                //calculating the row if i is odd (since we start counting from 0)
                if (i%2!=0){
                    System.out.print(matrix[i][j]+" ");
                    rowSum = rowSum + matrix[i][j];
                    //at the last column of the row: add the row sum to the total and print the rowsum next to the finishing row
                    if (j==(matrix[i].length-1)){
                        totalRowSum = totalRowSum + rowSum;
                        System.out.println(" - the sum is: "+rowSum);
                    }
                }
            }
            rowSum = 0;     //resetting the rowsum for the next row
        }
        System.out.println("The total sum of these rows is: "+totalRowSum);
    }
}
