package es.estudium.Practica1;

import java.util.Random;
import java.util.Scanner;

public class Adivina {

	public static void main(String[] args) {
			/*Realizar un programa en el que el ordenador “piense” un número de 1
a 5. Luego, el usuario introduce un número por teclado y se indicará si ha acertado
o no. No hay que repetir hasta que acierte. El programa solamente pide un
número una vez. */
		/*Para realizar este ejercicio me he basado en el ejercicio resueltos de java dados, quiniela y primitiva
		 *  y por supuesto el número 67 de los resueltos del tema 2*/
		/*También he investigado el método Math.random*/
		Scanner teclado = new Scanner (System.in);
		Random rnd=new Random();
		int elegido;
		System.out.println("Dame un número del 1 al 5, a ver si aciertas ");
		elegido=teclado.nextInt();
		teclado.close();
		int numeroaleatorio = rnd.nextInt(5)+1;
		if (elegido==numeroaleatorio) {
				System.out.println("¡Has acertado! ");
		}else{
			System.out.println("Fallaste");
		}
	}
}
/* PROGRAMA Adivina
 * VARIABLES
 * ENTERO
 *  elegido
 * ESCRIBIR "Dame un número del 1 al 5 a, ver si aciertas"
 * LEER elegido
 * ENTERO numeroaleatorio=ENTERO ALEATORIO (1,5)
 * SI (elegido=numeroaleatorio)
 * 	ESCRIBIR "¡Has Acertado!"
 * SINO
 * 	ESCRIBIR "Fallaste"
 * 	FIN SI
 * FIN
 * */
 
