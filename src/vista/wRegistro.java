package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class wRegistro extends JFrame {

	private JPanel contentPane;
	private JLabel lblImgUsuario;
	private JLabel lblRegistrate;
	private JLabel lblUsuario;
	private JLabel lblEmail;
	private JLabel lblContrasea;
	private JLabel lblFondoColor;
	private JTextField textFieldUsuario;
	private JTextField textFieldEmail;
	private JTextField textField;
	private JButton btnNewButton;
	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	public wRegistro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 506, 769);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblImgUsuario = new JLabel("New label");
		lblImgUsuario.setIcon(new ImageIcon(wRegistro.class.getResource("/xImagenes/usuario.png")));
		lblImgUsuario.setBounds(202, 121, 81, 98);
		contentPane.add(lblImgUsuario);
		
		lblRegistrate = new JLabel("Reg\u00EDstrate");
		lblRegistrate.setForeground(new Color(255, 255, 255));
		lblRegistrate.setFont(new Font("Calibri", Font.PLAIN, 30));
		lblRegistrate.setBounds(182, 241, 132, 42);
		contentPane.add(lblRegistrate);
		
		lblUsuario = new JLabel("Usuario");
		lblUsuario.setForeground(new Color(255, 255, 255));
		lblUsuario.setFont(new Font("Calibri", Font.PLAIN, 21));
		lblUsuario.setBounds(133, 320, 81, 27);
		contentPane.add(lblUsuario);
		
		textFieldUsuario = new JTextField();
		textFieldUsuario.setBackground(new Color(153, 153, 204));
		textFieldUsuario.setBounds(108, 309, 270, 52);
		contentPane.add(textFieldUsuario);
		textFieldUsuario.setColumns(10);
		
		lblEmail = new JLabel("Email");
		lblEmail.setForeground(new Color(255, 255, 255));
		lblEmail.setFont(new Font("Calibri", Font.PLAIN, 21));
		lblEmail.setBounds(133, 423, 81, 27);
		contentPane.add(lblEmail);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setBackground(new Color(153, 153, 204));
		textFieldEmail.setBounds(108, 412, 270, 52);
		contentPane.add(textFieldEmail);
		textFieldEmail.setColumns(10);
		
		lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setForeground(new Color(255, 255, 255));
		lblContrasea.setFont(new Font("Calibri", Font.PLAIN, 21));
		lblContrasea.setBounds(133, 519, 110, 32);
		contentPane.add(lblContrasea);
		
		textField = new JTextField();
		textField.setBackground(new Color(153, 153, 204));
		textField.setBounds(108, 511, 270, 52);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnNewButton = new JButton("Iniciar Sesi\u00F3n");
		btnNewButton.setForeground(new Color(153, 153, 204));
		btnNewButton.setFont(new Font("Calibri", Font.PLAIN, 21));
		btnNewButton.setBounds(108, 620, 270, 52);
		contentPane.add(btnNewButton);
		
		lblFondoColor = new JLabel("");
		lblFondoColor.setIcon(new ImageIcon(wRegistro.class.getResource("/xImagenes/clarofondo.png")));
		lblFondoColor.setBackground(new Color(153, 153, 204));
		lblFondoColor.setBounds(0, 0, 490, 730);
		contentPane.add(lblFondoColor);
	}

}
