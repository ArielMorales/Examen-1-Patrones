package examen.cenfotec.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import org.junit.Assert;

import examen.cenfotec.logic.Analytics;

public class AnalyticsTest {

	public AnalyticsTest() {
		
	}
	
	@Test
	public void maxTest() {
		String a = "casa casita casota";
		
		int result = Analytics.max(a);
		
		assertEquals(6, result, "Result should be 6 as int");
	}

	
	@Test
	public void minTest() {
		String a = "casa casita casota";
		
		int result = Analytics.min(a);
		
		assertEquals(4, result, "Result should be 4 as int");
	}
	
	@Test
	public void repetitionTest() {
		String a = "casa casita casota";
		int b = 6;
		
		int result = Analytics.repetitions(b, a);
		
		assertEquals(2, result, "Result should be 2 as int");
	}
	
	
}
