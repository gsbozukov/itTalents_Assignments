public class Task7 {
    public static void main(String[] args) {
        //Write a recursive function to check whether a given number is palindrome or not
        int input = 1234554321;
        int sizeOfInput=1;
        for (int i = 1; input/i > 0; i=i*10) {
            sizeOfInput = i;
        }
        System.out.println(sizeOfInput);
        boolean x = palindrome (input, sizeOfInput);
        System.out.println(x);
    }
    public static boolean palindrome (int input, int sizeOfInput){
        if (input<10){
            return true;
        }
        //check if last and first digits are the same
        int leftCheck = input/sizeOfInput;
        int rightCheck = input%10;
        if (leftCheck != rightCheck){
            return false;
        }
        return palindrome((input%sizeOfInput)/10, sizeOfInput/100);
    }
}
