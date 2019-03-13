/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Method1;

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
@WebServlet(name = "method8", urlPatterns = {"/method8"})
public class method8 extends HttpServlet {

    String[] userProfile(int id){
        String[][] eachProfile = {
            {"1","技育太郎","東京","男","プログラマー"},
            {"2","技育花子","北海道","女","システムエンジニア"},
            {"3","技育三郎","大阪","男","Webエンジニア"}
        };
        
        for(String[] profile : eachProfile){
            int firstNumber = Integer.parseInt(profile[0]);
            
            if(id == firstNumber){
                return profile;
            }else
                return null;
        
        
        }
    
    
    }
        
    
            
            
          
    
                

                     
                 
                           
                    
                
        
    
    
    
    
    
    
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
        try (PrintWriter out = response.getWriter()) {
            
            String[][] number = {userProfile(1),userProfile(2),userProfile(3)};
            if(number == null){
                out.print("実行されません");
            }else{
                for(int i = 0;i < 3;i++ ){
                    for(int j = 1;j<number[i].length;j++){
                        
                        out.print(number[i][j]);
                    
                    }
                   
                }
            
            
            
            
            
            
            
        }
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet method8</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet method8 at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
