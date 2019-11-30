public class Task16 {
    public static void main(String[] args) {
        String text = "aaAaaabbbbbb";
        int maxFreq = 0;
        int maxIndex = -1;

        for (int i = 0; i < text.length(); i++) {
            int freq = 0;
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(i) == text.charAt(j)){
                    freq++;
                }
                if (freq>maxFreq){
                    maxFreq = freq;
                    maxIndex = i;
                }
            }
        }

        System.out.println("'" +text.charAt(maxIndex)+ "'");
    }

}
