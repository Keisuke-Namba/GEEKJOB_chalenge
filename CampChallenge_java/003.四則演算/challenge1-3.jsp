<%-- 
    Document   : challenge1-3
    Created on : 2018/06/07, 15:10:24
    Author     : southkaito
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
   
final int NUMBER = 100;
int date = 17;
    
 int tasu = NUMBER + date;
 out.print(tasu);
 
 int hiku = NUMBER - date;
 out.print(hiku);
 
 int kakeru = NUMBER*date;
 out.print(kakeru);
 
 int waru = NUMBER/date;
 out.print(waru);
 
%>