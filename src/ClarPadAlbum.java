import java.util.ArrayList;

public class ClarPadAlbum {
	private int albumId;
	private String albumNombre;

	//LISTA
	private ArrayList<ClarPadCancion> lstCancionesAlbum = new ArrayList<ClarPadCancion>();

	//GET AND SET
	public int darAlbumId() {
		return albumId;
	}
	public void actualizarAlbumId(int albumId) {
		this.albumId = albumId;
	}
	public String darAlbumNombre() {
		return albumNombre;
	}
	public void actualizarAlbumNombre(String albumNombre) {
		this.albumNombre = albumNombre;
	}

	//CONSTRUCTOR
	public ClarPadAlbum(int albumId, String albumNombre) {
		super();
		this.albumId = albumId;
		this.albumNombre = albumNombre;
	}
	//INICIALIZACION DEL CONSTRUCTOR
	public ClarPadAlbum() {
		this.albumId = 0;
		this.albumNombre = " ";
	}
	//AGREGAR UNA CANCION
	public void agregarCancion(ClarPadCancion c) {
		lstCancionesAlbum.add(c);
	}
	//IMPRIMIR CANCIONES
	public  void imprimirCanciones() {
		System.out.println("-------------------------------------------------------");
		System.out.println("ID\tNOMBRE \t DURACION ");
		System.out.println("-------------------------------------------------------");
		for(ClarPadCancion c:lstCancionesAlbum) {
			c.imprimirDatosDeCancion();
		}
	}
	//TOTAL DE CANCIONES
	public int totalCanciones(){
		return lstCancionesAlbum.size();
	}
	public void numeroTotalCanciones() {
		
		System.out.printf("%-25s\t%-10d\n", darAlbumNombre(), totalCanciones());
		
	}
}
