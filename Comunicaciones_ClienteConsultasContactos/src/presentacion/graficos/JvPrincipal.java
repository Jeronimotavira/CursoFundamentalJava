package presentacion.graficos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JvPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldnombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JvPrincipal frame = new JvPrincipal();
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
	public JvPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 643, 261);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Titulo = new JLabel("AGANDA DE DATOS JSON");
		Titulo.setFont(new Font("Tahoma", Font.BOLD, 15));
		Titulo.setBounds(192, 33, 225, 33);
		contentPane.add(Titulo);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNombre.setBounds(62, 100, 67, 26);
		contentPane.add(lblNombre);
		
		textFieldnombre = new JTextField();
		textFieldnombre.setBounds(179, 99, 238, 33);
		contentPane.add(textFieldnombre);
		textFieldnombre.setColumns(10);
		
		JButton btnNewButton = new JButton("BUSCAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					JVContactos v=new JVContactos(textFieldnombre.getText());
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setBounds(452, 98, 101, 32);
		contentPane.add(btnNewButton);
	}
}
