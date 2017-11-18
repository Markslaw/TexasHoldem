package TexasHoldem;

/**
 * Created by mark on 18/11/2017.
 */
public class Card {

    private int value;
    private int suit;

    //getters
    public int getValue(){
        return value;
    }

    public int getSuit(){
        return suit;
    }

    //setters
    public void setValue(int value){
        this.value = value;
    }

    public void setSuit(int suit){
        this.suit = suit;
    }

    //2 arguement constructor
    public Card (int value, int suit){
        setValue(value);
        setSuit(suit);
    }

    //no arguement constructor
    public Card (){
        this(0,0);
    }
}

