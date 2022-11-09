package Capitulo6;
import java.util.Scanner;

public class Ejercicio31 {
	
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.print("Introduce la cantidad de dinero a apostar: ");
		int apostado=s.nextInt();
		
		int dado1=(int)(Math.random()*6+1);
		int dado2=(int)(Math.random()*6+1);
		System.out.println("Dados: "+dado1+" y "+dado2+"\n");
		int suma=dado1+dado2;
		
		if(suma==7||suma==11) {
			System.out.println("Gana "+(apostado*2));
		}else if(suma==2||suma==3||suma==12) {
			System.out.println("Pierde su dinero");
		}else {
			System.out.println("Hay que volver a tirar\n");
				int suma2=0;
				while(suma2!=suma||suma2==7) {
					dado1=(int)(Math.random()*12+1);
					dado2=(int)(Math.random()*12+1);
					suma2=dado1+dado2;
				}
				System.out.println("Dados: "+dado1+" y "+dado2+"\n");
				if(suma==7) {
					System.out.println("Pierde su dinero");
				}else {
					System.out.println("Gana "+(apostado*2));
				}
		}
		
	}

}
