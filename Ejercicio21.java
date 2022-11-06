package Capitulo6;

public class Ejercicio21 {
	
	public static void  main(String[] args) {
		
		int mon=0;
		int cc=0;
		String m="";
		String c="";
		for(int i=0;i<5;i++) {
			mon =(int)(Math.random()*8);
			cc=(int)(Math.random()*2);
			switch(mon) {
			case 0:
				m="1 centimo";
				break;
			case 1:
				m="2 centimos";
				break;
			case 2:
				m="5 centimos";
				break;
			case 3:
				m="10 centimos";
				break;
			case 4:
				m="20 centimos";
				break;
			case 5:
				m="50 centimos";
				break;
			case 6:
				m="1 euro";
				break;
			case 7:
				m="2 euros";
				break;
			default: ;
			}
			if(cc==0) {
				c="cara";
			}else {
				c="cruz";
			}
			System.out.println(m+" - "+c);
		}
	}

}
