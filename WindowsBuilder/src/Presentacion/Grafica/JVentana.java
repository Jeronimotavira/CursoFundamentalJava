package Presentacion.Grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class JVentana extends JFrame {

	private JPanel contentPane;
	private JTextField n1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
		
		JButton botonSumar = new JButton("button");
		botonSumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botonSumar.setBackground(Color.ORANGE);
		botonSumar.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		botonSumar.setForeground(new Color(255, 0, 0));
		botonSumar.setBounds(30, 164, 117, 47);
		contentPane.add(botonSumar);
		
		n1 = new JTextField();
		n1.setBounds(30, 92, 86, 20);
		contentPane.add(n1);
		n1.setColumns(10);
	}
}
