package Capitulo6;
import java.util.Scanner;

public class Ejercicio32 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.print("Introduce la altura: ");
		int altura=s.nextInt();
		int espacios=10;
		int obstaculo;
		int giro;
		
		for(int i=0;i<altura;i++) {
			
			for(int j=0;j<espacios+1;j++) {
				
				if(j<espacios) {
					System.out.print(" ");
				}else {
					obstaculo=(int)(Math.random()*2+4);
					if(obstaculo==4) {
						obstaculo=(int)(Math.random()*4);
					}
					System.out.print("|");
					for(int k=0; k<4;k++) {
						if(k==obstaculo) {
							obstaculo=(int)(Math.random()*2+4);
							if(obstaculo==4) {
								System.out.print("*");
							}else {
								System.out.print("O");
							}
						}else {
							System.out.print(" ");
						}
					}
					System.out.print("|");
				}
				
			}
			if(espacios==0) {
				giro=(int)(Math.random()*2);
				if(giro==0) {
					espacios++;
				}
			}else {
				giro=(int)(Math.random()*3);
				if(giro==0) {
					espacios--;
				}else if(giro==1) {
					espacios++;
				}
			}
			System.out.println();
			
		}
		
	}
	
}
