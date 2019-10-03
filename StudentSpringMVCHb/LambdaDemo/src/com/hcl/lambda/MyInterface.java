package com.hcl.lambda;

public interface MyInterface {
	interface Drawable{  
	    public void draw();  
	}  
	public class LambdaExpressionExample {  
	    public static void main(String[] args) {  
	        String width="hello world";  
	  
	        //without lambda, Drawable implementation using anonymous class  
	        Drawable d=new Drawable(){  
	            public void draw(){System.out.println("Drawing "+width);}  
	        };  
	        d.draw();  
	    }  
	}  
}
