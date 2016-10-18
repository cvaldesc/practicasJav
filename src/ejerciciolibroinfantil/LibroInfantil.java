package ejerciciolibroinfantil;

public class LibroInfantil extends Libro{
	private static int edadRecomendada = 18;
	
	public int getEdadRecomendada() {
		return edadRecomendada;
	}

	public void setEdadRecomendada(int edadRecomendada) {
		LibroInfantil.edadRecomendada = edadRecomendada;
	}

	public boolean esRecomendable( int edadNinyo){
		if (edadRecomendada <= edadNinyo){
			return true;
		}else{

			return false;	
		}
	}
}
