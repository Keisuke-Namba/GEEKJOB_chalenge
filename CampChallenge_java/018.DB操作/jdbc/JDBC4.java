/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;
import java.sql.*;

/**
 *
 * @author southkaito
 */
public class JDBC4 {
    
    public static void main(String[] args){
        Connection db_con = null;
        PreparedStatement db_st = null;
        ResultSet db_data = null;
        
    
    try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();//ドライバーのインスタンスの生成
            db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Challenge_db?serverTimezone=JST","KEI617","aaya0613");
            
            db_st = db_con.prepareStatement("UPDATE profiles SET name = ?,tel = ?,age = ?,birthday = ? WHERE profilesID = ?");
            db_st.setString(1, "南葉圭祐");
            db_st.setString(2, "090-2529-6432");
            db_st.setInt(3, 26);
            db_st.setDate(4, Date.valueOf("1993-06-17"));
            db_st.setInt(5, 3);
            db_st.execute();
            
            
    
        
    
            db_data.close();
            db_st.close();
            db_con.close();
    
    
    }catch(SQLException e_sql){
            System.out.println("接続時にエラーが発生しました"+e_sql.toString());
            
        }catch(Exception e){
            System.out.println("接続時にエラーが発生しました"+e.toString());
        }finally{
            if(db_con != null){
                try{
                    db_con.close();
                }catch(Exception e_con){
                    System.out.println(e_con.getMessage());
                }
            }
        }
    
    
    }
    
}
