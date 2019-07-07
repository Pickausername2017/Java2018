// This program uses user input to calculate the miles per gallon. 
// 08 Mar 2018
// CSC 151 Tutorial 2 - Miles-per-Gallon Problem
// @Ashley Denise Bruce 
 
package milespergallon_ashleybruce;

import java.util.Scanner;

/**
 *
 * @author denise
 */
public class MilesPerGallon_AshleyBruce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           double miles_ADB; //miles driven 
       double gallons_ADB; // gallons of gas used
       double mpg_ADB; // miles per gallon 
      
       Scanner keyboard = new Scanner (System.in); //this creates the scanner object.
       
       System.out.print ("Enter the miles driven \n"); //asks miles driven
       miles_ADB = keyboard.nextDouble();
       
       System.out.print ("Enter the amount of gas used \n"); //asks for gas used.
       gallons_ADB = keyboard.nextDouble(); 
       
       mpg_ADB = miles_ADB/gallons_ADB;
       System.out.println ("The MPG is " + mpg_ADB );
    }
    
}
