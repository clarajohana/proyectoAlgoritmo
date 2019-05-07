package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.AbstractListModel;

public class wGeneros extends JFrame {

	private JPanel contentPane;
	private JLabel lblLogoLetras;
	private JLabel lblBarra;
	private JLabel lblFondoDegrade;
	private JButton btnMenu;
	private JButton btnBuscar;

	
	/**
	 * Create the frame.
	 */
	@SuppressWarnings("unchecked")
	public wGeneros() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 506, 769);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnMenu = new JButton("");
		btnMenu.setIcon(new ImageIcon(wGeneros.class.getResource("/xImagenes/menu.png")));
		btnMenu.setBounds(10, 25, 67, 43);
		contentPane.add(btnMenu);
		
		JList list = new JList();
		list.setBounds(71, 121, 345, 178);
		contentPane.add(list);
		
		btnBuscar = new JButton("");
		btnBuscar.setIcon(new ImageIcon(wGeneros.class.getResource("/xImagenes/buscar.png")));
		btnBuscar.setBounds(402, 25, 67, 40);
		contentPane.add(btnBuscar);
		
		lblLogoLetras = new JLabel("New label");
		lblLogoLetras.setIcon(new ImageIcon(wGeneros.class.getResource("/xImagenes/letraslogo.png")));
		lblLogoLetras.setBounds(87, 11, 119, 57);
		contentPane.add(lblLogoLetras);
		
		lblBarra = new JLabel("New label");
		lblBarra.setIcon(new ImageIcon(wGeneros.class.getResource("/xImagenes/barramenu.png")));
		lblBarra.setBounds(0, 0, 490, 75);
		contentPane.add(lblBarra);
		
		lblFondoDegrade = new JLabel("New label");
		lblFondoDegrade.setIcon(new ImageIcon(wGeneros.class.getResource("/xImagenes/degrade.png")));
		lblFondoDegrade.setBounds(0, 0, 490, 730);
		contentPane.add(lblFondoDegrade);
	}
}
