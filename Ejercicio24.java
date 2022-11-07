package Capitulo6;
import java.util.Scanner;

public class Ejercicio24 {

	public static void main(String[] args){
		System.out.println("Por favor, introduzca un número entero positivo: ");
		Scanner s = new Scanner(System.in);
		
		long numero=s.nextLong();
		int longitud=1;
		long copia=numero;
		while(copia>9) {
			copia/=10;
			longitud++;
		}
		
		int digito=(int)(Math.random()*longitud);
		System.out.println((long)(numero/Math.pow(10,digito)%10));
	}
	
}
