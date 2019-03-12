//Demonstration of encapsulation 
public class Encap
{ 
    // variables declared as private
    private String Name; 
    private String City; 
    private int Zip; 
  
    //Public getter methods to obtain the value of variables as they are private.
    public String getName()  
    { 
      return Name; 
    } 
   
    public String getCity()  
    { 
       return City; 
    } 

    public int getZip()  
    { 
      return Zip; 
    } 
   
    //Public setter methods to update the values of the variables
     public void setName(String newName) 
    { 
      Name = newName; 
    } 

    public void setCity(String newCity) 
    { 
      City = newCity;
    } 
    public void setZip(int newZip) 
    { 
      Zip = newZip;
    } 
} 