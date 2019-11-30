package war_game;

import java.util.concurrent.TimeUnit;

public class Player {
    String [] mainDeck = new String[26];
    String [] takeDeck = new String[52];
    private int takeCounter = 0;
    private static int cardTurn = 0;
    void play (Player two) {
        while (true){
            //after we play the 26th card, we stop
            if (cardTurn >= 26){
                break;
            }
            //cases where cards are equal
            if (this.cardStrength(cardTurn) == two.cardStrength(cardTurn)){
                System.out.println("Player 1 plays "+this.mainDeck[cardTurn]);
                //TimeUnit.MILLISECONDS.sleep(1000);
                System.out.println("Player 2 plays "+two.mainDeck[cardTurn]);
                System.out.println("IT'S A WAR!");
                //TimeUnit.MILLISECONDS.sleep(1000);
                war(cardTurn, two);
            }
            //if player 1 is bigger
            if (this.cardStrength(cardTurn)>two.cardStrength(cardTurn)){
                System.out.println("Player 1 plays "+this.mainDeck[cardTurn]);
                //TimeUnit.MILLISECONDS.sleep(1000);
                System.out.println("Player 2 plays "+two.mainDeck[cardTurn]);
                //TimeUnit.MILLISECONDS.sleep(1000);
                System.out.println("---------Player 1 takes the hand!--------");
                this.takeHand(this.mainDeck[cardTurn], two.mainDeck[cardTurn]);
                cardTurn++;
            }
            //if player 2 is bigger
            else {
                System.out.println("Player 1 plays "+this.mainDeck[cardTurn]);
                //TimeUnit.MILLISECONDS.sleep(1000);
                System.out.println("Player 2 plays "+two.mainDeck[cardTurn]);
                //TimeUnit.MILLISECONDS.sleep(1000);
                System.out.println("---------Player 2 takes the hand!--------");
                two.takeHand(two.mainDeck[cardTurn], this.mainDeck[cardTurn]);
                cardTurn++;
            }
        }
    }

    //taking a hand
    private void takeHand (String myCard, String otherCard){
        this.takeDeck[this.takeCounter++] = myCard;
        this.takeDeck[this.takeCounter++] = otherCard;
    }
    private int cardStrength (int cardTurn){
        //detect if there is a numerical
        if (this.mainDeck[cardTurn].charAt(0)>='2' && this.mainDeck[cardTurn].charAt(0)<='9'){
            return this.mainDeck[cardTurn].charAt(0)-'0';
        }
        if (this.mainDeck[cardTurn].charAt(0)=='1'){
            return 10;
        }
        //check if it's a face card
        if (this.mainDeck[cardTurn].contains("Jack")){
            return 11;
        }
        if (this.mainDeck[cardTurn].contains("Queen")){
            return 12;
        }
        if (this.mainDeck[cardTurn].contains("King")){
            return 13;
        }
        //if it's an Ace
        else return 14;
    }
    private void war (int cardTurn, Player two) {
        //give 3 cards each and compare the last one
        //what if we're at the end of the deck
        //if it is the last turn
        if (cardTurn == 25){
            // return each card to its player
            this.takeDeck[this.takeCounter] = this.mainDeck[cardTurn];
            two.takeDeck[two.takeCounter] = two.mainDeck[cardTurn];
            System.out.println("It's a draw and it's the last card!");
            Player.cardTurn = 26;
            return;
        }
        //if we're less than 4 cards before the end
        if (cardTurn>=22){
            //compare the last cards of the deck
            if (this.cardStrength(25) > two.cardStrength(25)){
                //player one wins, so we need to give him all the cards from card turn to the end
                iWinWar(cardTurn, 25, two);
                Player.cardTurn = 26;
                return;
            }
            if (this.cardStrength(25) < two.cardStrength(25)){
                //player two wins, so we need to give him all the cards from card turn to the end
                heWinsWar(cardTurn,25,two);
                Player.cardTurn = 26;
                return;
            }
            //what if after that they're equal again?!, check previous card - it will be the decisive one
            else {
                int j = mainDeck.length-1;
                while (cardTurn != j){
                    //25th position is equal, check 24th
                    if (this.cardStrength(j) > two.cardStrength(j)){
                        //player one wins, so we need to give him all the cards from card turn to the end
                        iWinWar(cardTurn,25,two);
                        Player.cardTurn = 26;
                        return;
                    }
                    if (this.cardStrength(j) < two.cardStrength(j)){
                        //player two wins, so we need to give him all the cards from card turn to the end
                        heWinsWar(cardTurn,25, two);
                        Player.cardTurn = 26;
                        return;
                    }
                    j--;
                }
                //if we're still here, every card before is equal, so we split the cards to the owners
                for (int i = cardTurn; i <= 25; i++) {
                    System.out.println("Player 1 plays "+this.mainDeck[i]);
                    System.out.println("Player 2 plays "+two.mainDeck[i]);
                    System.out.println("---");
                    this.takeDeck[this.takeCounter++] = this.mainDeck[i];
                    two.takeDeck[two.takeCounter++] = two.mainDeck[i];
                }
                System.out.println("---------It's a DRAW!--------");
                Player.cardTurn = 26;
                return;
            }
        }
        //if there's a war at the third card, keep comparing the next cards, if they're not equal, someone wins war
        int i = cardTurn+3;
        while (this.cardStrength(i) == two.cardStrength(i)){
            i++;
        }
        //when they're not equal:
        if (this.cardStrength(i) > two.cardStrength(i)){
            //player one wins, so we need to give him all the cards from card turn to the end
            iWinWar(cardTurn, i, two);
            Player.cardTurn = i+1;
        }
        else {
            //player two wins, so we need to give him all the cards from card turn to the end
            heWinsWar(cardTurn,i,two);
            Player.cardTurn = i+1;
        }
    }
    private void iWinWar(int cardTurn, int endTurn, Player two) {
        for (int i = cardTurn; i <= endTurn; i++) {
            System.out.println("Player 1 plays "+this.mainDeck[i]);
            System.out.println("Player 2 plays "+two.mainDeck[i]);
            System.out.println("---");
            this.takeDeck[this.takeCounter++] = this.mainDeck[i];
            this.takeDeck[this.takeCounter++] = two.mainDeck[i];
        }
        System.out.println("---------Player 1 wins the war!--------");
    }
    private void heWinsWar(int cardTurn, int endTurn, Player two) {
        for (int i = cardTurn; i <= endTurn; i++) {
            System.out.println("Player 1 plays "+this.mainDeck[i]);
            System.out.println("Player 2 plays "+two.mainDeck[i]);
            System.out.println("---");
            two.takeDeck[two.takeCounter++] = this.mainDeck[i];
            two.takeDeck[two.takeCounter++] = two.mainDeck[i];
        }
        System.out.println("---------Player 2 wins the war!--------");
    }
}
