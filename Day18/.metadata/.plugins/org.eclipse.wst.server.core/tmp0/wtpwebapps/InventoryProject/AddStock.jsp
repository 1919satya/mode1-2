
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.hcl.inventory.DaoConnection"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Connection con=DaoConnection.getConnection();
String cmd="select max(stockId)+1 stockId from Inventory";
PreparedStatement pst=con.prepareStatement(cmd);
ResultSet rs=pst.executeQuery();
rs.next();
String stockId=rs.getString("stockId");


%>
<form method="get"value="<%=stockId %>" action="AddStock.jsp">
<center>
Stock Id :
<input type="text"  name="stockId" readonly="readonly"/> <br/>

Item Name :
<input type="text" name="itemName"/> <br/>
Price :
<input type="text" name="price"/> <br/>
Quantity Avail :
<input type="text" name="quantityAvail"/> <br/>

<input type="submit" value="Insert"/> <br/>

</center>
</form>
<%
if(request.getParameter("stockId")!=null && 
request.getParameter("price")!=null) {
	
	  cmd="insert into Inventory values(?,?,?,?)";
	 pst=con.prepareStatement(cmd);
	pst.setString(1,request.getParameter("stockId"));
	pst.setString(2,request.getParameter("itemName"));
	pst.setString(3,request.getParameter("price"));
	pst.setString(4,request.getParameter("quantityAvail"));
	pst.executeUpdate();
	%>
	<jsp:forward page="ShowStock.jsp"/>
	<% 
}

%>
</body>
</html>