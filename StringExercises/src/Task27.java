public class Task27 {
    public static void main(String[] args) {
        //program that finds the last occurence of the given word
        //prints index of the beginning of the word
        String text  = "I love programming. I love coding";
        String input = "love";

        int index = text.lastIndexOf(input);
        System.out.println(index);

    }
}
