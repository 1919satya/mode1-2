<%@page import="com.hcl.jsp.DaoConnection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>

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
 int deptno=Integer.parseInt(request.getParameter("deptno"));
Connection con=DaoConnection.getConnection();
String cmd="Delete from Department Where Deptno=?";
PreparedStatement pst=con.prepareStatement(cmd);
pst.setInt(1,deptno);
pst.executeUpdate();


    %>
	<jsp:forward page="DepartmentShow.jsp"/>
	
</body>
</html>