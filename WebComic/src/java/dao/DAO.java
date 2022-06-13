
package dao;

import context.DBContext;
import entity.Account;
import entity.Bill;
import entity.Category;
import entity.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<Product> getAllProduct() {
        List<Product> list = new ArrayList<>();
        String query = "select * from product";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getString(5)));
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    public List<Bill> getAllBill() {
        List<Bill> list = new ArrayList<>();
        String query = "select * from bill";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Bill(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5)));
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    public List<Product> getProductByCID(String cid) {
        List<Product> list = new ArrayList<>();
        String query = "select * from product where cate_ID = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, cid);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getString(5)));
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    public List<Product> searchByName(String txt) {
        List<Product> list = new ArrayList<>();
        String query = "select * from product where name like ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, "%"+txt+"%");
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getString(5)));
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    public Product getProductByID(String id) {
        List<Product> list = new ArrayList<>();
        String query = "select * from product where id = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getString(5));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public List<Category> getAllCategory() {
        List<Category> list = new ArrayList<>();
        String query = "select * from category";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Category(rs.getInt(1),
                        rs.getString(2)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public Product getLast() {
        String query = "select * from product order by id desc limit 1";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                return new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getString(5));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public Account login(String user, String pass){
        String query = "select * from account where user = ? and pass = ?";
        try{
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            while(rs.next()){
                return new Account(rs.getInt(1), 
                        rs.getString(2), 
                        rs.getString(3), 
                        rs.getInt(4));
            }
        } catch(Exception e){
            System.out.println(e);
        }
        return null;
    }
    
    public Account accountExist(String user){
        String query = "select * from account where user = ?";
        try{
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            rs = ps.executeQuery();
            while(rs.next()){
                return new Account(rs.getInt(1), 
                        rs.getString(2), 
                        rs.getString(3), 
                        rs.getInt(4));
            }
        } catch(Exception e){
            System.out.println(e);
        }
        return null;
    }
    
    public void signup(String user, String pass){
        String query = "insert into account(user, pass, isAdmin)\n" +
            "values(?, ?, 0)";
        try{
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            ps.executeUpdate();
        } catch(Exception e){
            System.out.println(e);
        }
    }
    
    public void deleteProduct(String pid){
        String query = "delete from product where id = ?";
        try{
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, pid);
            ps.executeUpdate();
        } catch(Exception e){
            System.out.println(e);
        }
    }
    
    public void insertProduct(String name, String image, String price, 
            String description, String category){
        String query = "insert into product(name, image, price, description, cate_ID)\n"
                + "value(?, ?, ?, ?, ?)";
        try{
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, image);
            ps.setString(3, price);
            ps.setString(4, description);
            ps.setString(5, category);
            ps.executeUpdate();
        } catch(Exception e){
            System.out.println(e);
        }
    }
    
    public void insertBill(String name, String address, String phone, 
            String product){
        String query = "insert into bill(name, address, phone, product)\n"
                + "value(?, ?, ?, ?)";
        try{
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, address);
            ps.setString(3, phone);
            ps.setString(4, product);
            ps.executeUpdate();
        } catch(Exception e){
            System.out.println(e);
        }
    }
    
    public void editProduct(String name, String image, String price, 
            String description, String category, String id){
        String query = "update product set name = ?, image = ?, price = ?, "
                + "description = ?, cate_ID = ? "
                + "where id = ?";
        try{
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, image);
            ps.setString(3, price);
            ps.setString(4, description);
            ps.setString(5, category);
            ps.setString(6, id);
            ps.executeUpdate();
        } catch(Exception e){
            System.out.println(e);
        }
    }

}
