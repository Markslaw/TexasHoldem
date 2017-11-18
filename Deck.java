package TexasHoldem;

/**
 * Created by mark on 18/11/2017.
 */




public class Deck {
   private Card[] deck = new Card[52];


    public Deck(Card[] deck) {
        int num_cards = 0;
        for (int all_suits = 1; all_suits < 5; all_suits++) {
            for (int all_values = 2; all_values < 15; all_values++) {
                deck[num_cards++] = new Card(all_suits, all_values);
            }
        }
    }



    public static void main(String[] args) {
        for(int i=0;i<52;i++)
        System.out.println("your card is value" + cards[i].toString );
    }
}