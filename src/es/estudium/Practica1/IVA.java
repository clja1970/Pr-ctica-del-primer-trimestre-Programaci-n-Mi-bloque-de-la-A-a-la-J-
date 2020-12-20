package es.estudium.Practica1;

import java.util.Scanner;

public class IVA {

	public static void main(String[] args) {
				/*Realizar un programa que vaya pidiendo una cantidad monetaria y un IVA
y nos muestre por pantalla el valor del cálculo del IVA correspondiente a la
cantidad indicada. El programa acaba al introducir como cantidad un 0 */
		Scanner teclado = new Scanner(System.in);
		int dinero;
		float iva;
		float resultado;
		//Bucle para repetir el programa hasta que sea 0 
		do {
			System.out.println("Dame una cantidad de dinero ");
			dinero=teclado.nextInt();
			System.out.println("Dame un IVA ");
			iva=teclado.nextFloat();
			resultado=dinero*(1+iva/100);
			System.out.println("El resultado de aplicar el IVA correspondiente es: "+resultado);
		}while(dinero!=0);
		System.out.println("El programa ha terminado ");
		teclado.close();
	}
}
/*PROGRAMA iva
 * VARIABLES
 * ENTERO dinero
 * REAL	iva,resultado
 * HACER
 * 	ESCRIBIR "Dame una cantidad de dinero "
 * 	LEER dinero
 * 	ESCRIBIR "Dame un IVA "
 * 	LEER iva
 * 	resultado=dinero*(1+iva/100)
 * 	ESCRIBIR "El resultado de aplicar el IVA correspondiente es: "+resultado
 * MIENTRAS (dinero<>0)
 * 	ESCRIBIR "El programa ha terminado "
 * 	FIN MIENTRAS
 * FIN
 * 	 */
 