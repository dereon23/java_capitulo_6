package Capitulo6;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		int maxnum=100;
		int minnum=199;
		int suma=0;
		for(int i=0;i<50;i++) {
			int numero=(int)(Math.random()*100+100);
			System.out.print(String.valueOf(numero)+" ");
			if(maxnum<numero) {
				maxnum=numero;
			}
			if(minnum>numero) {
				minnum=numero;
			}
			suma+=numero;
		}
		System.out.println("\nEl maximo es "+String.valueOf(maxnum));
		System.out.println("El minimo es "+String.valueOf(minnum));
		System.out.println("La media es "+String.valueOf((float)suma/50));
		
	}
	
}
