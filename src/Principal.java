import java.awt.EventQueue;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import vista.wLogo;
import vista.wSesion;
import vista.wRegistro;
import vista.wGeneros;
import vista.wPerfil;
import vista.wEditarPerfil;
import vista.wAmigoDavid;
import vista.wAmigos;
import vista.wPerfilAmigo;
import vista.wArtistasSalsa;
import vista.wAlbumes;
import vista.wCancion;
import vista.wArtistasRock;
import vista.wArtistasPop;
import vista.wArtistasReggae;
import vista.wArtistasHipHop;
import vista.wArtistasClasica;


public class Principal {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//wCancion frame = new wCancion();
					//wAlbumes frame = new wAlbumes();
					 //wArtistasClasica frame = new wArtistasClasica();
					 //wArtistasHipHop frame = new wArtistasHipHop();
					 //wArtistasReggae frame = new wArtistasReggae();
					 //wArtistasPop frame = new wArtistasPop();
					 //wArtistasRock frame = new wArtistasRock();
					 //wArtistasSalsa frame = new wArtistasSalsa();
					 wAmigoDavid frame = new wAmigoDavid();
					//wPerfilAmigo frame = new wPerfilAmigo();
					//wAmigos frame = new wAmigos();
					//wEditarPerfil frame = new wEditarPerfil();
					//wPerfil frame = new wPerfil();
					//wGeneros frame = new wGeneros();
					//wRegistro frame = new wRegistro();
					//wSesion frame = new wSesion();
					//wLogo frame = new wLogo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
