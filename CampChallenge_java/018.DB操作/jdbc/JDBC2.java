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
public class JDBC2 {
    
    public static void main(String[] args){
        Connection db_con = null;
        PreparedStatement db_st = null;
        ResultSet db_data = null;
    
    try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();//ドライバーのインスタンスの生成
            db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Challenge_db?serverTimezone=JST","KEI617","aaya0613");
    
            db_st = db_con.prepareStatement("SELECT * FROM profiles where name LIKE ?");
            db_st.setString(1, "%茂%");
           
            
            db_data = db_st.executeQuery();
            while(db_data.next()){
                System.out.println("profilesID:"+db_data.getInt("profilesID"));
                System.out.println("名前:"+db_data.getString("name"));
                System.out.println("電話番号:"+db_data.getString("tel"));
                System.out.println("年齢:"+db_data.getInt("age"));
                System.out.println("誕生日:"+db_data.getDate("birthday"));
    
            }
    
    db_con.close();
    db_st.close();
    db_data.close();
    
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
