/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author fauziachmadharuna
 */
public class SalePerOrder {

    public SalePerOrder() {
        
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public SalePerOrder(int orderNumber, double total) {
        this.orderNumber = orderNumber;
        this.total = total;
    }
    private int orderNumber;
    private double total;
    
}
