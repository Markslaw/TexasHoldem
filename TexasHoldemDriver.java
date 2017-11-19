package TexasHoldem;

        import javax.swing.*;

public class TexasHoldemDriver {
    public static void main(String[] args) {
        int num_Players;
        String name;
        double balance;

        num_Players = Integer.parseInt(JOptionPane.showInputDialog("Please enter how many players will be taking part"));

        Player[] players = new Player[num_Players];


        for (int i = 0; i < num_Players; i++) {
            name = JOptionPane.showInputDialog(null, "please enter your name", "Player " + i, JOptionPane.PLAIN_MESSAGE);
            balance = Double.parseDouble(JOptionPane.showInputDialog("Please enter the balance"));
            players[i] = new Player(name, balance);


        }
        for (int i = 0; i < 2; i++) {
            JOptionPane.showMessageDialog(null, players[i].toString());


        }


        for (int i = 0; i <52; i++)
            JOptionPane.showMessageDialog(null, "");




    }

}