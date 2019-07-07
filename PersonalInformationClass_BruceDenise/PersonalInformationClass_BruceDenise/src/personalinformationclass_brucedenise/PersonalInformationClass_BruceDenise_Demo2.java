/**
*This is the second class demo, using a constructor with parameters/
* 15 May 2018
* CSC 151 Tutorial #6 - Personal Information Class
* @Denise BRce 
*/
package personalinformationclass_brucedenise;

/**
 *
 * @author brucea2720
 */
public class PersonalInformationClass_BruceDenise_Demo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
     //Creates objects    
    Person me = new Person ("Tony Gaddis", " 724 22nd s", 49, "(555) 555-1234" );
    Person myFriend1 = new Person ("Geri Rose", "149 East Bay Street", 24, "(555)555-5678");
    Person myFriend2 = new Person (" John Carbonni", "22 King Street", 28, "(555)555-0123");
        //Display my info. 
    System.out.println ("My information");
    System.out.println ("Name: "+ me.getName());
    System.out.println ("Age: "+ me.getAge());
    System.out.println ("Address: '"+ me.getAddress());
    System.out.println ("Phone: "+ me.getPhone());
    
    //Display friend #1's info. 
    System.out.println ("\nFriend #1's information: ");
    System.out.println ("Name: "+ myFriend1.getName());
    System.out.println ("Age: "+ myFriend1.getAge());
    System.out.println ("Address: "+ myFriend1.getAddress());
    System.out.println ("Phone: "+ myFriend1.getPhone());
    
    //Display friend #2's info.
    System.out.println ("\nFriend #2's infomraiton: ");
    System.out.println ("Name: "+ myFriend2.getName());
    System.out.println ("Age: "+ myFriend2.getAge());
    System.out.println ("Address: "+ myFriend2.getAddress());
    System.out.println ("Phone: "+ myFriend2.getPhone());
    
    }
    
}
