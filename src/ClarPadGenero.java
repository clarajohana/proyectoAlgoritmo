import java.util.ArrayList;

public class ClarPadGenero {
	private int generoId;
	private String generoNombre;

	//LISTA
	private ArrayList<ClarPadCancion> lstCanciones = new ArrayList<ClarPadCancion>();

	//GET AND SET
	public int darGeneroId() {
		return generoId;
	}
	public void actualizarGeneroId(int generoId) {
		this.generoId = generoId;
	}
	public String darGeneroNombre() {
		return generoNombre;
	}
	public void actualizarGeneroNombre(String generoNombre) {
		this.generoNombre = generoNombre;
	}

	//CONSTRUCTOR
	public ClarPadGenero(int generoId, String generoNombre) {
		super();
		this.generoId = generoId;
		this.generoNombre = generoNombre;
	}

	//INICIALIZACION DEL CONSTRUCTOR
	public ClarPadGenero() {
		this.generoId = 0;
		this.generoNombre = " ";
	}

	//AGREGAR UNA CANCION
	public void agregarCancion(ClarPadCancion c) {
		lstCanciones.add(c);
	}
	//IMPRIMIR CANCIONES
	public void imprimirCanciones() {
		System.out.println("-------------------------------------------------------");
		System.out.println("ID\tNOMBRE \t DURACION ");
		System.out.println("-------------------------------------------------------");
		for(ClarPadCancion c:lstCanciones) {
			c.imprimirDatosDeCancion();
		}
	}
	//IMPRIMIR DATOS DE GENERO
	public void imprimirDatosDeGenero(){
		System.out.printf("%d\t%s\n",generoId, generoNombre);
	}
	
	//IMPRIMIR CANCION CON MENOR DURACION 
	public void cancionDeMenorDuracionDelGenero() {
		System.out.printf("----------------------------------------------------------\n");
		System.out.println("\t		"+ darGeneroNombre().toUpperCase());
		int menor = lstCanciones.get(0).darDuracion();
		ClarPadCancion pos = null;
		for(ClarPadCancion c:lstCanciones) {
			if(c.darDuracion()<=menor) {
				menor=c.darDuracion();
				pos=c;
			}
		}
		buscarCancionPorDuracion(pos);
	}
	//Buscar cancion por duracion -- esto es para que si hay 2 canciones con el mismo valor las imprima
	public void buscarCancionPorDuracion(ClarPadCancion pos) {
		System.out.printf("----------------------------------------------------------\n");
		System.out.printf("%10s\t %10s\t %10s\n","ID CANCION","TITULO","DURACION");
		for(ClarPadCancion c:lstCanciones) {
			if(pos.darDuracion()==c.darDuracion()) {
				c.imprimirDatosDeCancion();
			}
		}
		
	}
}
