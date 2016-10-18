package ejerciciofibionaci;

public class EjercicioFibonacci {

	static int fib(int n){
		if(n < 2){
			return n;
		}else{
			return fib(n-1)+ fib(n-2);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i < 30; i++) {
			System.out.println("el fib("+ i +") es: "+ fib(i));
		}
		

	}

}
