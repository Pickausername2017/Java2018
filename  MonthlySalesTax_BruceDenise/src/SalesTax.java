import javax.swing.*;
import java.awt.event.*;
import java.text.DecimalFormat;


/**
 SalesTax class 
 Chapter 12
 Programming Challenge 2, Monthly Sales Tax */

public class SalesTax extends JFrame
{
    private JPanel panel; //A panel to hold everything
    private JTextField totalSales; // To get total sales 
    private JButton calcButton;  //Calaculates everything 
    
    //Constants for tax rates
    private final double COUNTY_RATE = 0.02; 
    private final double STATE_RATE = 0.04;
    
    //Constants for window size 
    private final int WINDOW_WIDTH = 360; 
    private final int WINDOW_HEIGHT = 100; 
    
   //Class Constructor
    
    public SalesTax() 
    { 
        //set the title 
        setTitle("Monthly Sales Tax Reporter"); 
        
        //Specify what happens when the close button is clicked. 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
        //Build the panel that contains the other components. 
        buildPanel(); 
        
        //Add the panel to the content pane. 
        add(panel);
        
        //Size and dispaly the window.
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT );
        setVisible(true); 
    }
    
    /* The buildPanel method creates a panel containing other components */ 
    
    private void buildPanel() 
    {  
         //Create a label prompoting for total sales. 
            JLabel totalSalesMsg = 
                new JLabel ("Enter the total Sales: "); 
            
            //Create a text field for total sales. 
            totalSales = new JTextField(10); 
            
            //Create a button to click.
            calcButton = new JButton("Calculates Sales Tax"); 
            
            //add and action listener to the button. 
            calcButton.addActionListener(new CalcButtonListener());
    
            //Create a panel. 
            panel = new JPanel(); 
            
            //Add the label, text field, a button to the panell. 
            panel.add(totalSalesMsg); 
            panel.add(totalSales); 
            panel.add(calcButton); 
            
            //video time 8:05 
       } 
    
      /**CalcButtonListener is an action listener class for the 
            calcbutton component*/
     
        private class CalcButtonListener implements ActionListener 
        {
            /* 
            actionPerformed method 
            @param e An ActionEvent object
            */
        public void actionPerformed (ActionEvent e)
        { 
            double totalSalesAmount, //to hold total sales amount 
                   countyTaxAmount, //To hold the county tax
                   stateTaxAmount, // To hold the state tax 
                   totalTaxAmount=0; // To the toal tax 
            
          //Create a DecimalFormat object to format output. 
          DecimalFormat dollar = new DecimalFormat ("#, ##0.00");
          
          //Get the total sales. 
          totalSalesAmount = Double.parseDouble(totalSales.getText()); 
          
          //Calculate the county tax. 
         countyTaxAmount = totalSalesAmount * COUNTY_RATE; 
         
         //Calculates the state tax. 
         stateTaxAmount = totalSalesAmount * STATE_RATE; 
         
         
         //Display the results. 
         JOptionPane.showMessageDialog(null,  "County Sales Tax: $ " + 
                 dollar.format (countyTaxAmount) + "\nState Sales Tax: $" + 
                 "\nTotal Sales Tax: $" + dollar.format( totalTaxAmount)); 
        }
        }
        
          public static void main(String[] args) {
        
        SalesTax stw = new SalesTax();
    }
    
}
    