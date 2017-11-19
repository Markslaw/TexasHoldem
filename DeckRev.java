package TexasHoldem;

/**
 * Created by mark on 19/11/2017.
 */
public class DeckRev {
    private CardRev[] Deck = new CardRev[52];

    public CardRev[] getDeck() {return Deck;}

    public void setDeck(CardRev[] deck) {Deck = deck;}


    public DeckRev(CardRev[] Deck) {
        Deck = Deck;
    }


}
