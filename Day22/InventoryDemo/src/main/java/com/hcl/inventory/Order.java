package com.hcl.inventory;

public class Order {
	private int qtyord;
	private int orderid;
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	private Product objproduct;
	
	public int getQtyord() {
		return qtyord;
	}
	public void setQtyord(int qtyord) {
		this.qtyord = qtyord;
	}
	
	public Product getObjproduct() {
		return objproduct;
	}
	public void setObjproduct(Product objproduct) {
		this.objproduct = objproduct;
	}
public void display() {
	System.out.println("Quantity orderd :"+
 qtyord+"order ID :"+orderid);
	objproduct.product();
	
}

}
