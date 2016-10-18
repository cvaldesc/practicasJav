package ejemploentradasalida;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EjemploEntradaSalid {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );
		
		String s = br.readLine();
		
		System.out.println(" la variable s vale: "+s);
		
		//conversion
		int a = 5;
		int b = 7;
		double c = 0.5;
		
		c = a; //implicita
		a = (int)c; //explicita o casting
		
		String siete = "7";
		
		//no se puede pasar de un String a un int
		//b = siete;
		// se debe hacer asi
		b = Integer.parseInt(siete); //metodo e clase asociadas
		c = Double.parseDouble(siete);
		
		//Operador
		
		int aa = 5;
		int ba = 2;
		
		System.out.println(aa+ba);
		System.out.println(aa-ba);
		System.out.println(aa*ba);
		System.out.println(aa/ba);
		System.out.println(aa%ba);//entrega el resto de una division
		
		//System.out.println(aa/0); da un ERROR
		
		
				
	}

}
