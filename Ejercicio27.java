package Capitulo6;
import java.util.Scanner;

public class Ejercicio27 {
	
	public static void main(String[] args){
		
		System.out.print("Turno del jugador (introduzca piedra, papel o tijera): ");
		Scanner s=new Scanner(System.in);
		String jugador=s.nextLine();
		int ordenador=(int)(Math.random()*3);
		
		System.out.print("Turno del ordenador: ");
		if(ordenador==0) {
			System.out.println("piedra");
		}else if(ordenador==1) {
			System.out.println("papel");
		}else {
			System.out.println("tijera");
		}
		
		if(jugador.equalsIgnoreCase("piedra")) {
			if(ordenador==0) {
				System.out.println("Empate");
			}else if(ordenador==1) {
				System.out.println("Gana el ordenador");
			}else {
				System.out.println("Gana el jugador");
			}
		}else if(jugador.equalsIgnoreCase("papel")) {
			if(ordenador==0) {
				System.out.println("Gana el jugador");
			}else if(ordenador==1) {
				System.out.println("Empate");
			}else {
				System.out.println("Gana el ordenador");
			}
		}else if(jugador.equalsIgnoreCase("tijera")) {
			if(ordenador==0) {
				System.out.println("Gana el ordenador");
			}else if(ordenador==1) {
				System.out.println("Gana el jugador");
			}else {
				System.out.println("Empate");
			}
		}else {
			System.out.println("Input incorrecto");
		}
		
	}

}
