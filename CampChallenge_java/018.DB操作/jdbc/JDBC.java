/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;
import java.sql.*;
import java.time.LocalDate;



/**
 *
 * @author southkaito
 */
public class JDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Connection db_con = null;
    PreparedStatement db_st = null;
    
    try{
    Class.forName("com.mysql.jdbc.Driver").newInstance();
    db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Challenge_db?serverTimezone=JST","KEI617","aaya0613");
    
    db_st = db_con.prepareStatement("INSERT INTO profiles(profilesID,name,tel,age,birthday)VALUES(?,?,?,?,?);");
    db_st.setInt(1, 3);
    db_st.setString(2, "倉山満");
    db_st.setString(3,"080-2234-4534");
    db_st.setInt(4, 22);
    db_st.setDate(5, Date.valueOf("1996-6-17"));
    db_st.execute();
    
    
    
    db_con.close();
    db_st.close();
    
    
    
    
    
    
    }catch(SQLException e_sql){
        
    System.out.println("接続時にエラーが発生しました");
        
    }catch(Exception e){
        System.out.println("接続時にエラーが発生しました"+e.toString());
    }if (db_con != null){
  try {
    db_con.close();
  } catch (Exception e_con) {
      System.out.println(e_con.getMessage());
  }
}
    
}
}
