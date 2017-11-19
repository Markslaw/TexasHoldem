package TexasHoldem;

/**
 * Created by mark on 18/11/2017.
 */
public class Card {

    private int value;
    private int name;
    private int suit;
    private static String[] names = {"Ace","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King","Ace"};
    private static String[] suits = {"Clubs","Diamonds","Hearts","Spades"};


    //getters
    public int getValue(){
        return value;
    }

    public int getSuit(){
        return suit;
    }

    public int getName(){
        return name;
    }

    //setters
    public void setValue(int value){
        this.value = value;
    }

    public void setSuit(int suit){
        this.suit = suit;
    }

    public void setName(int name){
        this.name = name;
    }

    //2 arguement constructor
    public Card (int value, int suit){
        setValue(value);
        setSuit(suit);
    }

   public String toString1(){
        return names[name] + "of" + suits[suit];
    }


    //no arguement constructor
    public Card (){
        this(0,0);
    }


}

