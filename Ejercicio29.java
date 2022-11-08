package Capitulo6;
import java.util.*;

public class Ejercicio29 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("1. Primavera");
		System.out.println("2. Verano");
		System.out.println("3. Otoño");
		System.out.println("4. Invierno");
		System.out.print("Seleccione la estación del año (1-4): ");
		int estacion = s.nextInt();
		int maximo, minimo, probtiemp;
		boolean soleado=false;

		switch(estacion) {
		case 1:
			probtiemp=(int)(Math.random()*16+15);
			maximo=probtiemp;
			probtiemp=(int)(Math.random()*16+15);
			if(probtiemp>maximo) {
				minimo=maximo;
				maximo=probtiemp;
			}else{
				minimo=probtiemp;
			}
			probtiemp=(int)(Math.random()*10);
			if(probtiemp<6) {
				soleado=true;
			}
			break;
			
		case 2:
			probtiemp=(int)(Math.random()*21+25);
			maximo=probtiemp;
			probtiemp=(int)(Math.random()*21+25);
			if(probtiemp>maximo) {
				minimo=maximo;
				maximo=probtiemp;
			}else{
				minimo=probtiemp;
			}
			probtiemp=(int)(Math.random()*10);
			if(probtiemp<8) {
				soleado=true;
			}
			break;
			
		case 3:
			probtiemp=(int)(Math.random()*11+20);
			maximo=probtiemp;
			probtiemp=(int)(Math.random()*11+20);
			if(probtiemp>maximo) {
				minimo=maximo;
				maximo=probtiemp;
			}else{
				minimo=probtiemp;
			}
			probtiemp=(int)(Math.random()*10);
			if(probtiemp<4) {
				soleado=true;
			}
			break;
			
		case 4:
			probtiemp=(int)(Math.random()*26);
			maximo=probtiemp;
			probtiemp=(int)(Math.random()*26);
			if(probtiemp>maximo) {
				minimo=maximo;
				maximo=probtiemp;
			}else{
				minimo=probtiemp;
			}
			probtiemp=(int)(Math.random()*10);
			if(probtiemp<2) {
				soleado=true;
			}
			break;
			
		default: System.out.println("Error");
			minimo=0;
			maximo=0;
		}
		System.out.println("\nPrevisión del tiempo para mañana");
		System.out.println("--------------------------------");
		System.out.println("Temperatura mínima: "+minimo);
		System.out.println("Temperatura máxima: "+maximo);
		if(soleado) {
			System.out.println("Soleado");
		}else {
			System.out.println("Nublado");
		}
		
		
		
		
		
		
	}
	
}
