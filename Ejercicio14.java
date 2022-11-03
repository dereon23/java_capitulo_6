package Capitulo6;

import java.util.Scanner;

public class Ejercicio14 {
	
public static void main(String[] args) {
		
		System.out.println("Adivina un numero entre 0 y 100");
		int intentos=0;
		int numerosecreto=(int)(Math.random()*99+1);
		int numerointento;
		Scanner s=new Scanner(System.in);
		while(intentos<5) {
			numerointento=s.nextInt();
			if(numerosecreto==numerointento) {
				break;
			}
			intentos++;
			System.out.println("Te quedan "+String.valueOf(5-intentos)+" intentos");
			if(numerointento<numerosecreto) {
				System.out.println("El numero es mayor");
			}else {
				System.out.println("El numero es menor");
			}
		}
		if(intentos<5) {
			System.out.println("Correcto");
		}else {
			System.out.println("Has fallado los 5 intentos");
		}
		
	}

}
