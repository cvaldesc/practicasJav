package ejerciciogrupoalumno;

public class Grupo {
	private String Codigo;
	private Alumno[] alumnos = null;
	
	public Grupo(){
		alumnos = new Alumno[5];
		for (int i = 0; i < alumnos.length; i++) {
				alumnos[i] = new Alumno();
		}
	}

	public String getCodigo() {
		return Codigo;
	}

	public void setCodigo(String codigo) {
		Codigo = codigo;
	}
	
}
