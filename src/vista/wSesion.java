package vista;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class wSesion extends JFrame {
	private JPanel contentPane;
	private JLabel lblImgAudi;
	private JLabel lblFondoColor;
	private JLabel lblUsario;
	private JLabel lblTextoContra;
	private JLabel lblRegistrate;
	private JTextField txtBienvenidoAClarpad;
	private JTextField textLlenarDatosU;
	private JTextField textFieldContra;
    private JButton btnInicio;


	/**
	 * Create the frame.
	 */
	public wSesion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 506, 769);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblImgAudi = new JLabel("New label");
		lblImgAudi.setIcon(new ImageIcon(wSesion.class.getResource("/xImagenes/audifonos.png")));
		lblImgAudi.setBounds(103, 48, 286, 251);
		contentPane.add(lblImgAudi);
		
		txtBienvenidoAClarpad = new JTextField();
		txtBienvenidoAClarpad.setForeground(new Color(255, 255, 255));
		txtBienvenidoAClarpad.setBackground(new Color(153, 153, 204));
		txtBienvenidoAClarpad.setFont(new Font("Calibri", Font.PLAIN, 30));
		txtBienvenidoAClarpad.setText("Bienvenido a ClarPad");
		txtBienvenidoAClarpad.setBounds(128, 304, 308, 70);
		contentPane.add(txtBienvenidoAClarpad);
		txtBienvenidoAClarpad.setColumns(10);
		
		lblUsario = new JLabel("Usuario");
		lblUsario.setForeground(new Color(255, 255, 255));
		lblUsario.setFont(new Font("Calibri", Font.PLAIN, 21));
		lblUsario.setBackground(new Color(153, 153, 204));
		lblUsario.setBounds(117, 401, 138, 37);
		contentPane.add(lblUsario);
		
		btnInicio = new JButton("Iniciar Sesi\u00F3n");
		btnInicio.setForeground(new Color(153, 153, 204));
		btnInicio.setFont(new Font("Calibri", Font.PLAIN, 21));
		btnInicio.setBounds(113, 573, 308, 61);
		contentPane.add(btnInicio);
		
		textLlenarDatosU = new JTextField();
		textLlenarDatosU.setBackground(new Color(153, 153, 204));
		textLlenarDatosU.setBounds(112, 387, 309, 61);
		contentPane.add(textLlenarDatosU);
		textLlenarDatosU.setColumns(10);
		
		lblTextoContra = new JLabel("Contrase\u00F1a");
		lblTextoContra.setForeground(new Color(255, 255, 255));
		lblTextoContra.setBackground(new Color(153, 153, 204));
		lblTextoContra.setFont(new Font("Calibri", Font.PLAIN, 21));
		lblTextoContra.setBounds(120, 484, 188, 37);
		contentPane.add(lblTextoContra);
		
		textFieldContra = new JTextField();
		textFieldContra.setBackground(new Color(153, 153, 204));
		textFieldContra.setBounds(113, 474, 308, 61);
		contentPane.add(textFieldContra);
		textFieldContra.setColumns(10);
		
		lblRegistrate = new JLabel("Registrate");
		lblRegistrate.setForeground(new Color(255, 255, 255));
		lblRegistrate.setFont(new Font("Calibri", Font.PLAIN, 21));
		lblRegistrate.setBounds(212, 660, 115, 27);
		contentPane.add(lblRegistrate);
		
		lblFondoColor = new JLabel("New label");
		lblFondoColor.setBackground(new Color(153, 153, 204));
		lblFondoColor.setIcon(new ImageIcon(wSesion.class.getResource("/xImagenes/clarofondo.png")));
		lblFondoColor.setBounds(0, 0, 490, 730);
		contentPane.add(lblFondoColor);
	}
}
