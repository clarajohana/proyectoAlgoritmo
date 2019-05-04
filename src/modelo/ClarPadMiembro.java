package modelo;
import java.util.ArrayList;

public class ClarPadMiembro {
	private int miembroId;
	private String miembroNombre;
	private String miembroApellido;
	private String miembroEmail;
	private String miembroContrasenia;
	
	//LISTA
	private ArrayList<ClarPadPerfil> lstPerfil = new ArrayList<ClarPadPerfil>();

	//GET AND SET
	public int darMiembroId() {
		return miembroId;
	}
	public void actualizarMiembroId(int miembroId) {
		this.miembroId = miembroId;
	}
	public String darMiembroNombre() {
		return miembroNombre;
	}
	public void actualizarMiembroNombre(String miembroNombre) {
		this.miembroNombre = miembroNombre;
	}
	public String darMiembroApellido() {
		return miembroApellido;
	}
	public void actualizarMiembroApellido(String miembroApellido) {
		this.miembroApellido = miembroApellido;
	}
	public String darMiembroEmail() {
		return miembroEmail;
	}
	public void actualizarMiembroEmail(String miembroEmail) {
		this.miembroEmail = miembroEmail;
	}
	public String darMiembroContraseña() {
		return miembroContrasenia;
	}
	public void actualizarMiembroContraseña(String miembroContrasenia) {
		this.miembroContrasenia = miembroContrasenia;
	}

	//CONSTRUCTOR
	public ClarPadMiembro(int miembroId, String miembroNombre, String miembroApellido, String miembroEmail,
			String miembroContrasenia) {
		super();
		this.miembroId = miembroId;
		this.miembroNombre = miembroNombre;
		this.miembroApellido = miembroApellido;
		this.miembroEmail = miembroEmail;
		this.miembroContrasenia = miembroContrasenia;
	}

	//INICIALIZACION DEL CONSTRUCTOR
	public ClarPadMiembro() {
		this.miembroId = 0;
		this.miembroNombre = " ";
		this.miembroApellido = " ";
		this.miembroEmail = " ";
		this.miembroContrasenia = " ";
	}

	//AGREGAR UN PERFIL
	public void añadirPerfil(ClarPadPerfil p) {
		lstPerfil.add(p);
	}
	//IMPRIMIR PERFILES
	public void imprimirPerfil() {
		System.out.println("-------------------------------------------------------");
		System.out.println("ID\tNOMBRE ");
		System.out.println("-------------------------------------------------------");
		for(ClarPadPerfil p:lstPerfil) {
			p.imprimirDatosDePerfil();
		}
	}
	
	//PERFILES EN TOTAL
	public int totalPerfiles(){
		return lstPerfil.size();
	}
	
	//IMPRIMIR DATOS DE MIEMBRO
	public void imprimirDatosDeMiembro(){
		System.out.printf("%d\t%8s\t%8s\t%s\t%s\n",miembroId,miembroNombre, miembroApellido,miembroEmail,miembroContrasenia);
	}
	
}
