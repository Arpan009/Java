import java.util.Scanner;
public class Test
{     
    public static void main (String[] args)  
    { 
        
        //Creating and object of the class
        Encap object = new Encap(); 
        
        //Taking user input to feed into the private variables
        Scanner inp = new Scanner(System.in); 
        System.out.println("Enter a name");
        String name = inp.next();
        System.out.println("Enter the city");
        String city = inp.next();
        System.out.println("Enter the zipcode");
        int zip = inp.nextInt();

        // Using the public setter methods to set the values of the private variable indirectly
        object.setName(name); 
        object.setCity(city);
        object.setZip(zip);  
       
        // Printing the values using getter methods
        System.out.println("Name: " + object.getName()); 
        System.out.println("City " + object.getCity()); 
        System.out.println("Zip: " + object.getZip()); 
          
       
    } 
} 