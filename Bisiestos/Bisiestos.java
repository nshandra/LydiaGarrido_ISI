import java.util.*;

public class Bisiestos
{
	// Devuelve true si año es bisiesto, false en caso contrario
	// No se especifica qué ocurre si el número es negativo
	
	public static boolean esBisiesto(int year) {
		if(year == 0 || year < 0)
			throw new RuntimeException("Year not valid");
		if(year%4 == 0)
			if(year%100 == 0)
				if(year%400 == 0)
					return true;
				else return false;
			else return true;
		else return false;
	}
	
	public static void main(String[] args)
	{
		;
	}
}
