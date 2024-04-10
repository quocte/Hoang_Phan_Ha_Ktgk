package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import Quanlisach.Book;

public class DAo {

	private Connection con;
	public DAo() {
		try {
		  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		  con = DriverManager.getConnection("jdbc:sqlserver://ha\\may1:1433;databasename=luudulieu;"+ "username=sa;password=1122"); 	
	     }catch (Exception e) {
	    e.printStackTrace();
	}
		
		
//		  // Create a variable for the connection string.
	    String connectionUrl = "jdbc:sqlserver://ha\\may1:1433;databaseName=Quanli;user=sa;password=1122";

	    try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
	System.out.println("Thanh cong");
	    	
	    	
	    } catch (SQLException e) {
	       System.err.println("Loi");
	    	e.printStackTrace();
	    }
	   
	   }
	   public boolean add(modelNhanvien b) {
		   String sql = "INSERT INTO tblBook(ID, FullName ,phone, email,E_type)"+"VALUES(?,?,?,?,?)";
		  try { 
		PreparedStatement ps = con.prepareStatement(sql);
	      ps.setInt(1, b.getID());
	      ps.setString(2, b.getFullName()) ;
	      ps.setInt(3, b.getPhone() );
	      ps.setString(4, b.getEmail() );
	      ps.setString(5, b.getEmployee_Type());
	      return ps.executeUpdate()>0;
	   } catch (Exception e) {
	   e. printStackTrace();

	   }
		   
		   return false;
	   }
}
