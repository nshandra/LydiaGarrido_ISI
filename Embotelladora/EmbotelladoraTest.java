import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.*;
import java.util.*;

@RunWith (Parameterized.class)
public class EmbotelladoraTest
{
	public int pequenas, grandes, total;

	public EmbotelladoraTest (int pequenas, int grandes, int total)
	{
		this.pequenas = pequenas;
		this.grandes = grandes;
		this.total = total;
	}
	
	@Parameters
	public static Collection<Object[]> embotelladoraValues()
	{
		return Arrays.asList (new Object [][] {{0, 0, 0}, {10,2,40}});
	}

	@Test
	public void enoughTest()
	{
		assertTrue ("Enough Test", total - (grandes*5) >= pequenas);
	}
}
		
  
