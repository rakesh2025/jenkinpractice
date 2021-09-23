package com.comcasttest;

import org.testng.annotations.Test;

public class ContactTest {
	@Test(groups = "RegressionSuite")
	public void createContactTest() {
		System.out.println("createContactTest");
	}
	@Test(groups = "SmokeSuite")
	public void createContactWithOrgTest() {
		System.out.println("createContactWithOrgTest");
	}
	@Test(groups = "SmokeSuite")
	public void deleteContactTest() {
		System.out.println("deleteContactTest");
	}
	@Test(groups = "SmokeSuite")
	public void deleteTest() {
		System.out.println("deleteTest");
	}
	@Test(groups = "SmokeSuite")
	public void deleTest() {
		System.out.println("deleTest");
	}

}
