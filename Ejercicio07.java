package ejercicios;

import java.util.*; //Importamos el java.util que necesitamos

public class Ejercicio07 {

public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cont=0;
		boolean esPrimo=true;
		int n=0;
		Scanner all = new Scanner(System.in); //pongo scanner
		System.out.println("Introduzca un número y se dirá cuántos divisores primos tiene");
		n=all.nextInt();
		for (int i=2; i<=n; i++){
			if(n%i==0 && esPrimo) {
				cont++;
			}
		}
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