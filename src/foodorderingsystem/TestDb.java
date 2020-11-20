/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodorderingsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author RYAN
 */
public class TestDb {

public static void main(String [] args) throws ClassNotFoundException {
    
    String connectionUrl = "jdbc:mysql://localhost:3306/foodorderingsystem";
   
    String username= "sa";
    String Pass="anjalo9990";
    
    try{
   Connection con = DriverManager.getConnection(connectionUrl, username, Pass);
    if(con!=null)
    System.out.println("Connection is successfull");

    }
    catch(SQLException e){
System.out.print("Something went wrong\n");
     e.printStackTrace();

    }}}

       
  

   
   
