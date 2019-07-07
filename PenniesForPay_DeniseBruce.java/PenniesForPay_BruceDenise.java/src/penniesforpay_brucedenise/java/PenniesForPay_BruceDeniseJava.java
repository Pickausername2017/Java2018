/* Pennies for Pay Tutorial
* 9 Apr 2018
* CSC 151 Tutorial 4 - Pennies for Pay Problem
* Denise Bruce 
*/
package penniesforpay_brucedenise.java;

 import java.util.Scanner;
import java.text.DecimalFormat;
public class PenniesForPay_BruceDeniseJava {

    /**
     * Get maxDays
     * Validate maxDays (while maxDays < 1, Display error message, get maxDays end while)
     * dayCount = 1 
     * pennies = 1 //initialized to one because on day one, we ear a penniy
     * totalPay=0
     * while dayCount <= maxDays 
     *         display dayCount and pennies 
     *         totalPay += pennies (adds the value of pennies to the pennies in total pay
     *         dayCount++ 
     *         pennies *= 2
     * end while 
     * Display totalPay (format as a dollar amount) 
     * 
     * @param args
     */
   
    public static void main(String[] args) {
        int pennies; //Penney Accumulator
        int totalPay; //Total pay Accumulator 
        int maxDays; //Max number of days 
        int dayCount; //Day Counter 
        
        //Create Scanner Object for Keyboard input.
        Scanner keyboard = new Scanner(System.in);
        
        //Get the maxium number of days.
        System.out.print("For how many days will you work");
        maxDays = keyboard.nextInt();
        
        //Validate the input
        while(maxDays < 1)
        {
            //Prompt the user to enter the correct value 
            System.out.println("The number of days must be at least 1");
            System.out.print("Enter the number of days: ");
            maxDays = keyboard.nextInt();
        } 
        
        // validate output, 32 days exceeds the data size of the data type int
        while(maxDays > 31)
        {
            //Prompt the user to enter the correct value 
            System.out.println("The number of days in a month cannot exceed 31 days");
            System.out.print("Enter the number of days: ");
            maxDays = keyboard.nextInt();
        } 

       
       //Initializes the day counter to day 1.
    dayCount = 1; 
     
    //Initialize the penny accumulator for
    //the first day at work
    pennies = 1;
    
    //Initialize the total pay accumulator.
    totalPay = 0;
    
    //Display the report header 
    System.out.println();
    System.out.println("Day\t\tPennies Earned");
    System.out.println("---------------------------------");
    
    //Display the income report 
    while (dayCount <= maxDays)
    { 
        //Display the day number and pennies earned
        System.out.println(dayCount+ "\t\t" + pennies);
    
         //Accumulate the total pay 
         totalPay += pennies;
         
         //Increment dayCount for the next day 
         dayCount++;
         
         //Double the numer of pennies 
         pennies *= 2;
    }
         DecimalFormat dollar;
        dollar = new DecimalFormat ("#, ##0.00");
         
         //Display the total pay
         System.out.println("Total pay: $"+ dollar.format(totalPay/100.0));
         
         
    }   
}
