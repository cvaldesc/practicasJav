package ejerciciolibroinfantil;

public class EjemploLibroInfantil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libro l = new Libro();
		
		l.abrir();
		l.cerrar();
		
		LibroInfantil li = new LibroInfantil();
		li.setEdadRecomendada(21);
		if(li.esRecomendable(25)){
			System.out.println("es recomendada");
		}else{
			System.out.println("no es recomendada");
		};
	}

}
