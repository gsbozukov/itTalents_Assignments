public class Task17 {
    public static void main(String[] args) {
        //char with min occurrences
        String sentence = "aaAAAa aabbcccc";
        int minFreq = 100000;
        int minIndex = -1;

        for (int i = 0; i < sentence.length(); i++) {
            int freq = 0;
            for (int j = 0; j < sentence.length(); j++) {
                if (sentence.charAt(i) == sentence.charAt(j)){
                    freq++;
                }
            }
            if (freq < minFreq){
                minFreq = freq;
                minIndex = i;
            }
        }
        System.out.println(sentence.charAt(minIndex));

    }
}
