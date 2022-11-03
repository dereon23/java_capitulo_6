package Capitulo6;

public class Ejercicio10 {
	
	public static void main(String[] args) {
		int caract;
		int largo;
		char caractchar;
		for(int i=1; i<=10; i++) {
			
			largo = (int)(Math.random()*40+1);
			caract = (int)(Math.random()*6);
			switch(caract) {
				case 0:
					caractchar = '*';
					break;
				case 1:
					caractchar = '-';
					break;
				case 2:
					caractchar = '=';
					break;
				case 3:
					caractchar = '.';
					break;
				case 4:
					caractchar = '|';
					break;
				case 5:
					caractchar = '@';
					break;
				default:
					caractchar='!';
			}
			for(int j=1; j<=largo; j++) {
				System.out.print(caractchar);
			}
			System.out.println();
		}
	}

}
