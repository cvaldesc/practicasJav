package ejercicioOperaciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioOperaciones {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		int a;
		double b;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );
		
		System.out.print(" Ingrese numero entero");
		String valorA = br.readLine();
		
		System.out.print(" Ingrese numero Real");
		String valorB = br.readLine();
		
		System.out.print(" la variable A vale: "+ valorA);
		System.out.print(" la variable B vale: "+ valorB);
		
		a = Integer.parseInt(valorA);
		b = Double.parseDouble(valorB);
		
		System.out.println("operaciones numero entero");
		System.out.println(a+a);
		System.out.println(a-a);
		System.out.println(a*a);
		System.out.println(a/a);
		System.out.println(a%a);
		
		System.out.println("operaciones numero reales");
		System.out.println(b+b);
		System.out.println(b-b);
		System.out.println(b*b);
		System.out.println(b/b);
		System.out.println(b%b);
	
		System.out.println("operaciones numero reale y entero");
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
	}

}
