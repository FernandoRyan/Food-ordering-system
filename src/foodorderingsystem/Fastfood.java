/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodorderingsystem;

/**
 *
 * @author Neranji Sulakshika
 */
public class Fastfood extends Fastfoods
{
    //Private feilds
    private final String ProductName;
    private final double ProductPrice;
    private final double Productquantity;
    private final int ProductId;
    
    
    //Paramameterized Constructor   
    Fastfood(String name, double price,double qty,int id) 
    {
        this.ProductId = id;
        this.ProductName = name;
        this.ProductPrice = price;
        this.Productquantity = qty;    
    }

    Fastfood() 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void Cal_total()
    {
        
    }
}
