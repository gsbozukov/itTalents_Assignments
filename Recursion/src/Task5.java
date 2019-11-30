public class Task5 {
    public static void main(String[] args) {
        //Write a recursive function to find the sum of all even or odd numbers in a given
        int input = 10;
        int even = sumOfEven (input, 1, 0);
        int odd = sumOfOdd (input, 1, 0);

        System.out.println("The even sum of 1 to "+input+" is "+even);
        System.out.println("The odd sum of 1 to "+input+" is "+odd);
    }

    public static int sumOfEven (int input, int i, int result){
        //we pile everything in result
        //check if we hit bottom
        if (i == input){
            if (i%2==0){
                return result+i;
            }
            else {
                return result;
            }
        }
        if (i%2 == 0){
            //add to result
            result = result + i;
        }
        return sumOfEven(input, i+1, result);
    }
    public static int sumOfOdd (int input, int i, int res){
        //we pile everything in result
        //check if we hit bottom
        if (i == input){
            if (i%2!=0){
                return res+i;
            }
            else {
                return res;
            }
        }
        if (i%2 != 0){
            //add to result
            res = res + i;
        }
        i++;
        return sumOfOdd(input, i, res);
    }

}
