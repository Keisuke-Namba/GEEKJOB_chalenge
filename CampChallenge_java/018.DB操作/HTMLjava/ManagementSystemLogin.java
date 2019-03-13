/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HTMLjava;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;
import HTMLjava.Info;

/**
 *
 * @author southkaito
 */
@WebServlet(name = "ManagementSystemLogin", urlPatterns = {"/ManagementSystemLogin"})
public class ManagementSystemLogin extends HttpServlet {

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
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        
        
        try (PrintWriter out = response.getWriter()) {
            
            request.setCharacterEncoding("UTF-8");
            int uid = Integer.parseInt(request.getParameter("uid"));
            String password = request.getParameter("password");
            
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Challenge_db?serverTimezone=JST","KEI617","aaya0613");
            
            ps = db_con.prepareStatement("SELECT * FROM personal WHERE userID = ? and password = ?");
            ps.setInt(1, uid);
            ps.setString(2, password);
            ps.execute();
            
            rs = ps.executeQuery();
            rs.last();
            
            
            if(rs.getRow() == 0){//これはつまり行番号がないということ
               
               RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/LoginFailed.jsp");
               rd.forward(request, response);
               
           }else{
               
              
               
               
               RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/LoguiSucsses.jsp");
               rd.forward(request, response);
               
               
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
