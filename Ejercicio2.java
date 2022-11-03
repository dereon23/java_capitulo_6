package Capitulo6;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		
		int numero=(int)(Math.random()*13+1);
		int palo=(int)(Math.random()*4);
		
		switch(numero) {
		case 1:
			System.out.print("A de ");
			break;
		case 11:
			System.out.print("J de ");
			break;
		case 12:
			System.out.print("Q de ");
			break;
		case 13:
			System.out.print("K de ");
			break;
		default:
			System.out.print(String.valueOf(numero)+" de ");
		}
		
		switch(palo) {
			case 0:
				System.out.print("picas");
				break;
			case 1:
				System.out.print("corazones");
				break;
			case 2:
				System.out.print("diamantes");
				break;
			case 3:
				System.out.print("treboles");
				break;
			default:
			;
		}
		
	}

}
