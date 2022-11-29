package ejercicios;

import java.util.Scanner; //Importamos el java.util que necesitamos

public class Ejercicio01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner all = new Scanner(System.in); //pongo scanner
		System.out.println("Introduzca un número");
		int n = all.nextInt();
		// Creo tres variables int; una para el segundo, otra para el minuto y otra para
		// la hora.
		eco(n);
	}

	public static void eco(int n) {
		for (;n>0; n--) {
			System.out.println("Eco...");
		}
	
}
}
