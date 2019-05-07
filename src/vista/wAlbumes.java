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
import javax.swing.JProgressBar;

public class wAlbumes extends JFrame {

	private JPanel contentPane;

	private JLabel lblBarra;
	private JButton btnMenu;
	private JLabel lblFondoDegrade;
	private JLabel lblAlbum;
	private JLabel lblDj;
	private JButton btnRegresar;
	private JTable table;
	private JLabel lblLight;
	private JLabel lblImgAlbum;
	private JProgressBar progressBar; 

	/**
	 * Create the frame.
	 */
	public wAlbumes() {
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
			},
			new String[] {
				"#", "Nombre", "Duraci\u00F3n", "Favoritos"
			}
		));
		table.setBounds(67, 415, 352, 116);
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
		
		lblAlbum = new JLabel("\u00C1lbum");
		lblAlbum.setForeground(new Color(255, 255, 255));
		lblAlbum.setFont(new Font("Calibri", Font.PLAIN, 29));
		lblAlbum.setBounds(313, 20, 81, 29);
		contentPane.add(lblAlbum);
		
		lblBarra = new JLabel("New label");
		lblBarra.setIcon(new ImageIcon(wGeneros.class.getResource("/xImagenes/barramenu.png")));
		lblBarra.setBounds(0, 0, 490, 75);
		contentPane.add(lblBarra);
		
		lblDj = new JLabel(" Dj Max");
		lblDj.setForeground(Color.WHITE);
		lblDj.setFont(new Font("Calibri", Font.PLAIN, 21));
		lblDj.setBounds(66, 347, 72, 29);
		contentPane.add(lblDj);
		
		lblLight = new JLabel("light");
		lblLight.setFont(new Font("Calibri", Font.PLAIN, 19));
		lblLight.setForeground(Color.WHITE);
		lblLight.setBounds(73, 375, 54, 29);
		contentPane.add(lblLight);
		
		progressBar = new JProgressBar();
		progressBar.setBounds(429, 415, 15, 176);
		contentPane.add(progressBar);
		
		lblImgAlbum = new JLabel("New label");
		lblImgAlbum.setIcon(new ImageIcon(wAlbumes.class.getResource("/xImagenes/Albumes/albumdj.png")));
		lblImgAlbum.setBounds(67, 107, 391, 236);
		contentPane.add(lblImgAlbum);
		
		lblFondoDegrade = new JLabel("New label");
		lblFondoDegrade.setIcon(new ImageIcon(wPerfil.class.getResource("/xImagenes/degrade.png")));
		lblFondoDegrade.setBounds(0, 0, 490, 730);
		contentPane.add(lblFondoDegrade);
		
		
	}
}
