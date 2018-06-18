<%-- 
    Document   : challenge1-8
    Created on : 2018/06/16, 21:43:54
    Author     : southkaito
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    
long result = 1;
for(long i = 0;i < 20;i++){
    result = result*8;
    out.print(result);
    out.print("<br>");
}


%>