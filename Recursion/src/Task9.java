public class Task9 {
    public static void main(String[] args) {
        //Write a recursive function to find factorial of any given number
        int input = 5;
        int result = factorial(input, 1);
        System.out.println(result);
    }
    public static int factorial(int remaining, int result){
        if (remaining == 0){
            return result;
        }
        //stack result with the last digit
        result = result*remaining;
        return factorial(remaining-1, result);
    }
}
