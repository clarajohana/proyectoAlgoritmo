package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class wAmigoDavid extends JFrame {

	private JPanel contentPane;

	private JLabel lblBarra;
	private JButton btnMenu;
	private JLabel lblFondoDegrade;
	private JLabel lblPerfilAmigos;
	private JButton btnRegresar;
	private JLabel lblFotoPerfil;
	private JLabel lblDavid;
	private JLabel lblAmigos;
	private JLabel lblAlbum;
	private JLabel lblFavoritos;
	private JButton btnAmigos;
	private JButton btnAlbum;
	private JButton btnNewButton;
	private JTable table;
	private JCheckBox chckbxNewCheckBox;
	

	/**
	 * Create the frame.
	 */
	public wAmigoDavid() {
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
		
		lblPerfilAmigos = new JLabel("Perfil amigos");
		lblPerfilAmigos.setForeground(new Color(255, 255, 255));
		lblPerfilAmigos.setFont(new Font("Calibri", Font.PLAIN, 29));
		lblPerfilAmigos.setBounds(240, 22, 161, 29);
		contentPane.add(lblPerfilAmigos);
		
		lblFotoPerfil = new JLabel("New label");
		lblFotoPerfil.setIcon(new ImageIcon(wAmigoDavid.class.getResource("/xImagenes/david1.png")));
		lblFotoPerfil.setBounds(61, 113, 150, 147);
		contentPane.add(lblFotoPerfil);
		
		lblBarra = new JLabel("New label");
		lblBarra.setIcon(new ImageIcon(wGeneros.class.getResource("/xImagenes/barramenu.png")));
		lblBarra.setBounds(0, 0, 490, 75);
		contentPane.add(lblBarra);
		
		lblDavid = new JLabel("David Cholo");
		lblDavid.setForeground(new Color(255, 255, 255));
		lblDavid.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblDavid.setBounds(256, 123, 134, 29);
		contentPane.add(lblDavid);
		
		lblAmigos = new JLabel("50 amigos");
		lblAmigos.setForeground(new Color(255, 255, 255));
		lblAmigos.setFont(new Font("Calibri", Font.PLAIN, 13));
		lblAmigos.setBounds(287, 165, 67, 14);
		contentPane.add(lblAmigos);
		
		lblAlbum = new JLabel("4 \u00C1lbumes");
		lblAlbum.setForeground(new Color(255, 255, 255));
		lblAlbum.setFont(new Font("Calibri", Font.PLAIN, 13));
		lblAlbum.setBounds(287, 200, 67, 14);
		contentPane.add(lblAlbum);
		
		lblFavoritos = new JLabel("22 favoritos");
		lblFavoritos.setForeground(new Color(255, 255, 255));
		lblFavoritos.setFont(new Font("Calibri", Font.PLAIN, 13));
		lblFavoritos.setBounds(287, 237, 88, 14);
		contentPane.add(lblFavoritos);
		
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
		
		chckbxNewCheckBox = new JCheckBox("Amigos");
		chckbxNewCheckBox.setForeground(new Color(255, 255, 255));
		chckbxNewCheckBox.setBackground(new Color(51, 51, 102));
		chckbxNewCheckBox.setFont(new Font("Calibri", Font.PLAIN, 13));
		chckbxNewCheckBox.setBounds(257, 269, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		
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
