public class Task4 {
    public static void main(String[] args) {
        int [][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16},
                {17, 18, 19, 20}
        };
        // column number should be equal and there shouldn't be any -ve numbers
        if (matrix[0].length!=matrix[1].length || matrix[0].length!=matrix[2].length||matrix[0].length!=matrix[3].length){
            System.out.println("Please keep the columns' number the same for the whole matrix.");
            return;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j]<0){
                    System.out.println("Please don't input negative numbers!");
                    return;
                }
            }
        }

        //creating a new matrix with number of rows = old columns and columns = old rows
        int [][]result = new int[matrix[0].length][matrix.length];
        //flipping it +90 degrees
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result [i][j] = matrix[((matrix.length)-1)-j][i];
            }
        }
        //printing the result
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}
