package modelo;
import java.util.ArrayList;

public class AppClarPad {
	//INTEGRANTES : clara leon y Paula Arcila

	private String nombreDelaApp;

	//listas
	private ArrayList<PlanRegistro> lstPlanRegistro= new ArrayList<PlanRegistro>();
	private ArrayList<ClarPadGenero> lstGenero= new ArrayList<ClarPadGenero>();
	private ArrayList<ClarPadAlbum> lstAlbum= new ArrayList<ClarPadAlbum>();

	public static void main(String[] args) {
		AppClarPad clarpad = new AppClarPad();
		//BIENVENIDA
		System.out.println("		¡Bienvenido a AppClarPad!			");
		System.out.println("Aplicacion de Musica, sus creadoras Clara Leon y Paula Arcila");
		System.out.println("-----------------------------------------------------------------------");

		//PLANES DEL REGISTRO
		System.out.println("		ESTOS SON NUESTROS PLANES		");
		PlanRegistro pr1 = new PlanRegistro(1,"Plan Basico", 1.000);
		PlanRegistro pr2 = new PlanRegistro(2,"Plan Estandar", 3.000);
		PlanRegistro pr3 = new PlanRegistro(3,"Plan Premium", 5.000);

		/**
		 * Agregar registro al objeto Clardpad
		 */
		clarpad.agregarPlanRegistro(pr1);
		clarpad.agregarPlanRegistro(pr2);
		clarpad.agregarPlanRegistro(pr3);
		clarpad.imprimirPlanesRegistro(); 

		//MIEMBROS PRINCIPALES 
		ClarPadMiembro m1 =new ClarPadMiembro(1,"Maria","Santos","marias@correo.com","MiContraseña");
		ClarPadMiembro m2 =new ClarPadMiembro(2,"Carlos","Carreño", "CarCa@correo.com","MiContraseña");
		ClarPadMiembro m3 =new ClarPadMiembro(3,"Cecilia","Torres","ceciTorres@correo.com","MiContraseña");
		ClarPadMiembro m4 =new ClarPadMiembro(4,"Paola","Lopez","marias@correo.com","MiContraseña");
		ClarPadMiembro m5 =new ClarPadMiembro(5,"Pedro","","marias@correo.com","MiContraseña");
		ClarPadMiembro m6 =new ClarPadMiembro(6,"Maria","Santos","marias@correo.com","MiContraseña");

		/**
		 * Agregar dos miembros principales a cada Plan
		 */
		pr1.agregarMiembro(m1);
		pr1.agregarMiembro(m2);
		pr2.agregarMiembro(m3);
		pr2.agregarMiembro(m4);
		pr3.agregarMiembro(m5);
		pr3.agregarMiembro(m6);

		//PERFILES
		ClarPadPerfil p1=new ClarPadPerfil(1,"Valery Gomez");
		ClarPadPerfil p2=new ClarPadPerfil(2,"Andrea Escobar");
		ClarPadPerfil p3=new ClarPadPerfil(3,"Laura Pedraza");
		ClarPadPerfil p4=new ClarPadPerfil(4,"Maria Chavez");
		ClarPadPerfil p5=new ClarPadPerfil(5,"Pablo Dominguez");
		ClarPadPerfil p6=new ClarPadPerfil(6,"Mateo Castelblanco");
		ClarPadPerfil p7=new ClarPadPerfil(7,"Elena Garcia");
		ClarPadPerfil p8=new ClarPadPerfil(8,"Daniel Diaz");
		ClarPadPerfil p9=new ClarPadPerfil(9,"Roberto Buitrago");
		ClarPadPerfil p10=new ClarPadPerfil(10,"Victor Zuluaga");
		ClarPadPerfil p11=new ClarPadPerfil(11,"Lina Cortes");
		ClarPadPerfil p12=new ClarPadPerfil(12,"David Vidal");

		/**
		 * Agregar 2 perfiles a cada miembro principal
		 */
		m1.añadirPerfil(p1); m1.añadirPerfil(p2);
		m2.añadirPerfil(p3); m2.añadirPerfil(p4);
		m3.añadirPerfil(p5); m3.añadirPerfil(p6);
		m4.añadirPerfil(p7); m4.añadirPerfil(p8);
		m5.añadirPerfil(p9); m5.añadirPerfil(p10);
		m6.añadirPerfil(p11); m6.añadirPerfil(p12);

		//GENEROS
		ClarPadGenero g1 = new ClarPadGenero(1,"Pop");
		ClarPadGenero g2 = new ClarPadGenero(2,"Indie");
		ClarPadGenero g3 = new ClarPadGenero(3,"Rock");
		ClarPadGenero g4 = new ClarPadGenero(4,"K-pop");

		/**
		 * Agregar genero al objeto clarpad
		 */
		clarpad.agregarGenero(g1);
		clarpad.agregarGenero(g2);
		clarpad.agregarGenero(g3);
		clarpad.agregarGenero(g4);

		//CANCIONES 
		ClarPadCancion c1= new ClarPadCancion(1,"Perfecta",2);
		ClarPadCancion c2= new ClarPadCancion(2,"Needy",2);
		ClarPadCancion c3= new ClarPadCancion(3,"Luciernagas",3);
		ClarPadCancion c4= new ClarPadCancion(4,"Veneno",2);
		ClarPadCancion c5= new ClarPadCancion(5,"El loco",2);
		ClarPadCancion c6= new ClarPadCancion(6,"Días raros",2);
		ClarPadCancion c7= new ClarPadCancion(7,"Crown",2);
		ClarPadCancion c8= new ClarPadCancion(8,"Twit",2);

		/**
		 * Agregar dos canciones a cada genero
		 */
		g1.agregarCancion(c1);
		g1.agregarCancion(c2);
		g1.agregarCancion(c3);
		g2.agregarCancion(c4);
		g3.agregarCancion(c5);
		g3.agregarCancion(c6);
		g4.agregarCancion(c7);
		g4.agregarCancion(c8);

		//ALBUNES
		ClarPadAlbum b1= new ClarPadAlbum(1,"El templo del pop");
		ClarPadAlbum b2= new ClarPadAlbum(2,"Thank u, next");
		ClarPadAlbum b3= new ClarPadAlbum(3,"Luciernagas");
		ClarPadAlbum b4= new ClarPadAlbum(4,"Encanto tropical");
		ClarPadAlbum b5= new ClarPadAlbum(5,"Jessico");
		ClarPadAlbum b6= new ClarPadAlbum(6,"Dias raros");
		ClarPadAlbum b7= new ClarPadAlbum(7,"The dream Chapter Star");
		ClarPadAlbum b8= new ClarPadAlbum(8,"Twit");

		/**
		 * Agregar albunes a el objeto clarpad
		 */
		clarpad.agregarAlbum(b1);
		clarpad.agregarAlbum(b2);
		clarpad.agregarAlbum(b3);
		clarpad.agregarAlbum(b4);
		clarpad.agregarAlbum(b5);
		clarpad.agregarAlbum(b6);
		clarpad.agregarAlbum(b7);
		clarpad.agregarAlbum(b8);

		/**
		 * agregar una cancion a los albunes
		 */
		b1.agregarCancion(c1);
		b2.agregarCancion(c2);
		b3.agregarCancion(c3);
		b4.agregarCancion(c4);
		b5.agregarCancion(c5);
		b6.agregarCancion(c6);
		b7.agregarCancion(c7);
		b8.agregarCancion(c8);

		//g1.cancionDeMenorDuracionDelGenero(); Nota para recordar como funcionan los metodos

		/**
		 * IMPRIMIR EN LA APP clarpad Los siguientes metodos
		 */
		clarpad.cancionDeMenorDuracionPorCadaGenero();
		clarpad.planConMayorCosto();
		clarpad.totalDeCancionesPorAlbum();

	}

