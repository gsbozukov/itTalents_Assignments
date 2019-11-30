public class Task8 {
    public static void main(String[] args) {
        //Write a recursive function to calculate sum of digits of any number
        int input = 7123456;
        int result = sumOfDigits(input, 0);
        System.out.println(result);
    }

    public static int sumOfDigits (int remaining, int result){
        if (remaining == 0){
            return result;
        }
        //stack result with the last digit
        result = result + remaining%10;
        return sumOfDigits(remaining/10, result);
    }
}
