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
    private final int ProductId;
    private final String ProductName;
    private final double ProductPrice;
    private final double Productquantity;   
    
    //Paramameterized Constructor   
    Fastfood( int id, String name, double price, double qty) 
    {
        this.ProductId = id;  
        this.ProductName = name;              
        this.ProductPrice = price;
        this.Productquantity = qty;    
    }
}
