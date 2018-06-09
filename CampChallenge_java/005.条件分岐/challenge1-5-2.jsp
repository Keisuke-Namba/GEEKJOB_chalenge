<%-- 
    Document   : challenge1-5-2
    Created on : 2018/06/09, 14:45:10
    Author     : southkaito
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<body>
<%
int number = 45;
    
switch(number){
    case 1:
        out.print("one");
        break;
        
    case 2:
        out.print("two");
        break;
        
    default:
        out.print("想定外");
        break;
}
%>
<body>
