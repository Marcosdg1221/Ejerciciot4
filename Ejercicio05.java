package ejercicios;

import java.util.*; //Importamos el java.util que necesitamos

public class Ejercicio05 {

public static void main(String[] args) {
		
		boolean vocal=true;
		Scanner all = new Scanner(System.in); //pongo scanner
		System.out.println("Introduzca una letra");
		String letra = all.nextLine();
		if (letra .equals("a") | letra .equals("e") | letra .equals("i") | letra .equals("o") | letra .equals("u")){
			vocal=true;
		}
		else {
			vocal=false;
		}
	let(vocal, letra);
	}
		
		public static void let(boolean vocal, String letra) {
			if (vocal==true) {
				System.out.println("Es vocal" );
			}
			else if (vocal==false){
				System.out.println("No es vocal" );
			}
}
}
