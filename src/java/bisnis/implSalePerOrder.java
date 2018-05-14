/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bisnis;

import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.List;

import connection.koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import dao.DAOSalePerOrder;
import model.SalePerOrder;
import javax.jws.WebService;


/**
 *
 * @author fauziachmadharuna
 */
@WebService(endpointInterface="dao.DAOSalePerOrder")
public class implSalePerOrder implements DAOSalePerOrder{
    Connection kon;
    public implSalePerOrder(){
        
    }
    @Override
    public void insert(SalePerOrder b) {
         kon = new koneksi().connection();
        
        int ordernumber = b.getOrderNumber();
        double total = b.getTotal();
        
        try{
            String sql="insert into SalePerOrder(orderNumber,total) values(?,?)";
            PreparedStatement stmt=kon.prepareStatement(sql);
            
                stmt.setInt(1,ordernumber);
                stmt.setDouble(2,total);

                stmt.executeUpdate();
                
            stmt.close();

        }catch(Exception err){
            err.printStackTrace();
        }
    }

    @Override
    public List<SalePerOrder> getAll() {
        kon = new koneksi().connection();
        
        List<SalePerOrder> lis = null;
        
        try{
            
          String sql = "SELECT * FROM SalePerOrder order by orderNumber asc";

          lis = new ArrayList<SalePerOrder>();
          
          Statement stmt=kon.createStatement();
          ResultSet rslt=stmt.executeQuery(sql);
          
               while(rslt.next()){
                   SalePerOrder fi = new SalePerOrder();
                   fi.setOrderNumber(rslt.getInt("orderNumber"));
                   fi.setTotal(rslt.getDouble("total"));
                   lis.add(fi);   
               }
          
        }catch(Exception err){
            err.printStackTrace();
        }
         
        return lis;
    }

    public List<SalePerOrder>getByOrder(int order){
        
        kon = new koneksi().connection();
        
        List<SalePerOrder> lis = null;
        
        try{
            
          String sql = "select * from SalePerOrder where orderNumber="+order;

          lis = new ArrayList<SalePerOrder>();
          
          Statement stmt=kon.createStatement();
          ResultSet rslt=stmt.executeQuery(sql);
          
               while(rslt.next()){
                   SalePerOrder fi = new SalePerOrder();
                   fi.setOrderNumber(rslt.getInt("orderNumber"));
                   fi.setTotal(rslt.getDouble("total"));
                   lis.add(fi);   
               }
          
        }catch(Exception err){
            err.printStackTrace();
        }
         
        return lis;
    }

    @Override
    public void update(SalePerOrder b) {
         kon = new koneksi().connection();
        
        int OrderNumber = b.getOrderNumber();
        Double total = b.getTotal();
        
        try{
            String sql="update SalePerOrder set kode=?, nama=? where id=?";
            PreparedStatement stmt=kon.prepareStatement(sql);
            
                stmt.setInt(1,OrderNumber);
                stmt.setDouble(2,total);

                stmt.executeUpdate();
                
            stmt.close();

        }catch(Exception err){
            err.printStackTrace();
        }
    }

    @Override
    public void delete(int orderNumber) {
         kon = new koneksi().connection();
        
        try{
            
            String sql="delete from SalePerOrder where orderNumber="+ orderNumber;
            PreparedStatement stmt=kon.prepareStatement(sql);

            stmt.executeUpdate();
                
            stmt.close();
            
        }catch(Exception err){
            JOptionPane.showMessageDialog(null,"Order GAGAL dihapus!","Kesalahan",JOptionPane.ERROR_MESSAGE);
        }
          
    }

    @Override
    public List<SalePerOrder> getOrder(int orderNumber) {
        kon = new koneksi().connection();
        
        List<SalePerOrder> lis = null;
        
        try{
            
          String sql = "select * from SalePerOrder where orderNumber="+orderNumber;

          lis = new ArrayList<SalePerOrder>();
          
          Statement stmt=kon.createStatement();
          ResultSet rslt=stmt.executeQuery(sql);
          
               while(rslt.next()){
                   SalePerOrder fi = new SalePerOrder();
                   fi.setOrderNumber(rslt.getInt("orderNumber"));
                   fi.setTotal(rslt.getDouble("total"));
                   lis.add(fi);   
               }
          
        }catch(Exception err){
            err.printStackTrace();
        }
         
        return lis;
    }

    @Override
    public Integer getCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}