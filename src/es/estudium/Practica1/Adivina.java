package es.estudium.Practica1;

import java.util.Random;
import java.util.Scanner;

public class Adivina {

	public static void main(String[] args) {
			/*Realizar un programa en el que el ordenador �piense� un n�mero de 1
a 5. Luego, el usuario introduce un n�mero por teclado y se indicar� si ha acertado
o no. No hay que repetir hasta que acierte. El programa solamente pide un
n�mero una vez. */
		/*Para realizar este ejercicio me he basado en el ejercicio resueltos de java dados, quiniela y primitiva
		 *  y por supuesto el n�mero 67 de los resueltos del tema 2*/
		/*Tambi�n he investigado el m�todo Math.random*/
		Scanner teclado = new Scanner (System.in);
		Random rnd=new Random();
		int elegido;
		System.out.println("Dame un n�mero del 1 al 5, a ver si aciertas ");
		elegido=teclado.nextInt();
		teclado.close();
		int numeroaleatorio = rnd.nextInt(5)+1;
		if (elegido==numeroaleatorio) {
				System.out.println("�Has acertado! ");
		}else{
			System.out.println("Fallaste");
		}
	}
}
/* PROGRAMA Adivina
 * VARIABLES
 * ENTERO
 *  elegido
 * ESCRIBIR "Dame un n�mero del 1 al 5 a, ver si aciertas"
 * LEER elegido
 * ENTERO numeroaleatorio=ENTERO ALEATORIO (1,5)
 * SI (elegido=numeroaleatorio)
 * 	ESCRIBIR "�Has Acertado!"
 * SINO
 * 	ESCRIBIR "Fallaste"
 * 	FIN SI
 * FIN
 * */
 
