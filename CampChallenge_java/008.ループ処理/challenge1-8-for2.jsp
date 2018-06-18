<%-- 
    Document   : challenge1-8-for2
    Created on : 2018/06/17, 16:08:57
    Author     : southkaito
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    
String name = "A";   
for(int i = 0;i < 30;i++){
    name = name+"A";
    
}
out.print(name);
out.print("<br>");
%>
