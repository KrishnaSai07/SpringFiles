package com.verizon.test;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.verizon.service.LoanService;
@RunWith(Parameterized.class)
public class TestLoanService {
	
	private double p;
	private double r;
	private double t;
	
	LoanService ls;
	
	
	
	
	public TestLoanService(double p, double r, double t) {
		super();
		this.p = p;
		this.r = r;
		this.t = t;
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testInterest() {
		fail("Not yet implemented");
	}

}
