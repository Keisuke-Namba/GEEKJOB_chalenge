<%-- 
    Document   : challenge1-7 array
    Created on : 2018/06/14, 16:57:56
    Author     : southkaito
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "java.util.HashMap" %>
<%
HashMap<String,String>datas = new HashMap<String,String>();
        datas.put("1","AAA");datas.put("hello","world");datas.put("soeda","33");datas.put("20","20");
        String[] data2 = {"1","hello","soeda","20"};
        for(int i = 0;i < data2.length;i++){
            out.print(datas.get(data2[i]));
            out.print("<br>");
        }
%>