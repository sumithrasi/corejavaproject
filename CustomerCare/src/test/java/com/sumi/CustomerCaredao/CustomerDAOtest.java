package com.sumi.CustomerCaredao;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

import org.junit.Assert;
import org.junit.Test;

import com.sumi.CustomerCare.Dao.Customerdao;
public class CustomerDAOtest {
	Customerdao accdao = new Customerdao();
	@Test
	public void testGetConnect() {
		Assert.assertNotNull(accdao.getConnect());
	}
	
	@Test(expected=SQLIntegrityConstraintViolationException.class)
	public void testInsertcustomer() throws SQLException {
		accdao.insertCustomer(301,"Akshay",32000, "ww");
	}

	
	
	

	@Test
	public void testDeletecustomer() {
		Assert.assertEquals(1, accdao.deleteCustomer(105));
	}

	@Test
	public void testViewCustomer() {
		Assert.assertNotNull(accdao.viewCustomer(101));
	}

	@Test
	public void testViewscustomer() {
		Assert.assertNotNull(accdao.viewsAccounts());
	}

}





