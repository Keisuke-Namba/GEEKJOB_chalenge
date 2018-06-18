<%-- 
    Document   : challenge1-8for3
    Created on : 2018/06/17, 16:32:49
    Author     : southkaito
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    
int amount = 0;
for(int i = 1;i <= 100;i++){
    amount = amount + i;
    
}
out.print(amount);
%>