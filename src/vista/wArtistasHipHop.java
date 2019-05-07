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
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class wArtistasHipHop extends JFrame {

	private JPanel contentPane;

	private JLabel lblBarra;
	private JButton btnMenu;
	private JLabel lblFondoDegrade;
	private JLabel lblHipHop;
	private JLabel lblArtistas;
	private JButton btnRegresar;
	private JTable table;
	

	/**
	 * Create the frame.
	 */
	public wArtistasHipHop() {
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
			},
			new String[] {
				"#", "Nombre", "Duraci\u00F3n"
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
		
		lblHipHop = new JLabel("Hip Hop");
		lblHipHop.setHorizontalAlignment(SwingConstants.LEFT);
		lblHipHop.setForeground(new Color(255, 255, 255));
		lblHipHop.setFont(new Font("Calibri", Font.PLAIN, 29));
		lblHipHop.setBounds(286, 20, 110, 29);
		contentPane.add(lblHipHop);
		
		lblBarra = new JLabel("New label");
		lblBarra.setIcon(new ImageIcon(wGeneros.class.getResource("/xImagenes/barramenu.png")));
		lblBarra.setBounds(0, 0, 490, 75);
		contentPane.add(lblBarra);
		
		lblArtistas = new JLabel("Artistas");
		lblArtistas.setForeground(Color.WHITE);
		lblArtistas.setFont(new Font("Calibri", Font.PLAIN, 21));
		lblArtistas.setBounds(53, 130, 72, 29);
		contentPane.add(lblArtistas);
		
		lblFondoDegrade = new JLabel("New label");
		lblFondoDegrade.setIcon(new ImageIcon(wPerfil.class.getResource("/xImagenes/degrade.png")));
		lblFondoDegrade.setBounds(0, 0, 490, 730);
		contentPane.add(lblFondoDegrade);
	}

}
