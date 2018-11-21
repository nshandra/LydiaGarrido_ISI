Ejercicio 3 - Embotelladora:
----------------------------
1. Identifica el Software Under Test.

	Dado el número de botellas disponibles en el almacén, devolver el
	número de botellas pequeñas necesarias para envasar el total del líquido.
	
	public class Embotelladora {
		public int calculaBotellasPequenas(int pequenas, int grandes, int total) {
		}
	}

2. Identificar los parámetros del SUT.

	int pequeñas : número de botellas de 1 litro disponibles
	int grandes : número de botellas de 5 litro disponibles
	int total : número de litros a envasar

3. Crear caracterizaciones y particiones en bloques.
	
	C1: Litros cubiertos (miCapacidad) vs. Litros totales (total)
	Recordar:. miCapacidad=5*grandes+pequenas;
		
		b1: grandes, pequenas o total son negativos (captura excepción)
		
		b2: total > miCapacidad (captura excepción)
		
		b3: total <= miCapacidad y total-5*grandes<0
		
		b4: total <= miCapacidad y total-5*grandes>0
		
		b5: total <= miCapacidad y total-5*grandes=0

4. Elegir valores adecuados de cada bloque.Contemplar casos frontera.
	
	C1: 
		b1: {-1,0,3}
		b2: {4,1,20}
		b3: {2,5,5}
		b4: {3,1,7}
		b5 = {0,4,20}
	Casos frontera: 
		total - (grandes*5) = pequenas
		total-5*grandes=0
		grandes = 0, pequeñas = 0, total = 0
		valores negativos
		múltiplos de 5 de grandes.

5. Escribir el código de pruebas con JUnit.
	Ver EmbotelladoraTest.java

6. Escribir el código del SUT.
	Ver Embotelladora.java
