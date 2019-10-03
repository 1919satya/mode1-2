package com.hcl.Boxing;

public class Cricket {
	
	static int score;
	
	public void incr(int x){
		score+=x;
		
	}
	public static void main(String[] args) {
		Cricket fb=new Cricket();
		Cricket sb=new Cricket();
		Cricket ext=new Cricket();
		
		fb.incr(67);
		sb.incr(45);
		ext.incr(57);
		System.out.println(Cricket.score);
	}

}
