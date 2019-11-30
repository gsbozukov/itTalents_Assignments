package war_game;
import java.util.Arrays;
class Deck {
    private String [] cards = new String[52];
    //fill deck with cards
    void fillDeck (){
        int cardCounter = 0;
        for (int i = 1; i <= 4; i++) {
            char suit = '0';
            if (i==1){
                suit = '\u2660'; //spades
            }
            if (i==2){
                suit = '\u2666'; //diamond
            }
            if (i==3){
                suit = '\u2663'; //club
            }
            if (i==4){
                suit = '\u2764'; //heart
            }
            for (int j = 2; j <= 14; j++) {
                if (j<=10){
                    StringBuilder builder = new StringBuilder();
                    builder.append(j);
                    builder.append(suit);
                    this.cards[cardCounter] = builder.toString();;
                    cardCounter++;
                }
                if (j == 11){
                    StringBuilder builder = new StringBuilder();
                    builder.append("Jack of ");
                    builder.append(suit);
                    this.cards[cardCounter] = builder.toString();;
                    cardCounter++;
                }
                if (j == 12){
                    StringBuilder builder = new StringBuilder();
                    builder.append("Queen of ");
                    builder.append(suit);
                    this.cards[cardCounter] = builder.toString();;
                    cardCounter++;
                }
                if (j == 13){
                    StringBuilder builder = new StringBuilder();
                    builder.append("King of ");
                    builder.append(suit);
                    this.cards[cardCounter] = builder.toString();;
                    cardCounter++;
                }
                if (j == 14){
                    StringBuilder builder = new StringBuilder();
                    builder.append("Ace of ");
                    builder.append(suit);
                    this.cards[cardCounter] = builder.toString();;
                    cardCounter++;
                }
            }
        }
        //System.out.println(Arrays.toString(this.cards));
    }
    //shuffling deck
    void shuffleDeck (){
        for (int i = 0; i < 1000; i++) {
            double r = Math.random();
            double r2 = Math.random();
            double randomNum = r*51;
            double randomNum2 = r2*51;
            int x = (int)randomNum;
            int y = (int)randomNum2;
            swap(x, y);
        }
        //System.out.println(Arrays.toString(this.cards));
    }
    //swapping cards
    private void swap (int x, int y){
        String temp = this.cards[x];
        this.cards[x] = this.cards[y];
        this.cards[y] = temp;
    }
    //dealing the cards
    void deal(Player one, Player two){
        int counter1 = 0;
        int counter2 = 0;
        //deal to players
        for (int i = 0; i < this.cards.length; i++) {
            //deal to player one
            if (i%2==0){
                one.mainDeck[counter1] = this.cards[i];
                counter1++;
            }
            else {
                two.mainDeck[counter2] = this.cards[i];
                counter2++;
            }
        }
        //System.out.println(Arrays.toString(one.mainDeck));
        //System.out.println(Arrays.toString(two.mainDeck));
    }
}
