package Capitulo6;

public class Ejercicio18 {
	
	public static void main(String[] args) {
		
		String col1="";
		String col2="";
		String col3="";
		
		int color1 = (int)(Math.random()*6);
		int color2;
		do {
			color2=(int)(Math.random()*6);
		}while(color2==color1);
		int color3;
		do {
			color3=(int)(Math.random()*6);
		}while(color1==color3||color2==color3);
		
		switch(color1) {
		case 0:
			col1="rojo";
			break;
		case 1:
			col1="azul";
			break;
		case 2:
			col1="verde";
			break;
		case 3:
			col1="amarillo";
			break;
		case 4:
			col1="violeta";
			break;
		case 5:
			col1="naranja";
			break;
		default: ;
		}
		
		switch(color2) {
		case 0:
			col2="rojo";
			break;
		case 1:
			col2="azul";
			break;
		case 2:
			col2="verde";
			break;
		case 3:
			col2="amarillo";
			break;
		case 4:
			col2="violeta";
			break;
		case 5:
			col2="naranja";
			break;
		default: ;
		}
		
		switch(color3) {
		case 0:
			col3="rojo";
			break;
		case 1:
			col3="azul";
			break;
		case 2:
			col3="verde";
			break;
		case 3:
			col3="amarillo";
			break;
		case 4:
			col3="violeta";
			break;
		case 5:
			col3="naranja";
			break;
		default: ;
		}
		
		System.out.println(col1+" "+col2+" "+col3);
	}
}
