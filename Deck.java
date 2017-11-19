package TexasHoldem;

import java.util.Random;

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
/*learned about randomising an array from a stackoverflow.com*/
    public void shuffle() {
        int length = deck.length;
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int swap = i + random.nextInt(length - i);
            swapCards(i, swap);
        }
    }

        public void swapCards(int i, int swap){
            Card temp = deck[i];
            deck[i] = deck[swap];
            deck[swap] = temp;
        }


    }



