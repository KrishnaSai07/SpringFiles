package junit_demo1;

import static org.junit.Assert.*;

import org.junit.Test;

import com.verizon.service.MorningService;

public class TestMorningService {

	@Test
	public void testMorning()
	{
		String input="Vamsy";
		String expectedOutput="Good Morning Vamsy";
		
		MorningService ms = new MorningService();
		String actualOutput=ms.morningService(input);
		
		assertEquals(actualOutput,expectedOutput);
	}
	
	@Test
	public void testMorningWithNull()
	{
		String input=null;
		//String expectedOutput="Good Morning Vmasy";
		
		MorningService ms = new MorningService();
		String actualOutput=ms.morningService(input);
		
		assertNull(actualOutput);
	}
	

}
