/**
*This program calculates the area of a rectangle using JOptionPane and methods.
* 8 May 2017
* CSC 151 Homework 5 - Rectangle Area - Complete the Program
* @Denise Bruce
*/
package rectanglearea_brucedenise.java;

import javax.swing.JOptionPane; 
public class RectangleArea_BruceDeniseJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
       double length_ADB; 
       double width_ADB;
       double area_ADB; 
       
      length_ADB = getLength_ADB();
      width_ADB = getWidth_ADB();
      area_ADB = getArea_ADB(width_ADB,length_ADB);
      
      displayData_ADB(length_ADB,width_ADB, area_ADB ); 
      System.exit(0); 
      
    }
    

    public static double getLength_ADB() {
         
      String getLength_ADB;     
      getLength_ADB = JOptionPane.showInputDialog("Enter the rectangle length");
      return Double.parseDouble(getLength_ADB);
    }
   
    public static double getWidth_ADB()
    {
          String getWidth_ADB;     
      getWidth_ADB = JOptionPane.showInputDialog("Enter the rectangle width");
      return Double.parseDouble(getWidth_ADB);
    }
  
    public static double getArea_ADB(double width_ADB,double length_ADB ) 
    {
      return width_ADB * length_ADB; 
    }
    
    public static void displayData_ADB(double length_ADB, double width_ADB,
            double area_ADB) 
    {
          JOptionPane.showMessageDialog(null, "The area is of a rectangle is "
                  + area_ADB +
          "\n"+ "The length of the rectangle is "+ length_ADB + "\n" + "The width "
                  + "of the"
                 + "rectangle is "+ width_ADB);
    }
                
} 
