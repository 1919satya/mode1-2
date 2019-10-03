package com.hcl.library;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hcl.library.Books;
import com.hcl.library.DaoConnection;

public class BooksDao {
	
	
	
	 public List<Books> searchBooksDao(String criteria,String value) {

		    Connection  con = DaoConnection.getConnection();
		    String cmd = "SELECT * FROM Books WHERE ";
		    List<Books> books=new ArrayList<Books>();
		    try {
		    	
		       PreparedStatement pst=null;
		       if(criteria.equals("Id")){
		    	   cmd +="Id=?";
		    	   pst=con.prepareStatement(cmd);
		    	   pst.setInt(1,Integer.parseInt(value));
		       }else  if(criteria.equals("Name")){
		    	   cmd +="Name=?";
		    	   pst=con.prepareStatement(cmd);
		    	   pst.setString(1,value);
		    	   
		       }else  if(criteria.equals("Author")){
		    	   cmd +="Author=?";
		    	   pst=con.prepareStatement(cmd);
		    	   pst.setString(1,value);
		       }else  if(criteria.equals("Dept")){
		    	   cmd +="Dept=?";
		    	   pst=con.prepareStatement(cmd);
		    	   pst.setString(1,value);
		       }else  if(criteria.equals("TotalBooks")){
		    	   cmd +="1=?";
		    	   pst=con.prepareStatement(cmd);
		    	   pst.setString(1,value);
		       } else {
		    	   System.out.println("***error***");
		       }
		      ResultSet rs = pst.executeQuery();
		      while (rs.next()) {
		       Books objBooks = new Books();
		        objBooks.setId(rs.getInt("Id"));
		        objBooks.setName(rs.getString("Name"));
		        objBooks.setAuthor(rs.getString("Author"));
		        objBooks.setEdition(rs.getString("Edition"));
		        objBooks.setDept(rs.getString("Dept"));
		        objBooks.setTotalBooks(rs.getInt("TotalBooks"));
		        
		      }
		    } catch (SQLException e) {
		      e.printStackTrace();
		    }
		    return books;
		  }

}
