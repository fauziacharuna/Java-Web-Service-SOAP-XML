/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.SalePerOrder;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 *
 * @author fauziachmadharuna
 */
@WebService
public interface DAOSalePerOrder {
    @WebMethod
    public void insert(SalePerOrder b);
    
    @WebMethod
    public List<SalePerOrder> getAll();
    @WebMethod
    public void update(SalePerOrder b);
    @WebMethod
    public void delete(int orderNumber);
    @WebMethod(exclude=false)
   
    public List<SalePerOrder> getOrder(int orderNumber);
    @WebResult(name="SalePerOrder")
    
    public Integer getCount();
    

    
    
    
}
