import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import org.junit.runner.RunWith;
import static org.junit.Assume.*;


public class BisiestosTest
{
   
   @Test
   public void isLeap()
	{
		int year = 0;
		boolean result = Bisiestos.esBisiesto(year);
		assertFalse(result);
	}
	
	@Test
	public void isLeap2()
	{
		int year = 400;
		boolean result = Bisiestos.esBisiesto(year);
		assertTrue(result);
	}
	
	@Test
	public void isLeap3()
	{
		int year = 101;
		boolean result = Bisiestos.esBisiesto(year);
		assertFalse(result);
	}
	
	@Test
	public void isLeap4()
	{
		int year = -400;
		boolean result = Bisiestos.esBisiesto(year);
		assertTrue(result);
	}
	
  }
   
