import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.*;
import java.util.*;

@RunWith (Parameterized.class)
public class DescuentoBlackFridayTest
{
   public double po, pf;

   public DescuentoBlackFridayTest (double po, double pf)
   {
      this.po = po;
      this.pf = pf;
   }

  @Parameters
  public static Collection<Object[]> fridayValues()
  {
		//Si no es 23 de noviembre
      return Arrays.asList (new Object [][] {{20.0, 10.0}, {15.0, 15.0}, {30.0, 30.0}});
  }
	
  //@Parameters
  //public static Collection<Object[]> fridayValues2()
  //{
		//Si es 23 de noviembre
      //return Arrays.asList (new Object [][] {{20.0, 14.0}, {15.0, 10.5}, {30.0, 22.0}});
  //}

	@Test
  public void additionTest()
  {
     assertTrue ("Addition Test", pf == DescuentoBlackFriday.PrecioFinal(po));
  }
}
		
  
