function show() {
	var gen="";
	var radio =frmRadio.elements["gender"];
	for(var i=0;i<radio.length;i++) {
		if(radio[i].checked) {
			gen=radio[i].value;
		}
	}
	//document.getElementById("res").innerHTML=res;
	alert(gen);
}