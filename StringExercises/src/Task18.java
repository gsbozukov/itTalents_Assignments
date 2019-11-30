public class Task18 {
    public static void main(String[] args) {
        StringBuilder text = new StringBuilder("wassup big fat nigga");

        while (text.length()>0){
            int frequency = 1;
            System.out.print(text.charAt(0));
            for (int i = 1; i < text.length(); i++) {
                if (text.charAt(0) == text.charAt(i)){
                    frequency++;
                    text.deleteCharAt(i);
                    i--;
                }
            }
            System.out.println(" "+frequency);
            text.deleteCharAt(0);
        }
    }
}