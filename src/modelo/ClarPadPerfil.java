package modelo;
import java.util.ArrayList;

public class ClarPadPerfil {
	private int perfilId;
	private String perfilNombre;

	//LISTA 
	private ArrayList<ClarPadCancion> lstReproduccion = new ArrayList<ClarPadCancion>();

	//GET AND SET
	public int darPerfilId() {
		return perfilId;
	}
	public void actualizarPerfilId(int perfilId) {
		this.perfilId = perfilId;
	}
	public String darPerfilNombre() {
		return perfilNombre;
	}
	public void actualizarPerfilNombre(String perfilNombre) {
		this.perfilNombre = perfilNombre;
	}
	//CONSTRUCTOR
	public ClarPadPerfil(int perfilId, String perfilNombre) {
		super();
		this.perfilId = perfilId;
		this.perfilNombre = perfilNombre;
	}
	//INICIALIZACION DEL CONSTRUCTOR
	public ClarPadPerfil() {
		this.perfilId = 0;
		this.perfilNombre = " ";
	}

	//AGREGAR UNA CANCION
	public void agregarCancion(ClarPadCancion c) {
		lstReproduccion.add(c);
	}
	//IMPRIMIR CANCIONES
	public  void imprimirCanciones() {
		System.out.println("-------------------------------------------------------");
		System.out.println("ID\tNOMBRE \t DURACION ");
		System.out.println("-------------------------------------------------------");
		for(ClarPadCancion c:lstReproduccion) {
			System.out.printf("%d\t%s\t%d\n",c.darCancionId(),c.darNombreCancion(),c.darDuracion());
		}
	}

	//IMPRIMIR DATOS DE PERFIL
	public void imprimirDatosDePerfil(){
		System.out.printf("%d\t%s\n",perfilId, perfilNombre);
	}

}