	//Get and set
	public String darNombreDelaApp() {
		return nombreDelaApp;
	}

	public void actualizarNombreDelaApp(String nombreDelaApp) {
		this.nombreDelaApp = nombreDelaApp;
	}

	//----------------------------METODOS------------------

	//agregar una Plan de registro
	public void agregarPlanRegistro(PlanRegistro pr) {
		lstPlanRegistro.add(pr);
	}

	//imprimir los Planes de Registro
	public  void imprimirPlanesRegistro() {
		System.out.println("ID\t TIPO \t           COSTO");
		System.out.println("-----------------------------------------------------------------------");
		for(PlanRegistro pr:lstPlanRegistro) {
			pr.printData();
		}
	}

	//agregar una GENERO
	public void agregarGenero(ClarPadGenero g) {
		lstGenero.add(g);
	}

	//imprimir los GENEROS
	public  void imprimirGeneros() {
		System.out.println("ID\t TIPO \t           COSTO");
		System.out.println("-----------------------------------------------------------------------");
		for(ClarPadGenero g:lstGenero) {
			g.imprimirDatosDeGenero();
		}
	}

	//agregar una ALBUM
	public void agregarAlbum(ClarPadAlbum b) {
		lstAlbum.add(b);
	}

	//CANCION CON MENOR DURACION POR GENEROS
	public void cancionDeMenorDuracionPorCadaGenero(){
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("	CANCIONES CON MENOR DURACION POR GENEROS");
		for(ClarPadGenero g:lstGenero) {
			g.cancionDeMenorDuracionDelGenero();
		}
	}

	//PLAN CON MAYOR COSTO
	public void planConMayorCosto(){
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("		PLAN CON MAYOR COSTO					");
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("ID\tPLAN\t	   COSTO ");
		double mayor =  lstPlanRegistro.get(0).darPlanCosto();
		PlanRegistro pos = null;
		for(PlanRegistro pr:lstPlanRegistro) {
			if(pr.darPlanCosto()>mayor) {
				mayor=pr.darPlanCosto();
				pos=pr;
			}
		}
		pos.printData();
	}

	//TOTAL DE CANCIONES POR ALBUM
	public void totalDeCancionesPorAlbum(){
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("	TOTAL DE CANCIONES POR ALBUM					");
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("NOMBRE DEL ALBUM\t CANTIDAD DE CANCIONES \n ");
		for(ClarPadAlbum b:lstAlbum) {
			b.numeroTotalCanciones();
		}
	}
}

