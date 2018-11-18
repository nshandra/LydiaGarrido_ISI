import java.util.*;

public class DescuentoBlackFriday {
// Parámetro: precioOriginal es el precio de un producto marcado
//	en la etiqueta
// Devuelve: el precio final
//	Si es black friday (23 de noviembre) se aplica un
//	descuento de 30%
	public static double PrecioFinal(double precioOriginal) {
		java.util.Date fecha = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(fecha);
		int mes = cal.get(Calendar.MONTH);
		//La funcion me devuelve el mes anterior al que estamos.
		mes = mes + 1;
		int dia = cal.get(Calendar.DAY_OF_MONTH);
		if (mes == 11 && dia == 23){
			return precioOriginal * 0.7;
		}else{
			return precioOriginal;
		}
	}

	public static void main(String[] args)
	{
		;
	}
}
