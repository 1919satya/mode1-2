<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="Menu.html"></jsp:include> <br/><br/>
<form  method="get" action="WithdrawAccount.jsp">
<center>
Account No:
<input type="text" name="accno"><br/><br/>
Amount :
<input type="text" name="amount"><br/><br/>
<input type="submit" value="Withdraw">

</center>
</form>
</body>
</html>