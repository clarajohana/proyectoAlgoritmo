package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;

public class wEditarPerfil extends JFrame {

	private JPanel contentPane;
	private JLabel lblBarra;
	private JLabel lblFondoDegrade;
	private JButton btnRegresar;
	private JButton btnMenu;
	private JLabel lblEditarPerfil;
	private JLabel lblFotoPerfil;
	private JLabel lbConfiguracion;
	private JLabel lblLinea;
	private JLabel lblNombre;
	private JLabel lblMariaCarreo;
	private JLabel lblContra;
	private JLabel lblcifra;
	private JLabel lblEmojiDeFavoritos;
	private JLabel lblNotifica;
	private JButton btnGuadar;
	private JLabel lblNotificarmeCuandoHaya;
	private JButton btnEditarNombre;
	private JButton btnEditarContra;
	private JButton btnEditarEmoji;
	private JButton btnEditarFoto;
	private JCheckBox chckbxNewCheckBox;
	

	/**
	 * Create the frame.
	 */
	public wEditarPerfil() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 506, 769);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		btnRegresar = new JButton("");
		btnRegresar.setBackground(new Color(51, 0, 102));
		btnRegresar.setIcon(new ImageIcon(wPerfil.class.getResource("/xImagenes/flecha.png")));
		btnRegresar.setBounds(10, 0, 67, 67);
		contentPane.add(btnRegresar);
		
		btnMenu = new JButton("");
		btnMenu.setBackground(new Color(51, 0, 102));
		btnMenu.setIcon(new ImageIcon(wGeneros.class.getResource("/xImagenes/menu.png")));
		btnMenu.setBounds(413, 0, 67, 67);
		contentPane.add(btnMenu);
		
		lblEditarPerfil = new JLabel("Editar perfil");
		lblEditarPerfil.setForeground(new Color(255, 255, 255));
		lblEditarPerfil.setFont(new Font("Calibri", Font.PLAIN, 29));
		lblEditarPerfil.setBounds(245, 22, 158, 29);
		contentPane.add(lblEditarPerfil);

		lblBarra = new JLabel("New label");
		lblBarra.setIcon(new ImageIcon(wGeneros.class.getResource("/xImagenes/barramenu.png")));
		lblBarra.setBounds(5, 0, 485, 75);
		contentPane.add(lblBarra);
		
		btnEditarFoto = new JButton("");
		btnEditarFoto.setIcon(new ImageIcon(wEditarPerfil.class.getResource("/xImagenes/camara.png")));
		btnEditarFoto.setBounds(268, 202, 47, 47);
		contentPane.add(btnEditarFoto);
		
		lblFotoPerfil = new JLabel("New label");
		lblFotoPerfil.setIcon(new ImageIcon(wPerfil.class.getResource("/xImagenes/fotoperfil.png")));
		lblFotoPerfil.setBounds(165, 104, 150, 147);
		contentPane.add(lblFotoPerfil);
		
		lbConfiguracion = new JLabel("Configuraci\u00F3n");
		lbConfiguracion.setForeground(new Color(255, 255, 255));
		lbConfiguracion.setFont(new Font("Calibri", Font.PLAIN, 30));
		lbConfiguracion.setBounds(153, 262, 190, 43);
		contentPane.add(lbConfiguracion);
		
		lblLinea = new JLabel("New label");
		lblLinea.setIcon(new ImageIcon(wEditarPerfil.class.getResource("/xImagenes/linea.png")));
		lblLinea.setBounds(178, 316, 116, 4);
		contentPane.add(lblLinea);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setForeground(new Color(255, 255, 255));
		lblNombre.setFont(new Font("Calibri", Font.BOLD, 16));
		lblNombre.setBounds(112, 341, 61, 14);
		contentPane.add(lblNombre);
		
		lblMariaCarreo = new JLabel("Maria Carre\u00F1o");
		lblMariaCarreo.setForeground(new Color(255, 255, 255));
		lblMariaCarreo.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblMariaCarreo.setBounds(112, 366, 105, 14);
		contentPane.add(lblMariaCarreo);
		
		lblContra = new JLabel("Contrase\u00F1a");
		lblContra.setForeground(new Color(255, 255, 255));
		lblContra.setFont(new Font("Calibri", Font.BOLD, 16));
		lblContra.setBounds(112, 420, 105, 20);
		contentPane.add(lblContra);
		
		lblcifra = new JLabel("*************");
		lblcifra.setForeground(new Color(255, 255, 255));
		lblcifra.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblcifra.setBounds(112, 451, 116, 14);
		contentPane.add(lblcifra);
		
		lblEmojiDeFavoritos = new JLabel("Emoji de favoritos");
		lblEmojiDeFavoritos.setForeground(new Color(255, 255, 255));
		lblEmojiDeFavoritos.setFont(new Font("Calibri", Font.BOLD, 16));
		lblEmojiDeFavoritos.setBounds(112, 499, 150, 14);
		contentPane.add(lblEmojiDeFavoritos);
		
		lblNotifica = new JLabel("Notificaci\u00F3n");
		lblNotifica.setForeground(new Color(255, 255, 255));
		lblNotifica.setFont(new Font("Calibri", Font.BOLD, 16));
		lblNotifica.setBounds(112, 546, 126, 29);
		contentPane.add(lblNotifica);
		
		btnGuadar = new JButton("Guardar");
		btnGuadar.setForeground(new Color(255, 255, 255));
		btnGuadar.setBackground(new Color(204, 204, 0));
		btnGuadar.setFont(new Font("Calibri", Font.PLAIN, 21));
		btnGuadar.setBounds(153, 650, 190, 43);
		contentPane.add(btnGuadar);
		
		lblNotificarmeCuandoHaya = new JLabel("Notificarme cuando haya \r\nuna nueva canci\u00F3n.");
		lblNotificarmeCuandoHaya.setForeground(new Color(255, 255, 255));
		lblNotificarmeCuandoHaya.setFont(new Font("Calibri", Font.PLAIN, 13));
		lblNotificarmeCuandoHaya.setBounds(112, 573, 257, 43);
		contentPane.add(lblNotificarmeCuandoHaya);
		
		btnEditarNombre = new JButton("");
		btnEditarNombre.setBackground(new Color(51, 51, 102));
		btnEditarNombre.setIcon(new ImageIcon(wEditarPerfil.class.getResource("/xImagenes/lapiz.png")));
		btnEditarNombre.setBounds(387, 341, 40, 40);
		contentPane.add(btnEditarNombre);
		
		btnEditarContra = new JButton("");
		btnEditarContra.setBackground(new Color(51, 51, 102));
		btnEditarContra.setIcon(new ImageIcon(wEditarPerfil.class.getResource("/xImagenes/lapiz.png")));
		btnEditarContra.setBounds(387, 420, 40, 40);
		contentPane.add(btnEditarContra);
		
		btnEditarEmoji = new JButton("");
		btnEditarEmoji.setBackground(new Color(51, 51, 102));
		btnEditarEmoji.setIcon(new ImageIcon(wEditarPerfil.class.getResource("/xImagenes/lapiz.png")));
		btnEditarEmoji.setBounds(387, 497, 40, 40);
		contentPane.add(btnEditarEmoji);
		
		chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setBackground(new Color(51, 51, 102));
		chckbxNewCheckBox.setBounds(387, 584, 40, 23);
		contentPane.add(chckbxNewCheckBox);

		lblFondoDegrade = new JLabel("New label");
		lblFondoDegrade.setForeground(new Color(255, 255, 255));
		lblFondoDegrade.setIcon(new ImageIcon(wPerfil.class.getResource("/xImagenes/degrade.png")));
		lblFondoDegrade.setBounds(5, 0, 485, 730);
		contentPane.add(lblFondoDegrade);

	}
}
