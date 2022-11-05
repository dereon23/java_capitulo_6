package Capitulo6;

import java.util.Scanner;

public class Ejercicio17 {
		
		public static void main(String[] args) {
			
			System.out.println("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
			Scanner s=new Scanner(System.in);
			int altura=s.nextInt();
			
			System.out.println("Ahora introduzca la anchura (como mínimo 4): ");
			int anchura=s.nextInt();
			
			int pezfila=(int)(Math.random()*(altura-2))+1;
			int pezcol=(int)(Math.random()*(anchura-2))+1;

			for(int i=1;i<=altura;i++) {
				for(int j=1;j<=anchura;j++) {
					if(i==1) {
						System.out.print("*");
					}else if(i==altura) {
						System.out.print("*");
					}else if(j==1){
						System.out.print("*");
					}else if(j==anchura) {
						System.out.print("*");
					}else if(i==(pezfila+1)&&j==(pezcol+1)) {
						System.out.print("&");
					}else {
						System.out.print(" ");
					}
				}
				System.out.println("");
			}
			
		}

}
