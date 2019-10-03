package com.hcl.lambda;

public interface WithLambda {
	interface Drawable{  
	    public void draw();  
	}  
	  
	public class LambdaExpressionExample2 {  
	    public static void main(String[] args) {  
	        String width="hello world";  
	          
	        //with lambda  
	        Drawable d2=()->{  
	            System.out.println("Drawing "+width);  
	        };  
	        d2.draw();  
	    }  
	}  
}
