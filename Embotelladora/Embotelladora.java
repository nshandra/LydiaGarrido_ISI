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
			grandes = total/5;
			int rest = total - (grandes*5);
			rest = rest - pequenas;
			return rest;
	}

	public static void main(String[] args) {
		;
	}
}
