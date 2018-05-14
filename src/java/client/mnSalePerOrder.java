/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import bisnis.implSalePerOrder;
import dao.DAOSalePerOrder;
import model.SalePerOrder;

/**
 *
 * @author fauziachmadharuna
 */
public class mnSalePerOrder {
    public static void main(String[] args) {
        DAOSalePerOrder spo=new implSalePerOrder();
      
         for(SalePerOrder m : spo.getAll()){
            System.out.println("SalePerOrder by order number : "+m.getOrderNumber()+" SalePerOrder by total : "+m.getTotal());
        }
        
    }
    
}
