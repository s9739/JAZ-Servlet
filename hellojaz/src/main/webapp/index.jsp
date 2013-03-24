<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        2 + 2 =<%= 2+2 %><br>
        ala ma kota <br>
        
        <%= new java.util.Date() %><br>
        Server: <%= application.getServerInfo() %><br><br>
        
        
        <%for(int i=0; i<10; i++) {
        	for(int j=14; j<15; j++){%>
        *
        <%} %>
        <br>
        <%} %>
        
        Imie podane w formularzu: <%= session.getAttribute("name") %><br>
         
        <%-- Dyrektywy --%> 
         
        <%@page import="java.util.*" %>
        <%=new Date() %>
        
        <%--<%include file="banner.txt" --%><br>
        
        <%--Deklaracja pol i metod klasy --%>
        <%!Date data = new Date(); %>
        Strona dziala od: <%= data %>
        
    </body>
</html>
