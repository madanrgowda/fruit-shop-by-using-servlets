<%@page import="dto.Fruits_Shop"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>List of customer</h1>
<% List<Fruits_Shop> list1=(List<Fruits_Shop>)request.getAttribute("li"); %>
<table border="1">
<tr>
<th>Customer-Name</th>
<th>Phoneno</th>
<th>Apple</th>
<th>Orange</th>
<th>Pineapple</th>
<th>Guava</th>
<th>Grapes</th>
<th>Total-Cost</th>
</tr>
<%for(Fruits_Shop d1:list1){ %>
<tr>
<td><%=d1.getName()%></td>
<td><%=d1.getNumber() %></td>
<td><%=d1.getAppleQty()%></td>
<td><%=d1.getOrangeQty() %></td>
<td><%=d1.getPineappleQty() %></td>
<td><%=d1.getGuavaQty()%></td>
<td><%=d1.getGrapesQty()%></td>
<td><%=d1.getTotal()%></td>
<%} %>
</tr>
</table>
</body>
</html>