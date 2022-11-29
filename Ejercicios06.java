package ejercicios;

import java.util.*; //Importamos el java.util que necesitamos

public class Ejercicios06 {

public static void main(String[] args) {
		
		int n;
		boolean esPrimo=true;
		Scanner all = new Scanner(System.in); //pongo scanner
		System.out.println("Introduzca un número y se dirá si es primo");
		n=all.nextInt();
	primo(n);
	}
		
		public static void primo(int n) {
			boolean esPrimo=false;
			for (int cont=2;n>cont;cont++) {
				if (n%cont==0) {
					esPrimo=false;
				}
			}
			if (esPrimo==true) {
				System.out.println("Es Primo" );
			}
			else if (esPrimo==false){
				System.out.println("No es Primo" );
			}
}
}
