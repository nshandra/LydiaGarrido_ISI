import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.*;
import java.util.*;

public class EmbotelladoraTest
{
	Embotelladora embotelladora = new Embotelladora();
	public int pequenas, grandes, total;

	//Testing b1: grandes, pequenas o total son negativos
	@Test (expected = RuntimeException.class)
	public void negativeTest()
	{
		pequenas = -1;
		grandes = 0;
		total = 3;
		embotelladora.calculaBotellasPequenas(pequenas, grandes, total);
	}
	
	//Testing b2: total > miCapacidad
	@Test (expected = RuntimeException.class)
	public void b2Test()
	{
		pequenas = 4;
		grandes = 1;
		total = 20;
		embotelladora.calculaBotellasPequenas(pequenas, grandes, total);
	}
	
	//Testing b3: total <= miCapacidad y total-5*grandes<0
	@Test
	public void b3Test()
	{
		pequenas = 2;
		grandes = 5;
		total = 5;
		assertTrue ("b3Test", embotelladora.calculaBotellasPequenas(pequenas, grandes, total) == 0);
	}
	
	//Testing b4: total <= miCapacidad y total-5*grandes>0
	@Test
	public void b4Test()
	{
		pequenas = 3;
		grandes = 1;
		total = 7;
		assertTrue ("b4Test", embotelladora.calculaBotellasPequenas(pequenas, grandes, total) == 2);
	}
	
	//Testing b5: total <= miCapacidad y total-5*grandes=0
	@Test
	public void b5Test()
	{
		pequenas = 0;
		grandes = 4;
		total = 20;
		assertTrue ("b5Test", embotelladora.calculaBotellasPequenas(pequenas, grandes, total) == 0);
	}
}
