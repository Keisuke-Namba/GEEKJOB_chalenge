<%-- 
    Document   : HTML1
    Created on : 2018/12/03, 0:35:13
    Author     : southkaito
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        request.setCharacterEncoding("UTF-8");
            
            out.print(request.getParameter("txtName"));
            out.print(request.getParameter("gendar"));
            out.print(request.getParameter("mulText"));
            
    </body>
</html>
