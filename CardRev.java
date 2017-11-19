package TexasHoldem;

/**
 * Created by mark on 19/11/2017.
 */
public class CardRev {
    private int value;
    private String Suit;
    private String ValueAsString;

    public int getValue() {return value;}
    public void setValue(int value) {this.value = value;}
    public String getSuit() {return Suit;}

    public void setSuit(String suit) {Suit = suit;}
    public String getValueAsString() {return ValueAsString;}
    public void setValueAsString(String valueAsString) {ValueAsString = valueAsString;}

    // For testing purposes, Change Later...
    @Override
    public String toString() {
        return "CardRev{" +
                "value=" + value +
                ", Suit='" + Suit + '\'' +
                ", ValueAsString='" + ValueAsString + '\'' +
                '}';
    }

    public CardRev(int value, String suit, String valueAsString) {
        this.value = value;
        Suit = suit;
        ValueAsString = valueAsString;
    }
    public CardRev (){
        setValue(0);
        setSuit("Unknown");
        setValueAsString("Unknown");
    }
}
