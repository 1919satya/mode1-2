package com.hcl.inventery;
      public class Order {
	  private int orderid;
	  private String stockid;
	  private int qtyOrd;
	  private double billAmt;
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public String getStockid() {
		return stockid;
	}
	public void setStockid(String stockid) {
		this.stockid = stockid;
	}
	public int getQtyOrd() {
		return qtyOrd;
	}
	public void setQtyOrd(int qtyOrd) {
		this.qtyOrd = qtyOrd;
	}
	public double getBillAmt() {
		return billAmt;
	}
	public void setBillAmt(double billAmt) {
		this.billAmt = billAmt;
	}
	@Override
	public String toString() {
		return "Order [orderid=" + orderid + ", stockid=" + stockid + ", qtyOrd=" + qtyOrd + ", billAmt=" + billAmt + "]";
	}
	  

	}


