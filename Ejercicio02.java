package ejercicios;

import java.util.Scanner; //Importamos el java.util que necesitamos

public class Ejercicio02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner all = new Scanner(System.in); //pongo scanner
		System.out.println("Introduzca un número");
		//el numero a pedir será el valor de numero
		int numero = all.nextInt();
		System.out.println("Introduzca otro número, se mostrará qué numero hay en medio de los dos");
		//el numero a pedir será el valor de numero1
		int numero1 = all.nextInt();
		//La función
		enteros(numero, numero1);
	}
	public static void enteros(int numero, int numero1) {
		//El bucle imprimirá tantos numeros como n
		for (int n=numero+1;n<numero1; n++) {
			System.out.print(n + " " );
		}
	}
}