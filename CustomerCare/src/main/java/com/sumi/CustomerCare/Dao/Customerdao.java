package com.sumi.CustomerCare.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


import com.sumi.CustomerCare.Entity.Customerjava;


public class Customerdao {
	private Connection con;
	private PreparedStatement pst;
	
	private ResultSet rs;

	public Connection getConnect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/b6835", "root", "sumithra");
		} catch (Exception e) {
			System.err.println(e);
		}
		return con;
	}
	public int insertCustomer(int customerid, String customername,int customerphoneno,String customerquries) throws SQLException{
		{
		int n = 0;
		
		con = getConnect();
		pst = con.prepareStatement("insert into customers values(?,?,?,?)");
		pst.setInt(1, customerid);
		pst.setString(2, customername);
		pst.setInt(3, customerphoneno);
		pst.setString(4,customerquries );
		
		n = pst.executeUpdate();
	/*} catch (SQLException e) {
		e.printStackTrace();
	}*/
	return n;
}
	}
	

	public Customerjava viewCustomer(int customerid) {
		try {
			con = getConnect();
			ResultSet rs = null;
			pst = con.prepareStatement("select * from customers where customerid=?");
			pst.setInt(1, customerid);
			rs = pst.executeQuery();
			if(rs.next())
			{
				return new Customerjava(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	

	public ArrayList<Customerjava> viewsAccounts() {
		ArrayList<Customerjava> al = new ArrayList<Customerjava>();
		try {
			con = getConnect();
			ResultSet rs = null;
			pst = con.prepareStatement("select * from customers");
			rs = pst.executeQuery();
			while(rs.next())
			{
				al.add(new Customerjava());
			}
			return al;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	

	public int updateCustomer(int customerid, String customername,int customerphoneno,String customerquries) throws SQLException{
		  {
		int n = 0;
		try {
			con = getConnect();
			Statement st = con.createStatement();
			String sql = "update customers set customerid='"+customerid+"' where customername='"+customername+"'and customerphoneno='"+
					customerphoneno+"'and+ customerquries='"+customerquries+"'";
					
			n = st.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return n;
	}
	
	}
	

	public int deleteCustomer(int customerid) {
int n = 0;
		
		try {
			con = getConnect();
			pst = con.prepareStatement("delete from customers where customerid = ?");
			pst.setInt(1, customerid);
			n = pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return n;
	}



}
	
		
	
	


	
	

		
