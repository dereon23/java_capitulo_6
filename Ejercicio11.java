package Capitulo6;

public class Ejercicio11 {
	
	public static void main(String[] args) {
		int nota;
		int suspenso=0;
		int suficiente=0;
		int bien=0;
		int notable=0;
		int sobresaliente=0;
		
		for(int i=0; i<20; i++) {
			nota = (int)(Math.random()*5);
			
			switch(nota){
				case 0:
					System.out.print("suspenso, ");
					suspenso++;
					break;
				case 1:
					System.out.print("suficiente, ");
					suficiente++;
					break;
				case 2:
					System.out.print("bien, ");
					bien++;
					break;
				case 3:
					System.out.print("notable, ");
					notable++;
					break;
				case 4:
					System.out.print("sobresaliente, ");
					sobresaliente++;
					break;
				default:
					;
			}
		}
		System.out.println("\nCantidad de suspensos: " + suspenso);
		System.out.println("Cantidad de suficiente: " + suficiente);
		System.out.println("Cantidad de bien: " + bien);
		System.out.println("Cantidad de notable: " + notable);
		System.out.println("Cantidad de sobresaliente: " + sobresaliente);
	}


}
