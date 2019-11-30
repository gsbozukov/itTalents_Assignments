package war_game;
import java.util.Arrays;
public class Table {
    public static void main(String[] args) throws InterruptedException {
        Deck newDeck = new Deck();
        newDeck.fillDeck();
        newDeck.shuffleDeck();
        Player one = new Player();
        Player two = new Player();
        newDeck.deal(one, two);
        System.out.println(Arrays.toString(one.mainDeck));
        System.out.println(Arrays.toString(two.mainDeck));
        one.play(two);
        printWinner(one.takeDeck, two.takeDeck);
        System.out.println(Arrays.toString(one.takeDeck));
        System.out.println(Arrays.toString(two.takeDeck));
    }
    static void printWinner (String[] deck1, String[]deck2){
        int countDeck1 = 0;
        int countDeck2 = 0;
        for (int i = 0; i < deck1.length; i++) {
            if (deck1[i]!=null && !deck1[i].isEmpty()){
                countDeck1++;
            }
        }
        for (int i = 0; i < deck2.length; i++) {
            if (deck2[i]!=null && !deck2[i].isEmpty()){
                countDeck2++;
            }
        }
        if (countDeck1>countDeck2){
            System.out.println("Player 1 WINS the game with "+countDeck1+" cards!");
            return;
        }
        if (countDeck1<countDeck2){
            System.out.println("Player 2 WINS the game with "+countDeck2+" cards!");
        }
        else {
            System.out.println("It's a draw!");
        }
    }
}
