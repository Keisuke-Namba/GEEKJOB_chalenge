<%-- 
    Document   : query_string_output
    Created on : 2018/12/09, 22:55:49
    Author     : southkaito
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    



String productname = request.getParameter("product");
int x =Integer.parseInt(productname);

if(x == 1){
    out.print("商品　雑貨");
}else if(x ==2){
    out.print("商品　生鮮食品");
}else if(x == 3){
    out.print("商品　その他");
}else{
    out.print("存在しません");
}

out.print("<br>");
int total=Integer.parseInt(request.getParameter("total"));
int count=Integer.parseInt(request.getParameter("count"));

out.print("総額は"+total+"円です");
out.print("<br>");
out.print("一個あたり"+(total/count)+"円です");

out.print("<br>");

if(total<3000){
    out.println("ポイントはつきません");
}else if(3000<=total && total< 5000){
    out.println("ポイントは"+(int)(total*0.04)+"円つきます");
}else{
    out.println("ポイントは"+(int)(total*0.05)+"円つきます");
    
    
}











%>