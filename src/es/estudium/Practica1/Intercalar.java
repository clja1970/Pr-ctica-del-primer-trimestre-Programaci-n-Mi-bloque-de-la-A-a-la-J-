package es.estudium.Practica1;

import java.util.Scanner;
/*Realizar un programa que lea dos cadenas y muestre la cadena
resultante de intercalar una letra de una cadena con otra letra de la otra cadena.
Ejemplo: Hola y Adiós, darían como resultado HAodliaós
  */
public class Intercalar {

	public static void main(String[] args) {
		String cadena1,cadena2;
		int i;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce una palabra ");
		cadena1=teclado.nextLine();
		System.out.println("Introduce otra palabra ");
		cadena2=teclado.nextLine();
		teclado.close();
		for(i=0;i<cadena1.length() && i<cadena2.length();i++) {
			System.out.print(""+cadena1.charAt(i)+cadena2.charAt(i));
		}
		if (cadena1.length()>cadena2.length()){
				//sacar por pantalla el resto de la cadena1
			System.out.println(""+cadena1.substring(i));
		}else {//sacar por pantalla el resto de la cadena 2
			System.out.println(""+cadena2.substring(i));
		}
	}
}
/*PROGRAMA Intercalar
 * 	VARIABLES
 * 	CADENAS cadena1, cadena2
 * 	ENTERO i
 * INICIO
 * 	ESCRIBIR "Dame una palabra "
 * 	LEER cadena1
 * 	ESCRIBIR "Dame otra palabra*
 * 	LEER cadena2
 * 	PARA i=0 HASTA i<cadena1.longitud Y i<cadena2.longitud HACER
 * 		IMPRIMIR cadena1.sacarcaracter(i)+cadena2.sacarcaracter(i)
 * 		SI cadena1.longitud>cadena2.longitud
 * 		IMPRIMIR ""+cadena1.subcadena(i)
 * 		SINO 
 * 			IMPRIMIR ""+cadena1.subcadena(i)
 * 		FIN SI
 * 	FIN PARA
 * FIN
 */