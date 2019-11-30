public class Task22 {
    public static void main(String[] args) {
        //Write a program to remove all repeated characters in a string
        String text = "Programming in Java!";
        String newText = "";

        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            if (newText.indexOf(symbol) == -1){
                newText = newText + symbol;
            }
        }
        System.out.println(newText);
    }
}
