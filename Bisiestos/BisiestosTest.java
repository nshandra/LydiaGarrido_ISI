import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import org.junit.runner.RunWith;
import static org.junit.Assume.*;


public class BisiestosTest
{
   
	//Test para comprobar años inválidos.

   	@Test (expected = RuntimeException.class)
   	public void isLeap()
	{
		int year = 0;
		Bisiestos.esBisiesto(year);
	}

	@Test (expected = RuntimeException.class)
   	public void isLeap2()
	{
		int year = -1;
		Bisiestos.esBisiesto(year);
	}

	//Año divisible entre 400
	
	@Test
	public void isLeap3()
	{
		int year = 400;
		boolean result = Bisiestos.esBisiesto(year);
		assertTrue(result);
	}
	

	//Año no divisible entre 4, 100 y 400

	@Test
	public void isLeap4()
	{
		int year = 101;
		boolean result = Bisiestos.esBisiesto(year);
		assertFalse(result);
	}
	
	//Año no bisiesto

	@Test
	public void isLeap5()
	{
		int year = 1;
		boolean result = Bisiestos.esBisiesto(year);
		assertTrue(result);
	}
	
  }
   
