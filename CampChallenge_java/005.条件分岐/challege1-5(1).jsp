<%-- 
    Document   : newjsp
    Created on : 2018/06/08, 22:14:21
    Author     : southkaito
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    
int number = 2;

if (number == 1){
    out.print("1です!");
}else if(number == 2){
    out.print("プログラミングキャンプ!");
}else{
    out.print("その他です!");
}

%>
