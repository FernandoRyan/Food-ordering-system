/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodorderingsystem;

/**
 *
 * @author RYAN
 */
public class Meals extends Meal{

    //Private feilds
    private final String ProductName;
    private final double ProductPrice;
    private final double Productquantity;
    private final int ProductId;
    
    //Paramameterized Constructor
   

    Meals(String name, double price,double qty,int id) {
    this.ProductId=id;
    this.ProductName=name;
    this.ProductPrice=price;
    this.Productquantity=qty;
    }
    
    @Override
    public void Cal_total()
    {
    }
    
    
    }
    
    
    

