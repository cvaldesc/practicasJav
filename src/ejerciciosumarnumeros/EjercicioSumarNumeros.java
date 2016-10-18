package ejerciciosumarnumeros;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EjercicioSumarNumeros {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String respuesta;
		int total =0;
		int valor;
		
		System.out.print("quieres agregar un numero entero:");
		respuesta = br.readLine();
		/* MI FORMA
		if(respuesta.equals("si")){
			do {
				
				System.out.print("ingresa un numero entero: ");
				valor = Integer.parseInt(br.readLine());
				System.out.print("quieres agregar otro numero si o no:" );
				respuesta = br.readLine();
				total= total + valor;
			} while (respuesta.equals("si"));
			
			
			System.out.print(total);
			
		}else{
			System.out.print("gracias");
		}*/
		while (respuesta.equals("si")) {
			System.out.print("ingresa un numero entero: ");
			valor = Integer.parseInt(br.readLine());
			total= total + valor;
			System.out.print("quieres agregar otro numero si o no:" );
			respuesta = br.readLine();
			
		}
		System.out.print(total);
	}

}
