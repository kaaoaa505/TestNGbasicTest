package com.example.demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestingAnnotationsForTestNG {
	
	@Test
	public void test01() {
		System.out.println("01");
	}
	
	@Test
	public void test02() {
		System.out.println("02");
	}
	
	@BeforeMethod
	public void testBeforeMethod() {
		System.out.println("before method");
	}
	
	@AfterMethod
	public void testAfterMethod() {
		System.out.println("after method");
	}
	
	@BeforeClass
	public void testBeforeClass() {
		System.out.println("before class");
	}
	
	@AfterClass
	public void testAfterClass() {
		System.out.println("after class");
	}
	
	@BeforeTest
	public void testBeforeTest() {
		System.out.println("before test");
	}
	
	@AfterTest
	public void testAfterTest() {
		System.out.println("after test");
	}
	
	@BeforeSuite
	public void testBeforeSuite() {
		System.out.println("before suite");
	}
	
	@AfterSuite
	public void testAfterSuite() {
		System.out.println("after suite");
	}

}
