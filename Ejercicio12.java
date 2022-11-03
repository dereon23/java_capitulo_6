package Capitulo6;

public class Ejercicio12 {
	
	public static void main(String[] args){
		for(int i=0; i<50; i++){
			for(int j=0;j<100;j++){
			System.out.print((char)(Math.random()*(126+1-32)+32));
			}
			System.out.println();
		}
	}
}
