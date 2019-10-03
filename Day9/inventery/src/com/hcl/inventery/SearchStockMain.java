package com.hcl.inventery;
  import java.util.Scanner;

	public class SearchStockMain {
	public static void main(String[] args) {
		System.out.println("Enter StockID ");
		Scanner sc = new Scanner(System.in);
		String stockid = sc.nextLine();
		Stock stock = InventeryBal.searchStockBal(stockid);
		System.out.println(stock);
	 }
	}


