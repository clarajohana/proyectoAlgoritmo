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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class wAmigos extends JFrame {

	private JPanel contentPane;
	private JLabel lblFondoDegrade;
	private JButton btnRegresar;
	private JButton btnMenu;
	private JLabel lblAmigos;
	private JLabel lblBarra;
	private JTable table;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	public wAmigos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 506, 769);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"#", "Nombre", "Hora"
			}
		));
		table.getColumnModel().getColumn(2).setPreferredWidth(82);
		table.getColumnModel().getColumn(2).setMinWidth(27);
		table.getColumnModel().getColumn(2).setMaxWidth(100);
		table.setBounds(68, 141, 352, 512);
		contentPane.add(table);
		
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
		
		lblAmigos = new JLabel("Amigos");
		lblAmigos.setForeground(new Color(255, 255, 255));
		lblAmigos.setFont(new Font("Calibri", Font.PLAIN, 29));
		lblAmigos.setBounds(300, 20, 107, 29);
		contentPane.add(lblAmigos);
		
		lblBarra = new JLabel("New label");
		lblBarra.setIcon(new ImageIcon(wGeneros.class.getResource("/xImagenes/barramenu.png")));
		lblBarra.setBounds(5, 0, 485, 75);
		contentPane.add(lblBarra);
		
		lblFondoDegrade = new JLabel("New label");
		lblFondoDegrade.setForeground(new Color(255, 255, 255));
		lblFondoDegrade.setIcon(new ImageIcon(wPerfil.class.getResource("/xImagenes/degrade.png")));
		lblFondoDegrade.setBounds(5, 0, 485, 720);
		contentPane.add(lblFondoDegrade);
	}

}
