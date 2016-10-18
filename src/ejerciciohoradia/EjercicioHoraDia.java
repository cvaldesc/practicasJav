package ejerciciohoradia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioHoraDia {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//VERSION MIA
		int hora, min;

		System.out.print("Ingrese la hora del dia (Ej: hh): ");
		//String horaInput = br.readLine();
		//hora = Integer.parseInt(horaInput);
		hora = Integer.parseInt(br.readLine());
		
		
		System.out.print("Ingrese los min  (Ej: mm): ");
		//String minInput = br.readLine();
		//min = Integer.parseInt(minInput);
		min = Integer.parseInt(br.readLine());
		
		if(hora >= 8 && hora < 12){
			System.out.println("son las "+ hora+":"+min+ "de la manana");
		}if(hora == 12 ){
			System.out.println("son las "+ hora+":"+min+ "del medio dia");
		}if(hora > 12 && hora <= 20){
			System.out.println("son las "+ hora+":"+min+ "de la tarde");
		}if(hora > 20 && hora < 24){
			System.out.println("son las "+ hora+":"+min+ "de la noche");
		}if(hora == 24){
			System.out.println("son las "+ hora+":"+min+ "de la noche exacta");
		}if(hora > 0 && hora < 8){
			System.out.println("son las "+ hora+":"+min+ "de la madrugada");
		}
		

	}

}
