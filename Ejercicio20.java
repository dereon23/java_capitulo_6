package Capitulo6;
import java.util.Scanner;

public class Ejercicio20 {
	
	public static void main(String[] args) {
		
		System.out.println("Por favor, indique la capacidad de la cuba en litros:");
		Scanner s = new Scanner(System.in);
		int maximo=s.nextInt();
		
		int lit = (int)(Math.random()*(maximo+1));
		
		for(int i=maximo;i>0;i--){
			for(int j=0;j<6;j++) {
				if(j==0||j==5) {
					System.out.print("*");
				}else if(i<=lit) {
					System.out.print("=");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		System.out.println("******");
		
		System.out.println("\nLa cuba tiene una capacidad de "+maximo+" litros y contiene "+lit+" litros de agua");
		
	}

}
