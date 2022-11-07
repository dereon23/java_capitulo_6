package Capitulo6;

public class Ejercicio25 {
	
	public static void main(String[] args) {
		
		boolean primo;
		int numero;
		for(int i=0;i<100;i++) {
			
			primo=true;
			numero=(int)(Math.random()*191+10);
			
			for(int j=2;j<=100;j++) {
				if(numero%j==0) {
					primo=false;
					break;
				}
			}
			
			if(primo) {
				System.out.print(" #"+numero+"# ");
			}else if(numero%5==0) {
				System.out.print(" ["+numero+"] ");
			}else {
				System.out.print(" "+numero+" ");
			}
		}

	}

}
