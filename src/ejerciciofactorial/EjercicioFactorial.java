package ejerciciofactorial;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EjercicioFactorial {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.print("ingrese el numero: ");
		int n = Integer.parseInt(br.readLine());
		
		while (n < 0) {
			System.out.println("error al ingresa el numero");
			
			System.out.print ("ingrese el numero: ");
			n = Integer.parseInt(br.readLine());
			
		}
		int factorial = 1;
		for (int i = 1; i <= n; i++) {
			//factorial = factorial *i;
			factorial *= i;
		}
		System.out.println("factorial de "+n +" el valor "+ factorial);
	}

}
