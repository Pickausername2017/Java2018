/**
* This program calculates the seconds into minutes, hours, and days. 
* 22 Mar 2018
* CSC 151 Tutorial 3 - Time Calculator Problem
* Ashley Denise Bruce 
*/
package timecalculator_DeniseBruce.java;

import javax.swing.JOptionPane;
public class TimeCalculator_denisebruce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        double seconds_ADB; //The number of seconds 
        String input_ADB; //To hold keyboard input
        
        //Constants 
        final double SECONDS_PER_MINUTE_ADB = 60; //seconds in a minute
        final double SECONDS_PER_HOUR_ADB = 3600; // seconds in an hour
        final double SECONDS_PER_DAY_ADB = 86400; // seconds in a day
        
        //get the number of  seconds 
        input_ADB = JOptionPane.showInputDialog("Enter the number of seconds.");
        seconds_ADB = Double.parseDouble(input_ADB);
        
        //Displays the number of minutes, if any. 
        if (seconds_ADB >=  SECONDS_PER_MINUTE_ADB)
        {
        //  calcuates the number of minutes.
         double minutes_ADB = seconds_ADB /SECONDS_PER_MINUTE_ADB;
     
        //  displays the number of  minutes 
        JOptionPane.showMessageDialog (null, "there are " +  minutes_ADB +
                " minutes in " + seconds_ADB + " seconds.");
        }
        
        //Display the number of hours, if any.
         if (seconds_ADB >=  SECONDS_PER_HOUR_ADB)
        {
        //  calcuates the number of hours.
         double hours_ADB = seconds_ADB /SECONDS_PER_HOUR_ADB;
     
        //  displays the number of  hours.  
        JOptionPane.showMessageDialog (null, "there are " +  hours_ADB +
                " hours in " + seconds_ADB + " seconds.");
        }
         
          //Display the number of days, if any
         if (seconds_ADB >=  SECONDS_PER_DAY_ADB)
        {
        //  calcuates the number of days.
         double days_ADB = seconds_ADB /SECONDS_PER_DAY_ADB;
     
        //  displays the number of days  
        JOptionPane.showMessageDialog (null, "there are " +  days_ADB +
                " days in " + seconds_ADB + " seconds.");
        }
        
       //Exit the appplication
       System.exit(0);
    
    }
    
}
