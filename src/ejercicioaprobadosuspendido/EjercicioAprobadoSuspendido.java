package ejercicioaprobadosuspendido;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioAprobadoSuspendido {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("ingrese la nota: ");
		int nota = Integer.parseInt(br.readLine());
		
		if(nota >= 0 && nota <= 10){
			switch (nota) {
			case 5:
				System.out.println("aprobado");
				break;
			case 6:
				System.out.println("muy bien");
				break;
			case 7:
				System.out.println("muy bien +1");
				break;
			case 8:
				System.out.println("notable");
				break;
			case 9:
				System.out.println("explendido");
				break;
			case 10:
				System.out.println("Excelente");
				break;
			default:
				System.out.println("rechazado");
				break;
			}
		}else{
			System.out.println("la nota es invalido");
		}
	}

}
