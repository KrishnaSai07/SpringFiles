package com.verizon.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.verizon.model.Grade;
import com.verizon.service.ScoringService;

@RunWith(Parameterized.class)
public class TestScoringServiceGetGrade {

	private double inputAvg;
	private Grade expectedGrade;
	ScoringService ss;
	
	
	
	public TestScoringServiceGetGrade(double inputAvg, Grade expectedGrade) {
		super();
		this.inputAvg = inputAvg;
		this.expectedGrade = expectedGrade;
	}
	
	@Parameters
	public static Collection TestData()
	{
		Object[][] data= {
				{95,Grade.A},
				{85,Grade.B},
				{75,Grade.C},
				{69,Grade.F}				
		};
		return Arrays.asList(data);
		
	}

	@Before
	public void setUp() throws Exception {
		this.ss=new ScoringService();
	}

	@After
	public void tearDown() throws Exception {
		this.ss=null;
	}
	
	@Test
	public void testForScoreGreaterThan90() {
		assertEquals(expectedGrade, ss.getGrade(inputAvg));
	}
	
	/*
	@Test
	public void testForScoreGreaterThan90() {
		assertEquals(Grade.A, ss.getGrade(91));
	}
	
	@Test
	public void testForScoreGreaterThan80() {
		assertEquals(Grade.B, ss.getGrade(81));
	}
	@Test
	public void testForScoreGreaterThan70() {
		assertEquals(Grade.C, ss.getGrade(71));
	}
	@Test
	public void testForScoreLessThan70() {
		assertEquals(Grade.F, ss.getGrade(61));
	}*/

}
