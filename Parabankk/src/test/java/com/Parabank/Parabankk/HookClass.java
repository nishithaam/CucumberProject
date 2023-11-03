package com.Parabank.Parabankk;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HookClass {
	
	@Before
	public static void setUp() {
		HelperClass.setUpDRiver();
	}
	
	@After
	public static void  tearDown() {
		HelperClass.tearDown();
	}

}
