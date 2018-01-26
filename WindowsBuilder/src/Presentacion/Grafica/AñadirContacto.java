package Presentacion.Grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.Box;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class AñadirContacto extends JFrame {

	private JPanel contentPane;
	private JTextField textField_Nombre;
	private JTextField textField_Telefono;
	private JTextField textField_Email;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AñadirContacto frame = new AñadirContacto();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public AñadirContacto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 220);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField_Nombre = new JTextField();
		textField_Nombre.setBounds(173, 11, 238, 20);
		contentPane.add(textField_Nombre);
		textField_Nombre.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(73, 13, 70, 14);
		contentPane.add(lblNewLabel);
		
		JLabel Telefono = new JLabel("Telefono");
		Telefono.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Telefono.setBounds(73, 68, 70, 14);
		contentPane.add(Telefono);
		
		JLabel Email = new JLabel("Email");
		Email.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Email.setBounds(73, 40, 70, 14);
		contentPane.add(Email);
		
		textField_Telefono = new JTextField();
		textField_Telefono.setColumns(10);
		textField_Telefono.setBounds(173, 68, 238, 20);
		contentPane.add(textField_Telefono);
		
		textField_Email = new JTextField();
		textField_Email.setColumns(10);
		textField_Email.setBounds(173, 42, 238, 20);
		contentPane.add(textField_Email);
		
		JButton btnAñadir = new JButton("A\u00F1adir");
		btnAñadir.setBounds(311, 124, 89, 23);
		contentPane.add(btnAñadir);
	}
}
