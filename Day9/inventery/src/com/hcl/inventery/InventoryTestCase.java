package com.hcl.inventery;

import static org.junit.Assert.*;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

import com.hcl.inventery.DaoConnection;

public class InventoryTestCase {
	
	@Test
	public void testGenerateOrderId() {
		int orderid=1;
		Connection con=DaoConnection.getConnection();
		//String cmd="select orderid from stock order by orderid desc limit 1";
		String cmd= "SELECT MAX(orderid) orderid from orders";
		try {
			PreparedStatement pst=con.prepareStatement(cmd);
			ResultSet rs=pst.executeQuery();
			rs.next();
			orderid=rs.getInt("orderid");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void testGenerateStockId() {
		String stockid="";
		Connection con=DaoConnection.getConnection();
		String cmd="select max(stockid) stockid from stock";
		try {
			PreparedStatement pst=con.prepareStatement(cmd);
			ResultSet rs=pst.executeQuery();
			rs.next();
			stockid=rs.getString("stockid");
			int temp = Integer.parseInt(stockid.substring(1));
			System.out.println(temp);
			temp++;
			System.out.println(temp);
			stockid= String.format("S%03d", temp);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(stockid, InventeryBal.generateStockIdBal());
	}
	@Test
	public void testAddStock(){
		String addstck="";
		
		Connection con=DaoConnection.getConnection();
		Stock obj = new Stock();
		String sid=InventeryBal.generateStockIdBal();
		obj.setStockId(sid);
		obj.setItemName("Mobile");
		obj.setPrice(34500.00);
		obj.setquantityAvail(30);
		
		String cmd="Insert into stock values(?,?,?,?)";
		try {
			PreparedStatement pst=con.prepareStatement(cmd);
			pst.setString(1, obj.getStockId());
			pst.setString(2, obj.getItemName());
			pst.setDouble(3, obj.getPrice());
			pst.setInt(4, obj.getquantityAvail());
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals("Stock Added", InventeryBal.addStockBal(obj));
	}
	@Test
	public void testDaoConnection(){
		assertNotNull(DaoConnection.getConnection());
	}
	
	

	@Test
	public void testGetterAndSetter() {
		Stock objStock =new Stock();
		objStock.setStockId("S001");
		objStock.setItemName("mobile");
		objStock.setPrice(23000);
		objStock.setquantityAvail(10);
		assertEquals("S001",objStock.getStockId());
		assertEquals("mobile",objStock.getItemName());
		assertEquals(23000,objStock.getPrice(),0.00);
		assertEquals(10,objStock.getquantityAvail());


	}

}
