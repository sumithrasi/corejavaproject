package com.sumi.CustomerCare;

import java.sql.SQLException;
import java.util.Scanner;

import com.sumi.CustomerCare.Entity.Customerjava;
import com.sumi.CustomerCare.service.Customerservice ;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Customerservice  as = new Customerservice ();
		int customerid ,customerphoneno ;
		double productquantity ;String customername,customerquries;float totalprice;
		char ch = 'Y';
		while(ch == 'Y')
		{
		System.out.println("********customer care managementSystem***********");
		System.out.println("1)Add customer\n2)View customer\n3)Views customer\n4)Updatecustomer\n5)Delete customer\n");
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter your choice: ");
		int option = ip.nextInt();
		switch(option)
		{
			case 1:
				System.out.println("Enter customer  details:");
				int count = ip.nextInt();
				as.addcustomer(count);
				break;
			case 2:
				System.out.println("Enter the customerid:");
				customerid = ip.nextInt();
				System.out.println(as.viewCustomer(customerid));
				break;
			case 3:
				for(Customerjava a:as.viewsCustomer())
				{
					System.out.println(a);
				}
				break;
			case 4:
				System.out.println("Enter the customer id :");
				customerid = ip.nextInt();
				System.out.println("Enter the customer name :");
				customername = ip.next();
				
				System.out.println("Enter the customerphoneno..");
				customerphoneno =ip.nextInt();
				System.out.println("Enter the customerquries:");
				customerquries = ip.next();
			try {
				as.updateCustomer(customerid,customername, customerphoneno,customerquries);
			} catch (SQLException e) {
				System.out.println(e);
				e.printStackTrace();
			}
				break;
			
			case 5:
				System.out.println("Enter the customerid:");
				customerid = ip.nextInt();
				as.deleteCustomer(customerid);
				break;
			
			default:
				System.out.println("Invalid Choice..");
				break;
		}
		System.out.println("Enter Y to continue...");
		ch = ip.next().charAt(0);
		}
		System.out.println("Thank you for using...");
    }

    }

