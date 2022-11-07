package Capitulo6;
import java.util.*;

public class Ejercicio26 {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Introduzca la anchura de la tableta: ");
		int anchura=s.nextInt();
		System.out.println("Introduzca la altura de la tableta: ");
		int altura=s.nextInt();
		System.out.println();
		
		int randomx=-1;
		int randomy=-1;
		altura=altura-1;
		anchura=anchura-1;
		
		while(
				!(
				(randomx==0)
				||(randomx==anchura)
				||(randomy==0)
				||(randomy==altura)
				)
				){
			
			randomx=(int)(Math.random()*anchura+1);
			randomy=(int)(Math.random()*altura+1);
		}
		
		for(int i=0;i<=altura;i++) {
			for(int j=0;j<=anchura;j++) {
				if(!(i==randomy&&j==randomx)){
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		
		
	}
}
