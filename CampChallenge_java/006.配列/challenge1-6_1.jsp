<%-- 
    Document   : challenge1-6
    Created on : 2018/06/13, 23:23:08
    Author     : southkaito
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "java.util.ArrayList" %>

<%
ArrayList<String>list = new ArrayList<String>();
        list.add("10");
        list.add("100");
        list.add("soeda");
        list.add("hayashi");
        list.add("-20");
        list.add("118");
        list.add("END");
               ;
        list.set(2,"33");
       
          out.print(list + "");
          
%>