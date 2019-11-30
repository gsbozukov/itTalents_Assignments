public class Task10 {
    public static void main(String[] args) {
        //reverse a string
        String sentence = "Hello my name is Josh and I am a frat boyyyy!";
        StringBuilder ns = new StringBuilder();
        for (int i = 0; i < sentence.length(); i++) {
            ns.append(sentence.charAt(sentence.length()-(i+1)));
        }
        System.out.println(ns);
    }
}