package TexasHoldem;

import javax.swing.*;
import javax.swing.JTextArea;

/**
 * Created by mark on 08/11/2017.
 */
public class TexasHoldemDriver {
    public static void main(String[] args) {
        int num_Players;
        String name;
        double balance;

        num_Players = Integer.parseInt(JOptionPane.showInputDialog("Please enter how many players will be taking part"));

        Player[] players = new Player[num_Players];


        for ( int i=0; i<num_Players;i++) {
            name = JOptionPane.showInputDialog(null,"please enter your name","Player " + i,JOptionPane.PLAIN_MESSAGE);
            balance = Double.parseDouble(JOptionPane.showInputDialog("Please enter the balance"));
            players[i] = new Player(name,balance);


        }




    }
}