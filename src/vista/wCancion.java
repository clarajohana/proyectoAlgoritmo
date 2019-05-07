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

public class wCancion extends JFrame {

	private JPanel contentPane;
	private JLabel lblBarra;
	private JButton btnMenu;
	private JLabel lblFondoDegrade;
	private JButton btnRegresar;
	private JLabel lblCancion;
	

	/**
	 * Create the frame.
	 */
	public wCancion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 506, 769);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		
		lblCancion = new JLabel("Canci\u00F3n");
		lblCancion.setForeground(new Color(255, 255, 255));
		lblCancion.setFont(new Font("Calibri", Font.PLAIN, 29));
		lblCancion.setBounds(284, 20, 110, 29);
		contentPane.add(lblCancion);
		
		lblBarra = new JLabel("New label");
		lblBarra.setIcon(new ImageIcon(wGeneros.class.getResource("/xImagenes/barramenu.png")));
		lblBarra.setBounds(0, 0, 490, 75);
		contentPane.add(lblBarra);
		
		lblFondoDegrade = new JLabel("New label");
		lblFondoDegrade.setIcon(new ImageIcon(wPerfil.class.getResource("/xImagenes/degrade.png")));
		lblFondoDegrade.setBounds(0, 0, 490, 730);
		contentPane.add(lblFondoDegrade);
		
	}

}
