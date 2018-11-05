package com.verizon.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.verizon.exception.ScoreException;
import com.verizon.service.ScoringService;

public class TestScoringServiceGetPercentage {

	private ScoringService ss;
	@Before
	public void setUp() throws Exception {
		this.ss=new ScoringService();
	}

	@After
	public void tearDown() throws Exception {
		this.ss=null;
	}

	@Test
	public void testGetPercentageWithValidData() {
		int [] marks= {50,60,50};
		int maxMark= 100;
		double expectedPercent = 53.33;
		try {
			double actual = ss.getPercentage(marks, maxMark);
			assertEquals(expectedPercent,actual,0.05);
		} catch (ScoreException e) {
			// TODO Auto-generated catch block
			fail("Exception not to be rase in this case");
		}
		
	}
	@Test(expected = ScoreException.class)	//for it to be correct the test case must pass, the exception should come, then only correct	
	public void testGetPercentageWithNullMarks() throws ScoreException {
		int[] marks = null;		
		int maxMark = 100;		
		ss.getPercentage(marks, maxMark);		
		fail("Expecting an exception");	
	}			
	@Test(expected = ScoreException.class)	public void testGetPercentageWithNegativeMarks() throws ScoreException {
		int[] marks = {23,-44,55};	
		int maxMark = 100;		
		ss.getPercentage(marks, maxMark);		
		fail("Expecting an exception");	
		}		
	@Test(expected = ScoreException.class)
	public void testGetPercentageWithNullMaxMarks() throws ScoreException {	
		int[] marks = {45,56,67};	
		int maxMark = 0;		
		ss.getPercentage(marks, maxMark);	
		fail("Expecting an exception");	
		}	

		
}
