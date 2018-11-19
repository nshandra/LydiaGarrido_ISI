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
	
	C1: Dos particiones.
		b1: total - (grandes*5) >= pequenas 
		    .vs. 
		b2: total - (grandes*5) < pequenas

4. Elegir valores adecuados de cada bloque.Contemplar casos frontera.
	
	C1: b1=[0,0,0] b2=[10,1,20]
	Casos frontera: total - (grandes*5) = pequenas
					grandes = 0, pequeñas = 0, total = 0
					valores negativos vs positivos de cada parámetro
					múltiplos de 5 de grandes.

5. Escribir el código de pruebas con JUnit.
	Ver EmbotelladoraTest.java

6. Escribir el código del SUT.
	Ver Embotelladora.java
