import java.util.*;

public class Embotelladora {
// Parámetros: número de botellas disponibles en el almacén.
//             pequeñas: número de botellas en almacén de 1L
//             grandes : número de botellas en almacén de 5L
//             total: número total de litros que hay que embotellar
// Devuelve: número de botellas pequeñas necesarias para envasar
//           el total de lı́quido, teniendo en cuenta que hay que
//           minimizar el número de botellas pequeñas: primero
//           se rellenan las grandes
	public int calculaBotellasPequenas(int pequenas, int grandes, int total) {
		int miCapacidad;
		int pequenasMinimiz;
		
		if (pequenas < 0 || grandes < 0 || total < 0) {
			throw new RuntimeException("Error: valores negativos");
		}
		miCapacidad = 5*grandes + pequenas;
		if (total > miCapacidad) {
			throw new RuntimeException("Error: botellas insuficientes");
		}
		pequenasMinimiz = total - 5*grandes;
		if (pequenasMinimiz <= 0){
			return pequenasMinimiz = 0;
		}
		return pequenasMinimiz;
	}

	public static void main(String[] args) {
		;
	}
}
