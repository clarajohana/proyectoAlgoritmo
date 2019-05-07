package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.SwingConstants;

public class wPerfil extends JFrame {

	private JPanel contentPane;
	private JLabel lblBarra;
	private JButton btnMenu;
	private JLabel lblFondoDegrade;
	private JLabel lblPerfil;
	private JButton btnRegresar;
	private JLabel lblFotoPerfil;
	private JLabel lblMariaCarreo;
	private JLabel lblAmigos;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblMisCanciones;
	private JButton btnAmigos;
	private JButton btnAlbum;
	private JButton btnNewButton;
	private JTable table;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	public wPerfil() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 506, 769);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"#", "Nombre", "Duraci\u00F3n", "Figura"
			}
		));
		table.setBounds(67, 322, 352, 327);
		contentPane.add(table);
		btnMenu = new JButton("");
		btnMenu.setBackground(new Color(51, 0, 102));
		btnMenu.setIcon(new ImageIcon(wGeneros.class.getResource("/xImagenes/menu.png")));
		btnMenu.setBounds(413, 0, 67, 67);
		contentPane.add(btnMenu);
		
		btnRegresar = new JButton("");
		btnRegresar.setBackground(new Color(51, 0, 102));
		btnRegresar.setIcon(new ImageIcon(wPerfil.class.getResource("/xImagenes/flecha.png")));
		btnRegresar.setBounds(10, 0, 67, 67);
		contentPane.add(btnRegresar);
		
		lblPerfil = new JLabel("Perfil");
		lblPerfil.setForeground(new Color(255, 255, 255));
		lblPerfil.setFont(new Font("Calibri", Font.PLAIN, 29));
		lblPerfil.setBounds(334, 22, 67, 29);
		contentPane.add(lblPerfil);
		
		lblFotoPerfil = new JLabel("New label");
		lblFotoPerfil.setIcon(new ImageIcon(wPerfil.class.getResource("/xImagenes/fotoperfil.png")));
		lblFotoPerfil.setBounds(53, 104, 150, 147);
		contentPane.add(lblFotoPerfil);
		
		lblBarra = new JLabel("New label");
		lblBarra.setIcon(new ImageIcon(wGeneros.class.getResource("/xImagenes/barramenu.png")));
		lblBarra.setBounds(0, 0, 490, 75);
		contentPane.add(lblBarra);
		
		lblMariaCarreo = new JLabel("Maria Carre\u00F1o");
		lblMariaCarreo.setForeground(new Color(255, 255, 255));
		lblMariaCarreo.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblMariaCarreo.setBounds(266, 123, 134, 29);
		contentPane.add(lblMariaCarreo);
		
		lblAmigos = new JLabel("50 amigos");
		lblAmigos.setForeground(new Color(255, 255, 255));
		lblAmigos.setFont(new Font("Calibri", Font.PLAIN, 13));
		lblAmigos.setBounds(287, 165, 67, 14);
		contentPane.add(lblAmigos);
		
		lblNewLabel = new JLabel("\u00C1lbumes");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 13));
		lblNewLabel.setBounds(287, 200, 67, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("32 favoritos");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Calibri", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(287, 237, 88, 14);
		contentPane.add(lblNewLabel_1);
		
		lblMisCanciones = new JLabel("Mis canciones");
		lblMisCanciones.setForeground(new Color(255, 255, 255));
		lblMisCanciones.setFont(new Font("Calibri", Font.PLAIN, 30));
		lblMisCanciones.setBounds(53, 262, 269, 43);
		contentPane.add(lblMisCanciones);
		
		btnAmigos = new JButton("");
		btnAmigos.setBackground(new Color(51, 51, 102));
		btnAmigos.setIcon(new ImageIcon(wPerfil.class.getResource("/xImagenes/amigos.png")));
		btnAmigos.setBounds(256, 163, 27, 27);
		contentPane.add(btnAmigos);
		
		btnAlbum = new JButton("");
		btnAlbum.setBackground(new Color(51, 51, 102));
		btnAlbum.setIcon(new ImageIcon(wPerfil.class.getResource("/xImagenes/disco.png")));
		btnAlbum.setBounds(256, 196, 27, 27);
		contentPane.add(btnAlbum);
		
		btnNewButton = new JButton("");
		btnNewButton.setBackground(new Color(51, 51, 102));
		btnNewButton.setIcon(new ImageIcon(wPerfil.class.getResource("/xImagenes/feliz.png")));
		btnNewButton.setBounds(256, 233, 27, 27);
		contentPane.add(btnNewButton);
		
		lblFondoDegrade = new JLabel("New label");
		lblFondoDegrade.setIcon(new ImageIcon(wPerfil.class.getResource("/xImagenes/degrade.png")));
		lblFondoDegrade.setBounds(0, 0, 490, 730);
		contentPane.add(lblFondoDegrade);
	}
}
