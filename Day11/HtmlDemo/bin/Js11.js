/**
 * 
 */
function show() {
	var res="";
	var obj= new Date();
	res +="todays date is " + obj.getDate() +"<br/> <br/>";
	var month=obj.getMonth();
	month=month+1;
	res +="month is " + month + "<br/> <br/>";
	res +="year is " + obj.getFullYear() +"<br/> <br/>";
	res +="minutes are " + obj.getMinutes() +"<br/> <br/>";
	res +="seconds are " + obj.getSeconds() +"<br/><br/>";
	document.getElementById("res").innerHTML=res;
	}