package Capitulo6;

public class Ejercicio23{
	
	public static void main(String[] args){
		
		String resultado = "";
		for (int i=0; i<5;i++) {
			switch((int)(Math.random()*6)) {
			case 0:
				resultado = "As";
				break;
			case 1:
				resultado = "K";
				break;
			case 2:
				resultado = "Q";
				break;
			case 3:
				resultado = "J";
				break;
			case 4:
				resultado = "7";
				break;
			case 5:
				resultado = "8";
				break;
			default: ;
			}
			System.out.print(resultado + " ");
		}
	}

}
