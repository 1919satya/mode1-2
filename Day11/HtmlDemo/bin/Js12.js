/**
 * 
 */
function dateDemo() {
	var today= new Date();
	var fullyear=today.getFullYear();
	var future=new Date("December 31, " +fullyear);
	var diff =future.getTime()-today.getTime();
	
	var days=Math.ceil(diff /(1000 * 60 * 60 *24));
	var res="Only "+ days +"days left till new year day..";
	document.getElementById("res").innerHTML=res;
}