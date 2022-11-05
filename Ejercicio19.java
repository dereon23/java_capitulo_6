package Capitulo6;

public class Ejercicio19 {
	public static void main(String[] args) {
		
		int num;
		int maximopar=-100;
		int minimoimpar=200;
		int suma=0;
		for (int i=0; i<50; i++) {
			num = (int)(Math.random()*301)-100;
			System.out.print(num + " ");
			if(num%2==0){
				if(num>maximopar) {
					maximopar = num;
				}
			}else{
				if(num<minimoimpar){
					minimoimpar = num;
				}
			}
			suma += num;
		}
		System.out.println("\nMaximo de los pares: "+maximopar);
		System.out.println("Minimo de los impares: "+minimoimpar);
		System.out.println("Media: "+suma/50);
	}

}
