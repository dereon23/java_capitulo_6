package Capitulo6;

public class Ejercicio9 {
	
	public static void main(String[] args) {
		
			int numero=0;
			int suma=0;
			while (numero!=24){
				numero = (int)(Math.random()*51)*2;
				System.out.println(numero);
				suma++;
			}
			System.out.println("Hubo " + suma);
		
	}
}
