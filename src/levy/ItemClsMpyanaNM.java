/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package levy;

/**
 Student Number,
 * Name 
 *  Surname 
 * Class Group.


 */

  
public class ItemClsMpyanaNM {
    
     String name;
     double price;
     int qOH;
    
     public ItemClsMpyanaNM(String ctName,double ctPrice,int ctQOH)
    {
        name = ctName;
        price = ctPrice ;
        qOH = ctQOH;
    }
  
    public ItemClsMpyanaNM()
    {
        name = "XXXXXXXXXX";
        price = 0.0;
        qOH = 0;
    }
    
    public void setName(String inName)
    {
       name = inName;
    }
   
    public void setPrice(double inPrice)
    {
       if(inPrice > 0)
       {
         price = inPrice;
       }
    }
    public void setQOH(int inQOH)
    {
       if(inQOH >= 0)
       {
       qOH = inQOH;
       }
    }
    
     public String getName()
      {
          
          return name;
      }
     
      public double getPrice()
      {
        
          return price;
      }
       public int getQOH() 
      {
          
          return qOH;
      }
      
       public void displayDetails()
       {
           String message = "Name :" +getName()+ "\nPrice :" + getPrice()+ "\nQOH :" + getQOH()+"\n";
           System.out.print(message);
       }
       
       
       public void buyitem(int inQTY)
       {
           qOH = getQOH() - inQTY;
           
       
       }
       
       
}
