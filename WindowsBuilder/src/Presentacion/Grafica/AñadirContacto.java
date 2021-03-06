package Presentacion.Grafica;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class AñadirContacto extends JFrame {

	private JPanel contentPane;
	private JTextField textField_Nombre;
	private JTextField textField_Telefono;
	private JTextField textField_Email;
	private static AñadirContacto obj;
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
	private AñadirContacto() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
		btnAñadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAñadir.setBounds(311, 124, 89, 23);
		contentPane.add(btnAñadir);
		
		WindowListener lstVentana = new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowIconified(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosed(WindowEvent arg0) {
				obj=null;
				
			}
			
			@Override
			public void windowActivated(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		};
		
		this.setVisible(true);
		this.addWindowListener(lstVentana);
	}
	
	public static AñadirContacto crearventana() {
		if(obj==null) {
			obj= new AñadirContacto();
		}
		
		return obj;
	}
	
}

