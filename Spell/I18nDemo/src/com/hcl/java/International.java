package com.hcl.java;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class International {
	public static void main(String[] args) {
		double d=123678.890;
		NumberFormat Nf=NumberFormat.getInstance(Locale.ITALY);
		NumberFormat Nf1=NumberFormat.getInstance(Locale.US);
		NumberFormat Nf2=NumberFormat.getInstance(Locale.ITALY);
		DateFormat Df1=DateFormat.getDateInstance(DateFormat.SHORT,Locale.ITALY);
		DateFormat Df2=DateFormat.getDateInstance(DateFormat.LONG,Locale.KOREA);
 System.out.println("Italy representation of "+d+":"+Nf.format(d) );
 System.out.println("Us representation of "+d+":"+Nf1.format(d) );
 System.out.println("China representation of "+d+":"+Nf2.format(d) );
 System.out.println("short representation of date in italy "+d+":"+Df1.format(new Date()) );
 System.out.println("long representation of date in Germany "+d+":"+Df2.format(new Date()) );

 

		
	}

}
