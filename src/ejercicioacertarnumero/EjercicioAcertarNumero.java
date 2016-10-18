package ejercicioacertarnumero;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class EjercicioAcertarNumero {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Random rm = new Random();
		int NumeroAleatorio = (int) (rm.nextDouble() * 100 + 0);
		String consulta = "";
		int NumeroEntregado;
		
		do  {
			System.out.print("ingresa un numero entre 0 y 100: ");
			NumeroEntregado = Integer.parseInt(br.readLine());
			System.out.println(NumeroAleatorio);
			if(NumeroAleatorio == NumeroEntregado){
				System.out.println("perfecto le achuntaste");
			}else{
				if(NumeroEntregado < NumeroAleatorio){
					 System.out.println("el numero es menor al numero por encontrar");
				}
				else{
					System.out.println("el numero es mayor al numero por encontrar");
				}
				
				System.out.print("Quieres continuar s|n: ");
				consulta = br.readLine();
			}
		}while(NumeroEntregado != NumeroAleatorio && consulta.equals("s"));
		System.out.print("TERMINAMOS");

	}

}
