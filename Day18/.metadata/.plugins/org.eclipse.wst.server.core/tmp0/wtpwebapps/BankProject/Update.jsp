<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="Menu.html"></jsp:include> <br/><br/>
<form  method="get" action="UpdateAccount.jsp">
  <center>
      Account No:
      <input type="text" name="accno"/> <br/><br/>
     City :
     <input type="text" name="city"/> <br/><br/>
     State :
     <input type="text" name="state"/> <br/><br/>
     <input type="submit" value="Update">
  </center>
  
  </form>
</body>
</html>