package TexasHoldem;


public class Player {
    private String name;
    private double balance;



    //getters

    public double getBalance() {
        return balance;
    }

    public String getName(){
        return name;
    }

    //seters


    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    //2arguement constructor
    public Player (String name, double balance){
        setName(name);
        setBalance(balance);
    }

    //no arguement constructor
    public Player (){this ("unknown",0);}


    public String toString() {
        String text = "\nName " + getName() + "\nBalance" + getBalance();
        return text;
    }
}

