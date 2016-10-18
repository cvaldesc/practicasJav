package ejemplobombilla;

public class Bombilla {
	// Propiedad
	private boolean estado = false;
	
	//Constructor
	public Bombilla() {
		// TODO Auto-generated constructor stub
		estado = false;
	}
	public Bombilla( boolean estado) {
		this.estado = estado;
	}
	
	//Metodos
	public void enceder(){
		estado = true;
	}
	public void apagar(){
		estado = false;
	}
	
	public void consultarEstado() {
		if(estado == true){
			System.out.println("encendida");
		}else{
			System.out.println("apagada");
		}
		
	}

}
