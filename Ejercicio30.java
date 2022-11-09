package Capitulo6;
import java.util.Scanner;


public class Ejercicio30 {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.print("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
		int altura=s.nextInt();
		System.out.println("Ahora introduzca la anchura (como mínimo 4): ");
		int anchura=s.nextInt();
		
		
		int pospez=(int)(Math.random()*(altura-2)*(anchura-2));
		int poscab=0;
		int poscar=0;
		do{
			poscab=(int)(Math.random()*(altura-2)*(anchura-2));
			poscar=(int)(Math.random()*(altura-2)*(anchura-2));
		}while(pospez==poscab||pospez==poscar||poscab==poscar);
		System.out.println(pospez+" "+poscab+" "+poscar);
		System.out.println();
		
		
		for(int i=0;i<altura;i++) {
			for(int j=0;j<anchura;j++) {
				if(i==0||j==0||i==(altura-1)||j==(anchura-1)) {
					System.out.print("*");
				}else if(pospez==((anchura-2)*(i-1)+(j-1))){
					System.out.print("&");
				}else if(poscab==((anchura-2)*(i-1)+(j-1))){
					System.out.print("$");
				}else if(poscar==((anchura-2)*(i-1)+(j-1))){
					System.out.print("@");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
	}

}
