
package m2_l1_brucedenise;

/**
 *The BankAccount class simulates a bank account.
 */
public class BankAccount
{
    private double balance; // Account balance
    
    /** 
     * This constructor sets the starting balance at 0.0.
     */


public BankAccount()
{
balance = 0.0;
}
/** 
 * This constructor sets the starting balance
 to the value passed as an argument.
 @param startBalance The starting balance.
 * */

/**Copy constructor. This constructor accepts a reference to another BankAccount
 * object.  The object that is constructed is a copy of the argument object
 * @param obj a reference to a BankAccout object.
 * 
 */

public BankAccount (BankAccount obj)
{
    balance = obj.balance; 
}

/** This constructor sets the starting balance to the value passed as an 
 * argument. 
 * @param startBalance the starting balance. 
 * 
 * 
 */

public BankAccount (double startBalance) 
{ 
    balance = startBalance; 
} 

/** This constructor sets the starting balance to the value in the String 
 * argument.  
 * @param str The starting balance, as a String. 
 */

public BankAccount (String str)
{
    balance = Double.parseDouble(str);
}

/** 
 * The Deposit method makes a deposit into the account. 
 * @param amount The amount to add to the balance field. 
 */

public void deposit (double amount)
{
    balance+= amount;
}

/** 
 * The deposit method makes a deposit into the account.  
 * @param str The amount to add to the balance field, as a String. 
 */

public void deposit (String str)
{
    balance += Double.parseDouble(str);
}

/**
 * The withdraw method withdraw an amount from the account. 
 * @param amount The amount to subtract from the balance field. 
 * 
 */

public void withdraw (double amount )
{ 
    balance -=amount;
} 

/** 
 * The withdraw method withdraws an amount from the account.  
 * @param str The amount to subtract from the balance field as String. 
 */

public void withdraw (String str)
{
    balance -= Double.parseDouble(str);
}

/** 
 * The setBalance method sets the account balance. 
 * @param b the value to store in the balance field. 
 */

public void SetBalance (double b)
{ 
    balance = b; 
} 

/**
 * The setBalance method sets the account balance. 
 * @param str the value, as a String, to store in the balance field. 
 */

public void setBalance (String str)
{
    balance = Double.parseDouble(str); 
}

/** 
 * The getBalance method returns the account balance. 
 * @return The value in the balance field 
 */

public double getBalance() 
{ 
    return balance; 
} 
}
