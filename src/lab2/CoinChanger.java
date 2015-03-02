/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab2;

/**
 * 
 * @author Kenny Tsang and Winnie Wu
 */

import javax.swing.JOptionPane;

public class CoinChanger {

    public static void main(String[] args) {
        final int QUARTER_VALUE = 25;
        final int DIME_VALUE = 10;
        final int NICKEL_VALUE = 5;
        
        String input = JOptionPane.showInputDialog("Enter the amount of change: ");
        int d = Integer.parseInt(input);    // Ask the users for input.
        
        System.out.println("You entered: "+input);
        // Calculate the number of quarters.
        int quarterCount = d / QUARTER_VALUE;
        d %= QUARTER_VALUE;
        
        // Calculate the number of dimes.
        int dimeCount = d / DIME_VALUE;
        d %= DIME_VALUE;
        
        int nickelCount = d / NICKEL_VALUE;
        d %= NICKEL_VALUE;
        
        System.out.println("I should have "+quarterCount+" quarters, "+dimeCount+" dimes, "+nickelCount+" nickels.");
        
        
        
        
        
        
        // print the # of coins in each category.
        // print the total # of coins.
    }
    
}
