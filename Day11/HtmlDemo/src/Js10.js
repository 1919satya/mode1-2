/**
 * 
 */
function strDemo() {
	var str="welcome to HTML programming....";
	var len=str.length;
	res +="Length is "+len +"<br/>";
	res +="lower case is" +str.toLowerCase()+"<br/><br/>";
	res +="upper case is  "+str.toUpperCase()+"<br/><br/>";
	res +="first occurence is "+ str.indexOf("a") +"<br/> <br/>";
	res +="Char a position 5 is "+str.charAt(5) +"<br/> <br/>";
	res +="replacing string is " +str.replace("HTML","HTML 5") +"<br/> <br/>";
	document.getElementById("res").innerHTML=res;
}