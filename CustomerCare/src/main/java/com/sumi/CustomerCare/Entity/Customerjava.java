package com.sumi.CustomerCare.Entity;

public class Customerjava {
	private int customerid;
	private String customername;
	private int customerphoneno;
	private String customerquries;
	
	
	public Customerjava() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customerjava(int customerid, String customername, int customerphoneno, String customerquries) {
		super();
		this.customerid = customerid;
		this.customername = customername;
		this.customerphoneno = customerphoneno;
		this.customerquries = customerquries;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public int getCustomerphoneno() {
		return customerphoneno;
	}
	public void setCustomerphoneno(int customerphoneno) {
		this.customerphoneno = customerphoneno;
	}
	public String getCustomerquries() {
		return customerquries;
	}
	public void setCustomerquries(String customerquries) {
		this.customerquries = customerquries;
	}
	@Override
	public String toString() {
		return "Customerjava [customerid=" + customerid + ", customername=" + customername + ", customerphoneno="
				+ customerphoneno + ", customerquries=" + customerquries + "]";
	}
	
	

	
	

}
