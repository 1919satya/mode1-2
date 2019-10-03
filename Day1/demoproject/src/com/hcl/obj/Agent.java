package com.hcl.obj;

public class Agent {
public StringBuilder show(String agentId,String fullName,int maritalStatus,String zipCode) {
	StringBuilder sbError=new StringBuilder();
	boolean isValid=true;
	/* validation for agentId */
	if(!(agentId.charAt(0)=='A')){
		sbError.append("agent id starts with 'A' "+"\r\n");
		isValid=false;
	}
	/* validation for fullName */
	if(fullName.indexOf(' ')==-1){
		sbError.append("Name must be full"+"\r\n");
		isValid=false;
	}
	/* validation for maritalStatus */
	if(maritalStatus!=0 && maritalStatus!=1){
		sbError.append("please provide marital status as"+"\r\n");
		isValid=false;
	}
	if(zipCode.length()!=6){
		sbError.append("Zipcode is"+"\r\n");
	}
	if(isValid==true){
	sbError.append("AgentId is "+agentId+"\r\n");
	sbError.append("Name is "+fullName+"\r\n");
	sbError.append("Status is " +maritalStatus+"\r\n");
	sbError.append("zipCode "+zipCode+"\r\n");
}
	return sbError;
}
public static void main(String[] args) {
	String agentId;
	String fullName;
	int maritalStatus;
	String zipCode;
	agentId= "Amar";
	fullName="Ram raju";
	maritalStatus=0;
	zipCode="534269";
	StringBuilder sbRes= new Agent().show(agentId,fullName,maritalStatus,zipCode);
	System.out.println(sbRes);
		
}
}
