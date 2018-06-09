<%-- 
    Document   : fiizzbazz
    Created on : 2018/06/09, 16:03:22
    Author     : southkaito
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ナベアツ課題</title>
</head>
<body>
    <h1>ナベアツ課題</h1>
       <% 
        //　----------ここから下へソースコードを書く------------
        for(int i = 1;i <= 40; i++){
            out.print(i);
            if (i%3 == 0 || String.valueOf(i).indexOf("3")!=-1){
                out.print("アホになります");
            }else if (i%5 == 0){
                out.print("犬っぽくなる");
            }
            out.print("<br>");
            
        }

        
       //　-------------------------ここまで------------------------------
        %>
</body>
</html>
