<%-- 
    Document   : challenge1-8while1
    Created on : 2018/06/17, 17:13:33
    Author     : southkaito
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
int i = 1000;
while(i > 100){
    i = i/2;
   
}
 out.print(i);

%>