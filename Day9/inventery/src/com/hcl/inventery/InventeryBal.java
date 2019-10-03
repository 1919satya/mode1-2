package com.hcl.inventery;

public class InventeryBal {
	
		public static String generateStockIdBal() {
			return new InventeryDao().generateStockIdDao();
		}
		public static String addStockBal(Stock stock) {
			return new InventeryDao().addStockDao(stock);
		}
		
		public static Stock searchStockBal(String stockid) {
	         return new InventeryDao().searchStockDao(stockid);
		}
		
		public static String placeOrderBal(String stockId, int qnty) {
			return new InventeryDao().placeOrderDao(stockId,qnty);
		}
	}


