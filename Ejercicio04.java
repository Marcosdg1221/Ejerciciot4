package ejercicios;

import java.util.*; //Importamos el java.util que necesitamos


public class Ejercicio04 {
	
	public static void main(String[] args) {
		
		boolean mayor = false;
		Scanner all = new Scanner(System.in); //pongo scanner
		System.out.println("Introduzca un número");
		int num = all.nextInt();
		System.out.println("Introduzca otro número");
		int num1 = all.nextInt();
		if (num>num1) {
			mayor=false;
		}
		else if (num==num1) {
			System.out.println("Los nº son iguales");
		}
		else {
			mayor=true;
		}
	numero(num, num1, mayor);
	}
		
		public static void numero(int  num, int num1, boolean mayor) {
			if (mayor==false && num>num1) {
				System.out.println("El primer nº es mayor, nº introducido; " + num );
			}
			else if (mayor==true){
				System.out.println("El segundo nº es mayor, nº introducido; " + num1 );
			}
}
}

