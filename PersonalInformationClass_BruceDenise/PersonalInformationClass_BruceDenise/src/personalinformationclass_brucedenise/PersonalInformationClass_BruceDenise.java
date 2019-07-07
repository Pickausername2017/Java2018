/**
* this program create and demonstrates a class
* 10 May 2018
* CSC 151 Tutorial #6 - Personal Information Class
* @Denise Bruce 
*/
package personalinformationclass_brucedenise;

/**
 *
 * @author brucea2720
 */
public class PersonalInformationClass_BruceDenise {

    /**
     * @param args the command line arguments
     *
     */
 public static void main (String [] args)
 { //create the object 
    Person me  = new Person();
    Person myFriend1 = new Person(); 
    Person myFriend2 = new Person();

    //Set my info 
    me.setName ("Tony Gaddis");
    me.setAge(49);
    me.setAddress("724 22nd Street");
    me.setPhone("(555) 555-1234");
    
    //Set friend #1's info.
    myFriend1.setName("Geri Rose");
    myFriend1.setAge(24);
    myFriend1.setAddress("149 East Bay Street");
    myFriend1.setPhone ("(555)555-5678");
    
     //Set friend #2's info.
    myFriend2.setName("John Carbonni");
    myFriend2.setAge(28);
    myFriend2.setAddress("22 King Street");
    myFriend2.setPhone ("(555)555-0123");
    
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

