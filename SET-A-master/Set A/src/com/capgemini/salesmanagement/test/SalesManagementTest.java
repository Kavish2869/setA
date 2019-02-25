package com.capgemini.salesmanagement.test;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import com.capgemini.salesmanagement.dao.ISaleDAO;
import com.capgemini.salesmanagement.dao.SaleDAO;
import com.capgemini.salesmanagement.service.SaleService;


   
public class SalesManagementTest {
public static	SaleService  service;
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	
	service= new SaleService();
	}

	@Before
	public static void  testEvn() {
	
	}
	
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	

}
