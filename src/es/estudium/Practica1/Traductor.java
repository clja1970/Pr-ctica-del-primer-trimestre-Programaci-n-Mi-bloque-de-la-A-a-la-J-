package es.estudium.Practica1;

import java.util.Scanner;

public class Traductor {

	public static void main(String[] args) {
		/*
		 * Realizar un programa que lea una frase en espa�ol y la traduzca al ingl�s o
		 * viceversa. Usaremos un diccionario reducido compuesto por las palabras yo,
		 * tu, el, ella, soy, eres, es, alto, bajo, espa�ol y sus equivalentes en ingl�s
		 */
		Scanner teclado = new Scanner(System.in);
		String[] esp = { "yo", "tu", "�l", "ella", "soy", "eres", "es", "alto", "bajo", "espa�ol" };
		String[] ing = { "I", "you", "He", "She", "am", "are", "is", "tall", "short", "English" };
		String busqueda;
		String idioma;
		String frase;
		String[] traduc;
		boolean loHaEncontrado = false;
		// Buscar por posiciones
		int i, j, indiceEncontrado = 0;
		i = 0;
		do {// Bucle para poner en el teclado lo que se pide
			System.out.println("En qu� idioma quieres traducir? (Ingles/Espa�ol-Espa�ol/Ingles): ");
			idioma = teclado.nextLine();
		} while (!(idioma.equals("Ingles/Espa�ol") | idioma.equals("Espa�ol/Ingles")));

		if (idioma.equals("Espa�ol/Ingles")) {
			System.out.println("Dame una frase para traducir ");
			frase = teclado.nextLine();
			traduc = frase.split(" ");
			// Split divide la frase que le pasas como mensaje (frase, en este caso) seg�n
			// la expresi�n que pongas entre par�ntesis
			// split devuelve una TABLA de cadenas
			for (i = 0; i < traduc.length; i++) {
				busqueda = traduc[i];
				j = 0;
				do {
					if (busqueda.equals(esp[j])) {
						loHaEncontrado = true;
						indiceEncontrado = j;
					}
					j++;
				} while (loHaEncontrado == false || j < esp.length);
				// encontrado==false es lo mismo que !encontrado
				// encontado==true es lo mismo que encontrado

				/*
				 * j = valor inicial; do{ //Secuencia de instrucciones j++; }while(condicion);
				 * que puede ser que se haya llegado al ultimo valor de la tabla, o que se haya
				 * encontrado lo que estabas buscando
				 */
				if (loHaEncontrado == true) {
					traduc[i] = ing[indiceEncontrado];
				}
			}

		} else {
			System.out.println("Dame una frase para traducir ");
			frase = teclado.nextLine();
			frase.split(" ");
			traduc = frase.split(" ");
			// Split divide la frase que le pasas como mensaje (frase, en este caso) seg�n
			// la expresi�n que pongas entre par�ntesis
			// split devuelve una TABLA de cadenas
			for (i = 0; i < traduc.length; i++) {
				busqueda = traduc[i];
				j = 0;
				do {
					if (busqueda.equals(ing[j])) {
						loHaEncontrado = true;
						indiceEncontrado = j;
					}
					j++;
				} while (loHaEncontrado == false || j < ing.length);
				// encontrado==false es lo mismo que !encontrado
				// encontado==true es lo mismo que encontrado

				/*
				 * j = valor inicial; do{ //Secuencia de instrucciones j++; }while(condicion);
				 * que puede ser que se haya llegado al ultimo valor de la tabla, o que hayas
				 * encontrado lo que estabas buscando
				 */
				if (loHaEncontrado == true) {
					traduc[i] = esp[indiceEncontrado];
				}
			}

		}

		System.out.println("La traduccion es ");
		for (i = 0; i < traduc.length; i++) {
			System.out.print(traduc[i] + " ");
		}
		teclado.close();
	}
}
