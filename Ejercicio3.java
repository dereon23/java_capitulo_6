package Capitulo6;

public class Ejercicio3 {
	
	public static void main(String[] args) {
		
		int numero=(int)(Math.random()*10+1);
		int palo=(int)(Math.random()*4);
		
		switch(numero) {
		case 1:
			System.out.print("As de ");
			break;
		case 8:
			System.out.print("Sota de ");
			break;
		case 9:
			System.out.print("Caballo de ");
			break;
		case 10:
			System.out.print("Rey de ");
			break;
		default:
			System.out.print(String.valueOf(numero)+" de ");
		}
		
		switch(palo) {
			case 0:
				System.out.print("oros");
				break;
			case 1:
				System.out.print("copas");
				break;
			case 2:
				System.out.print("espadas");
				break;
			case 3:
				System.out.print("bastos");
				break;
			default:
			;
		}
		
	}

}
