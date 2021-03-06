/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HTMLjava;
import java.sql.*;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author southkaito
 */
@WebServlet(name = "JDBChtml9", urlPatterns = {"/JDBChtml9"})
public class JDBChtml9 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        Connection db_con = null;
        PreparedStatement db_st = null;
        ResultSet db_data = null;
        
        
        
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
           
           request.setCharacterEncoding("UTF-8");
            String name = request.getParameter("name");
           int age = Integer.parseInt(request.getParameter("age"));
           String birthday = request.getParameter("birthday");
            
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();//ドライバーのインスタンスの生成
            db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Challenge_db?serverTimezone=JST","KEI617","aaya0613");
            
            db_st = db_con.prepareStatement("SELECT * FROM profiles WHERE age = ? OR name = ? OR birthday = ?");
            db_st.setInt(1, age);
            db_st.setString(2, name);
            db_st.setDate(3, Date.valueOf(birthday));
            db_st.execute();
            
            db_data = db_st.executeQuery();
            while(db_data.next()){
                 out.println("profilesID:"+db_data.getInt("profilesID")+"<br>");
                 out.println("名前:"+db_data.getString("name")+"<br>");
                 out.println("電話番号:"+db_data.getString("tel")+"<br>");
                 out.println("年齢:"+db_data.getInt("age")+"<br>");
                 out.println("誕生日:"+db_data.getDate("birthday")+"<br>");
                 out.println("<br>");
                
            }
            
      
            
            
            
            
        
        
        
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

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
