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

public class wLogo extends JFrame {

	private JPanel contentPane;
	private JLabel lblLogoClarPad;
	private JLabel lblFondo;

	

	/**
	 * Create the frame.
	 */
	public wLogo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 506, 709);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblLogoClarPad = new JLabel("New label");
		lblLogoClarPad.setIcon(new ImageIcon(wLogo.class.getResource("/xImagenes/logo.png")));
		lblLogoClarPad.setBounds(67, 75, 369, 379);
		contentPane.add(lblLogoClarPad);
		
		lblFondo = new JLabel("New label");
		lblFondo.setLabelFor(lblLogoClarPad);
		lblFondo.setIcon(new ImageIcon(wLogo.class.getResource("/xImagenes/presen.png")));
		lblFondo.setBounds(0, 0, 490, 670);
		contentPane.add(lblFondo);
	}
}
