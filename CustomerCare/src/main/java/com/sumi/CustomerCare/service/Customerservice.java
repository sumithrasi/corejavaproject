package com.sumi.CustomerCare.service;

import java.util.Scanner;

import com.sumi.CustomerCare.Dao.Customerdao;
import com.sumi.CustomerCare.Entity.Customerjava;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Customerservice {
	private Customerdao accDao = new Customerdao();
	private Scanner ip = new Scanner(System.in);
	
	public boolean addcustomer(int count) {
		int n = 0;
		while(count > 0)
		{
			System.out.println("Enter the customer id :");
			int customerid = ip.nextInt();
			System.out.println("Enter the customer name :");
			String customername = ip.next();
			System.out.println("Enter the customerphoneno:");
			int customerphoneno = ip.nextInt();
			System.out.println("Enter the customerquries..");
			String  customerquries=ip.next();
			
			try {
			if(accDao.insertCustomer(customerid,customername, customerphoneno,customerquries)==1);
				n++;
			}catch(Exception e)
			{
				System.out.println(e);
			}
			count--;
		}
		if(n>0)
			return true;
		else
			return false;
	}
	

	public Customerjava viewCustomer(int customerid) {
		return accDao.viewCustomer(customerid);
		
	}
	
	public  ArrayList <Customerjava> viewsCustomer() {
		return accDao.viewsAccounts();
		
	}

	public int updateCustomer(int customerid, String customername,int customerphoneno,String customerquries) throws SQLException{
		 {
		return accDao.updateCustomer(customerid,customername,customerphoneno,customerquries);

	}
	}
	public boolean deleteCustomer(int customerid) {
		accDao.deleteCustomer(customerid);
		return true;
		
	}

	

	
	
	}

