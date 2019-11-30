public class Task3 {
    public static void main(String[] args) {
        String one = "Wassup my Friends!";
        String two = "Wassup my Friends!";

        if (one.length()!=two.length()){
            System.out.println("Both strings do not have the same length!");
            return;
        }

        boolean areSame = true;

        for (int i = 0; i < one.length(); i++) {
            if (one.charAt(i)!=two.charAt(i)){
                areSame = false;
                break;
            }
        }

        System.out.println(areSame? "Both strings are the same!" : "The strings are not the same!");

    }
}
