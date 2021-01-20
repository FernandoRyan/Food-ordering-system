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
public interface PopUpInterface_Fastfood 
{
    //  We used this interface to achieve total abstraction  
    
    void  CalculateFastfoodsPrice();
    
    void InsertOrderDetails();
    
    double lblPrice();
}
