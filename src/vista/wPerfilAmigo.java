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
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JCheckBox;

public class wPerfilAmigo extends JFrame {

	private JPanel contentPane;
	private JLabel lblBarra;
	private JButton btnMenu;
	private JLabel lblFondoDegrade;
	private JLabel lblPerfilAmigos;
	private JButton btnRegresar;
	private JLabel lblFotoPerfil;
	private JLabel lblMafe;
	private JLabel lblAmigos;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JButton btnAmigos;
	private JButton btnAlbum;
	private JButton btnNewButton;
	private JTable table;
	private JCheckBox chckbxNewCheckBox;
	
	/**
	 * Create the frame.
	 */
	public wPerfilAmigo() {
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
		lblFotoPerfil.setIcon(new ImageIcon(wPerfilAmigo.class.getResource("/xImagenes/fotoamigo.png")));
		lblFotoPerfil.setBounds(61, 113, 150, 147);
		contentPane.add(lblFotoPerfil);
		
		lblBarra = new JLabel("New label");
		lblBarra.setIcon(new ImageIcon(wGeneros.class.getResource("/xImagenes/barramenu.png")));
		lblBarra.setBounds(0, 0, 490, 75);
		contentPane.add(lblBarra);
		
		lblMafe = new JLabel("Mafe Ascencio");
		lblMafe.setForeground(new Color(255, 255, 255));
		lblMafe.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblMafe.setBounds(256, 123, 134, 29);
		contentPane.add(lblMafe);
		
		lblAmigos = new JLabel("90 amigos");
		lblAmigos.setForeground(new Color(255, 255, 255));
		lblAmigos.setFont(new Font("Calibri", Font.PLAIN, 13));
		lblAmigos.setBounds(287, 165, 67, 14);
		contentPane.add(lblAmigos);
		
		lblNewLabel = new JLabel("2 \u00C1lbumes");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 13));
		lblNewLabel.setBounds(287, 200, 67, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("82 favoritos");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Calibri", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(287, 237, 88, 14);
		contentPane.add(lblNewLabel_1);
		
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
