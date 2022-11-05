package Capitulo6;

public class Ejercicio16 {
	
	public static void main(String[] args) {
		
		int figura;
		String figura1="";
		String figura2="";
		String figura3="";
		
		figura=(int)(Math.random()*5);
		switch(figura) {
		case 0:
			figura1="corazon";
			break;
		case 1:
			figura1="diamante";
			break;
		case 2:
			figura1="herradura";
			break;
		case 3:
			figura1="campana";
			break;
		case 4:
			figura1="limon";
			break;
		default: ;
		}
		
		figura=(int)(Math.random()*5);
		switch(figura) {
		case 0:
			figura2="corazon";
			break;
		case 1:
			figura2="diamante";
			break;
		case 2:
			figura2="herradura";
			break;
		case 3:
			figura2="campana";
			break;
		case 4:
			figura2="limon";
			break;
		default: ;
		}
		
		figura=(int)(Math.random()*5);
		switch(figura) {
		case 0:
			figura3="corazon";
			break;
		case 1:
			figura3="diamante";
			break;
		case 2:
			figura3="herradura";
			break;
		case 3:
			figura3="campana";
			break;
		case 4:
			figura3="limon";
			break;
		default: ;
		}
		
		System.out.println(figura1+" "+figura2+" "+figura3);
		if(figura1.equals(figura2)&&figura1.equals(figura3)){
			System.out.println("Enhorabuena, ha ganado 10 monedas");
		}
		else if(figura1.equals(figura2)||figura1.equals(figura3)||figura2.equals(figura3)) {
			System.out.println("Bien, ha recuperado su moneda");
		}else {
			System.out.println("Lo siento, ha perdido");
		}
		
		
	}

}
