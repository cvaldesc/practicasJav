package ejerciciofuncionprimos;

public class EjercicioFuncionPrimos {
	static boolean esPrimo(int a){
		boolean siOno = true;
		int i = 2;
		while(i < a){
			if( a%i == 0){
				siOno = false;
				
			}
			i++;
		}
		return siOno;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 1; i <= 1000; i++) {
			//System.out.println(i);
			
			if(esPrimo(i)){
				
				System.out.println(i);
			}else{
				//System.out.println("no es primo");
			}
		}

	}

}
