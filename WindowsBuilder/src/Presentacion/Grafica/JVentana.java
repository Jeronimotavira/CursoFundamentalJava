package Presentacion.Grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import beans.Contacto;
import modelo.GestionContactos;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class JVentana extends JFrame {

	private JPanel contentPane;
	private JTextField textBuscar;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JVentana frame = new JVentana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JVentana() {
		
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 918, 535);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton botonañadir = new JButton("A\u00F1adir Contacto");
		botonañadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AñadirContacto.crearventana();
				
				
				
			}
		});
		botonañadir.setBackground(Color.ORANGE);
		botonañadir.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		botonañadir.setForeground(new Color(255, 0, 0));
		botonañadir.setBounds(637, 61, 169, 47);
		contentPane.add(botonañadir);
		JLabel Resultado = new JLabel("RESULTADO....");
		Resultado.setBounds(74, 285, 123, 24);
		contentPane.add(Resultado);
		
		JButton BuscarContacto = new JButton("BuscarContacto");
		BuscarContacto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				GestionContactos agenda=new GestionContactos();
				Contacto c=agenda.buscarContacto(textBuscar.getText());
				if(c!=null) {
					Resultado.setText(c.getNombre()+"-"+c.getEmail()+"-"+c.getTelefono());
				}else {
					Resultado.setText("No existe ese contacto");
				}
					
				/*GestionContactos gcontactos=new GestionContactos();
		        Scanner sc=new Scanner(System.in);
		        String nombre,email;
		        int telefono;
				if(gcontactos.agregarContacto(email, nombre,telefono)) {
             	   System.out.println("Contacto añadido");
                }else {
             	   System.out.println("Email repetido, no se ha podido añadir");
                }*/
			
				
		}});
		BuscarContacto.setBounds(62, 199, 169, 47);
		contentPane.add(BuscarContacto);
		
		JLabel lblNewLabel = new JLabel("GESTION DE CONTACTOS SWING");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(136, 54, 359, 58);
		contentPane.add(lblNewLabel);
		
		textBuscar = new JTextField();
		textBuscar.setFont(new Font("Tahoma", Font.BOLD, 14));
		textBuscar.setBounds(272, 197, 339, 47);
		contentPane.add(textBuscar);
		textBuscar.setColumns(10);
		
		
		
		JButton btnSalir = new JButton("salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);//finaliza la instancia de java 
			}
		});
		btnSalir.setBounds(687, 436, 105, 37);
		contentPane.add(btnSalir);
		
		JButton btnTodosContactos = new JButton("VER CONTACTOS");
		btnTodosContactos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JvContactos Vc = new JvContactos();
			}
		});
		btnTodosContactos.setBounds(84, 441, 212, 32);
		contentPane.add(btnTodosContactos);
		this.setVisible(true);
	}
}
