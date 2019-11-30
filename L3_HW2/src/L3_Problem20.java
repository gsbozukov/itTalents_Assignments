public class L3_Problem20 {
    public static void main(String[] args) {
        int input = 45;
        int sumCol = 0;
        int sumRow = 0;
        for (int row = 1; sumRow<=input; row++) {
            for (int col = row; sumCol < input; col++) {
                if (col > 9) {
                    col = 0;
                }
                System.out.print(col + " ");
                sumCol = sumCol + col;
            }
            sumCol = 0;                     //restarts sum for rows
            System.out.println();           //new line
            sumRow = sumRow + row;          //checks when to stop making new rows
        }
    }
}
