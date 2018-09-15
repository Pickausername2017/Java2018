/*
 *This is a collaborative group project for Advanced Java fall 2018. 
This program estimates the materials cost for adding brick to a surface.  Users 
will be asked for brick deminsions, cost of each brick, and the length and width of 
each area to be covered.  The program will calculate the total number of bricks needed 
plus 10% and return a cost estimate. 

This program will use variables, methods, and decision structures.  


 */
package gp02_.pkg0910._denisebruce;

/**
 *
 * @author denise
 */
import java.util.Scanner;
public class GP02_0910_DeniseBruce {

    
    public static void main(String[] args) {
       // USer input for brick information and wall information. 
      System.out.print ("Welcome to the brick estimator.");
      Scanner keyboard = new Scanner(System.in);
      
      // User input for bricks (length, width) 
      System.out.print(" Enter the length and width of the brick in inches\n");
      double brickLength = keyboard.nextDouble();
      double brickWidth=keyboard.nextDouble();  
      
      //User input for cost of each brick
      System.out.print("Enter the price of each brick\n");
      double brickCost= keyboard.nextDouble();
      
      //User input for the length and width of the wall to be covered 
      System.out.print(" Enter the length and width of the walls in feet\n");
      double wallLength = keyboard.nextDouble();
      double wallWidth=keyboard.nextDouble();  
      
      
      double brickCalculation =  wallInformation(wallLength, wallWidth) / (
              bricksInformation(brickLength, brickWidth));
        System.out.print("This is the total number of bricks you will need " + brickCalculation
        +"\n");
      double brickTotal  = brickPrice( brickCost,  brickCalculation); 
      System.out.print("This is the total cost of the project " + brickTotal
        +"\n");
    }
    public static double bricksInformation (double length, double width)
   {
       
      double brickArea;
      brickArea = (length * width); 
      System.out.print("The area of the bricks are "+ brickArea+ " inches\n");
       
      return brickArea;
   }
    
    // This method calculates the total area of the wall to be covered and converts 
    //it to inches.  
    public static double wallInformation (double wlength, double wwidth)
   { 
   
      double wallArea;
      double projectArea;
      wallArea = (((wlength*12) * (wwidth*12)));
      projectArea = (wallArea * .10)+ (wallArea);
      System.out.print("The area of the wall is "+ projectArea+ " inches\n");
      
      return projectArea; 
      
   }
    
    public static double brickPrice (double brickCost, double brickCalculation)
    { 
     double totalCost = brickCost * brickCalculation; 
     return totalCost; 
    }
            
    
    
    
}

   

