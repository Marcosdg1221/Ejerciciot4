package ejercicios;

import java.util.Scanner; //Importamos el java.util que necesitamos

public class Ejercicio03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner all = new Scanner(System.in); //pongo scanner
		System.out.println("Introduzca 1 para especificar el área y 2 para volumen");
		int opcion = all.nextInt();
		if (opcion==1) {
		System.out.println("Introduzca el área");
		int area = all.nextInt();
		}
		else if (opcion==2) {
		System.out.println("Introduzca el volumen");
		int volumen = all.nextInt();
		}
		else {
		System.out.println("Vaya bald");
		}
		System.out.println("Introduzca la altura");
		int altura = all.nextInt();
		System.out.println("Introduzca el radio");
		int radio = all.nextInt();
		cilindro(opcion, altura, radio);
	}
	public static void cilindro(int  opcion, int altura, int radio) {
		if (opcion==1) {
			double cilindro=((Math.PI)*2)*radio*(altura*radio);
			System.out.println(cilindro);
		}
		else {
			double cilindro=(Math.PI*2)*(radio*radio)*altura;
			System.out.println(cilindro);
		}
		}
}