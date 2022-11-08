package Capitulo6;
import java.util.*;

public class Ejercicio28 {
	
	public static void main(String[] args) {
		
			Scanner s=new Scanner(System.in);
			
			System.out.print("Introduzca el tamaño del array: ");
			int tamanoarray=s.nextInt();
			int[] original=new int[tamanoarray];
			int[] resultado=new int[tamanoarray];
			
			System.out.println("Array original: ");
			System.out.print("Índice ");
			int numero;
			for(int i=0;i<tamanoarray;i++) {
				numero=(int)(Math.random()*201);
				original[i]=numero;
				resultado[i]=-1;
				System.out.printf("%5d",i);
			}
			System.out.print("\nValor  ");
;
			for(int i=0;i<tamanoarray;i++) {
				System.out.printf("%5d",original[i]);
				if(i%2==0) {
					if(resultado[i/2]==-1) {
						resultado[i/2]=original[i];
					}
				}else{
					if(resultado[tamanoarray-i/2-1]==-1) {
						resultado[tamanoarray-i/2-1]=original[i];
					}					
				}
			}
			System.out.println("\n");

			System.out.println("Array original: ");
			System.out.print("Índice ");
			for(int i=0;i<tamanoarray;i++) {
				System.out.printf("%5d",i);
			}
			System.out.print("\nValor  ");
;
			for(int i=0;i<tamanoarray;i++) {
				System.out.printf("%5d",resultado[i]);
			}

		
	}

}
