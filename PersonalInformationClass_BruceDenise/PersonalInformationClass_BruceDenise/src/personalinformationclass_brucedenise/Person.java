/*
 *Person class 
 */
package personalinformationclass_brucedenise;

/**
 *
 * @author brucea2720
 */
public class Person 
{
    private String name;       // A peron's name
    private String address;    // A person's address 
    private int age;            //A person's age
    private String phone;       //A person's phone number
    
    /** The no-arg constructor initializes  an empty object.
     
     */
    
    public Person()
    { 
        name = "";
        address = "";
        age = 0; 
        phone = ""; 
    }
    
    /** The parameterized constructor accepts arguments for the object
     * fields. 
     * @param myName A person's name.
     * @param myAddress A person's address
     * @param myAge A person's age. 
     * @param myPhone A person's phone number. 
     */
    
    public Person (String myName, String myAddress, int myAge, String myPhone)
    {
        name = myName; 
        address = myAddress; 
        age = myAge; 
        phone = myPhone; 
    }
  /** The setName method sets the person's name. 
    @param myName the person's name. 
    */ 
    
    public void setName(String myName)
    {
        name = myName; 
    }
    
    /**The setAge method sets the person's age.
     * @param myAge the person's age 
     */
    
    public void setAge (int myAge)
    {
       age = myAge; 
    }
    
     /**The setAge method sets the person's address.
     * @param myAddress the person's address. 
     */
    
    public void setAddress (String myAddress)
    { 
        address = myAddress; 
    }
      
    /**The setAge method sets the person's address.
     * @param myPhone the person's address. 
     */
    public void setPhone (String myPhone)
    { 
        phone = myPhone; 
    }
   /** 
    * The getName method returns the person's name.
    * @return the person's name
    */
  public String getName() 
  {
      return name; 
  }
  /**
   * The getAge method returns the person's age
   * @return the person's Age. 
   */
  
  public int getAge()
  {
      return age; 
  }
  /** 
   * The getAddress method returns the person's address.
   * @return The person's address
   */
  public String getAddress () 
  {
   return address; 
  }
  
 /**
  * The getPhone method returns the person's phone number
  * @return The person's phone number. 
  */
  
  public String getPhone() 
  { 
      return phone; 
  }
}
