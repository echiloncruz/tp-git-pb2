package ar.edu.unlam.pb2.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Integer a;
		Integer b;
		Integer opcion;
		Integer resultado=0;
		
		Scanner teclado  = new Scanner(System.in);
		
		do{
			System.out.println("INGRESE SU OPERACIÓN:");
			System.out.println("1 - Sumar");
			System.out.println("2- Restar");
			System.out.println("3- Multiplicar");
			System.out.println("4- Dividir");
			opcion = teclado.nextInt();
		}while(opcion <= 1 && opcion >= 4);
		System.out.println("Ingrese el primer numero");
		a = teclado.nextInt();
		System.out.println("Ingrese el segundo numero");
		b = teclado.nextInt();
		switch(opcion) {
		case 1:
			resultado = a+b;
			break;
		case 2:
			resultado = a-b;
			break;
		case 3:
			resultado = a*b;
			break;
		case 4:
			resultado = a/b;
			break;
		default:
			break;
		}
		System.out.println("El resultado es " + resultado.toString());
		}
}
