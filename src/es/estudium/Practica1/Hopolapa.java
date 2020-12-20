package es.estudium.Practica1;

import java.util.Scanner;

public class Hopolapa {

	public static void main(String[] args) {
		/* Realizar un programa que lea una cadena e inserte detrás de cada
		vocal que encuentre, una p y la vocal encontrada. Por ejemplo, si tenemos Hola
		se transformará en Hopolapa.*/
		
		char vocales[]= {'A','a','E','e','I','i','O','o','U','u'};
		String frase;
		String resultado;
		resultado="";
		int i,j;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce una palabra ");
		frase=teclado.nextLine();
		teclado.close();
		for(i=0;i<frase.length();i++){
			resultado=resultado+frase.charAt(i);
			for(j=0;j<vocales.length;j++) {
				if(frase.charAt(i)==vocales[j]) {
					resultado=resultado+"p"+frase.charAt(i);
				}
			}
		}
		System.out.println("El resultado es: "+resultado);
	}
}
//charAt(int index)


	
	

		
		 

