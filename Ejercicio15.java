package Capitulo6;

public class Ejercicio15 {
	
	public static void main(String[] args) {
		
		int cantidadcompases=(int)(Math.random()*(24/4)+1);
		String melodia="";
		int primeranota=0;
		
		for(int i=0;i<cantidadcompases;i++) {
			for(int j=0;j<4;j++) {
				int siguientenota = (int)(Math.random()*7);
				if(i==0&&j==0) {
					primeranota=siguientenota;
					switch(primeranota) {
					case 0:
						melodia+=" do";
						break;
					case 1:
						melodia+=" re";
						break;
					case 2:
						melodia+=" mi";
						break;
					case 3:
						melodia+=" fa";
						break;
					case 4:
						melodia+=" sol";
						break;
					case 5:
						melodia+=" la";
						break;
					case 6:
						melodia+=" si";
						break;
					default: ;
					}
				}else if(i==(cantidadcompases-1)&&j==3) {
					switch(primeranota) {
					case 0:
						melodia+=" do";
						break;
					case 1:
						melodia+=" re";
						break;
					case 2:
						melodia+=" mi";
						break;
					case 3:
						melodia+=" fa";
						break;
					case 4:
						melodia+=" sol";
						break;
					case 5:
						melodia+=" la";
						break;
					case 6:
						melodia+=" si";
						break;
					default: ;
					}
				}else {
					switch(siguientenota) {
					case 0:
						melodia+=" do";
						break;
					case 1:
						melodia+=" re";
						break;
					case 2:
						melodia+=" mi";
						break;
					case 3:
						melodia+=" fa";
						break;
					case 4:
						melodia+=" sol";
						break;
					case 5:
						melodia+=" la";
						break;
					case 6:
						melodia+=" si";
						break;
					default: ;
					}
				}
			}
			if(i!=cantidadcompases-1) {
				melodia+=" |";
			}
			
		}
		
		melodia+=" ||";
		System.out.println(melodia);
		
	}

}
