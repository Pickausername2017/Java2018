/**
* This program writes information to a text file. 
* 24 Apr 2018 * CSC 151 Homework 4 - Uppercase File Converter
* Denise Bruce 
*/
package uppercasefileconverter_brucedenise;

import java.io.*; 
import java.util.Scanner; 

/**
 *
 * @author denise
 */
public class UppercaseFileConverter_BruceDenise {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
    Scanner keyboard = new Scanner(System.in);
  
    String writeFileName_ADB; 
    String readFileName_ADB;
    String writeFileData_ADB; // inside loop 
    String readFileData_ADB; //inside loop
  
    System.out.print("Enter the input file name "); 
    readFileName_ADB = keyboard.nextLine();  
    
     System.out.print ("Enter the output file name ");
     writeFileName_ADB = keyboard.nextLine(); 
    File file  = new File(readFileName_ADB); 
    
    Scanner inputFile_ADB = new Scanner(file);
    PrintWriter outputFile_ADB= new PrintWriter(writeFileName_ADB);
    
    while (inputFile_ADB.hasNext())
    {
        readFileData_ADB= inputFile_ADB.nextLine();
        writeFileData_ADB = readFileData_ADB.toUpperCase();
        outputFile_ADB.println(writeFileData_ADB); 
        
    }
          inputFile_ADB.close();
         outputFile_ADB.close();
        
    }
    }


