public class ClarPadCancion {
	private int cancionId;
	private String nombreCancion;
	private int duracion;

	//GET AND SET
	public int darCancionId() {
		return cancionId;
	}
	public void actualizarCancionId(int cancionId) {
		this.cancionId = cancionId;
	}
	public String darNombreCancion() {
		return nombreCancion;
	}
	public void actualizarNombreCancion(String nombreCancion) {
		this.nombreCancion = nombreCancion;
	}
	public int darDuracion() {
		return duracion;
	}
	public void actualizarDuracion(int duracion) {
		this.duracion = duracion;
	}

	//CONSTRUCTOR
	public ClarPadCancion(int cancionId, String nombreCancion, int duracion) {
		super();
		this.cancionId = cancionId;
		this.nombreCancion = nombreCancion;
		this.duracion = duracion;
	}
	//INICIALIZACION DEL CONSTRUCTOR
	public ClarPadCancion() {
		this.cancionId = 0;
		this.nombreCancion = " ";
		this.duracion = 0;
	}
	//IMPRIMIR DATOS DE LA CANCION
	public void imprimirDatosDeCancion(){
		System.out.printf("%-10d\t %10s %10d\n",cancionId,nombreCancion,duracion);
	}
	
	

}
