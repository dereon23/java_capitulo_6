package Capitulo6;
import java.util.Scanner;

public class Ejercicio22 {
	
	public static void main(String[] args) {
		System.out.println("Por favor, introduzca la longitud de la serpiente en caracteres contando la cabeza: ");
		Scanner s=new Scanner(System.in);
		int longid=s.nextInt();
		
		System.out.println("            @");
		
		
		int lugar=13;
		while (1<longid) {
			lugar+=(int)(Math.random()*3)-1;
			for (int i=0; i<lugar; i++){
				System.out.print(" ");
			}
			System.out.println("*");
			longid--;
		}
		}

}
