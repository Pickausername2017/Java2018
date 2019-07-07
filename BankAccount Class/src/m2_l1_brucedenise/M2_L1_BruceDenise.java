/**
* Chapter Programming Challenge 2.
 * This program demonstrates the BankAccount class
 * with added copy constructor.  
* 10 Oct 2018 
* CSC 251 Lab 7 - BankAccount Class Copy Constructor
* @author Denise Bruce 
*/
package m2_l1_brucedenise;

import java.text.DecimalFormat; 
/**
 *
 * @author denise
 */
public class M2_L1_BruceDenise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a BankAccount ojbect with a 
        //balance of $1200.00
        BankAccount account1= new BankAccount(1200.00);
        
        //Create another BankAccount object as a 
        //copy of the first. 
        BankAccount account2 = new BankAccount (account1); 
        
        // Create A DecimalFormat object to format
        //the balances when displayed. 
        
       DecimalFormat dollar = new DecimalFormat ("#, ##0.00"); 
       
       //Display the balance in each account. 
       System.out.println("The balance in acount #1 is $" + 
               dollar.format(account1.getBalance()));
         System.out.println("The balance in acount #2 is $" + 
               dollar.format(account1.getBalance()));
        
    }
    
}
