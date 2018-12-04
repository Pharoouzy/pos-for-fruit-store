/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pos;
import javax.swing.JOptionPane;

/**
 *
 * @author Pharoouzy
 */
public class Pos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double orange = 2500.00, //Price of Orange in Naira per bag
            banana = 300.00, //Price of Banana in Naira per bag
            guava = 2000.00, //Price of Guava in Naira per bag
            waterMelon = 3500.00,//Price of Water Melon in Naira per bag
            totalSales= 0.00;//Total Sales in Naira
        String welcomeMsg, outputMsg;
        String orangeQuantity, bananaQuantity, guavaQuantity, waterMelonQuantity;//Quantity of bag of Water Melon
        
        welcomeMsg = "\tJava Program that compute Total Sales of a fruit Store\n\t\n";
        welcomeMsg += "\t\tThat sells the following items:\n\n";
        welcomeMsg += "************************************************\n\n";
        welcomeMsg += "1. Price of Orange per Bag = N"+ orange+"\n";
        welcomeMsg += "2. Price of Banana per bag = N"+ banana+"\n";
        welcomeMsg += "3. Price of Guava per bag = N"+ guava+"\n";
        welcomeMsg += "4. Price of Water Melon per bag = N"+ waterMelon+"\n\n\n";
        welcomeMsg += "Instruction: \nQuantity of bag for a particular fruit can be zero \nif the customer decided not to by that fruit.\n\n\n";
        JOptionPane.showMessageDialog(null, welcomeMsg);
        
        orangeQuantity = JOptionPane.showInputDialog("Enter the Quantity of Orange");
        bananaQuantity = JOptionPane.showInputDialog("Enter the Quantity of Banana");
        guavaQuantity = JOptionPane.showInputDialog("Enter the Quantity of Guava");
        waterMelonQuantity = JOptionPane.showInputDialog("Enter the Quantity of Water Melon");
        
        if(Double.parseDouble(orangeQuantity) >= 0 && Double.parseDouble(bananaQuantity) >= 0 && Double.parseDouble(guavaQuantity) >= 0 && Double.parseDouble(waterMelonQuantity) >= 0){//Conditional Statement to check if the quantity is not Negative
            orange *= Double.parseDouble(orangeQuantity);
            banana *= Double.parseDouble(bananaQuantity);
            guava *= Double.parseDouble(guavaQuantity);
            waterMelon *= Double.parseDouble(waterMelonQuantity);
            
            totalSales = orange + banana + guava + waterMelon;
            
            outputMsg = "\n\tQuantity of bages of each fruit\n";
            outputMsg += "1. Quantity of bag of Orange = "+ orangeQuantity+"\n";
            outputMsg += "2. Quantity of bag of Banana = "+ bananaQuantity+"\n";
            outputMsg += "3. Quantity of bag of Guava = "+ guavaQuantity+"\n";
            outputMsg += "4. Quantity of bag of Water Melon = "+ waterMelonQuantity+"\n\n\n";
            
            outputMsg += "\tTotal Sales = N"+ totalSales+"\n\n";
            
            JOptionPane.showMessageDialog(null, outputMsg);
        }
        else{
            JOptionPane.showMessageDialog(null, "Quantity of bag Cannot be Negative Number!\n");
        }
    }
    
}
