package Presentacion.Grafica;

import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import Presentacion.adaptador.Tabla;
import beans.Contacto;
import modelo.GestionContactos;

public class JvContactos extends JFrame {

	private JPanel contentPane;
	private JTable tbContactos;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JvContactos frame = new JvContactos();
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
	public JvContactos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 772, 498);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.setBounds(637, 409, 80, 23);
		contentPane.add(btnSalir);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(60, 60, 626, 271);
		contentPane.add(scrollPane);
		
		tbContactos = new JTable();
		scrollPane.setViewportView(tbContactos);
		//cargar el jtable
		GestionContactos agenda = new GestionContactos();
		List<Contacto> contactos=agenda.recuperarContactos();
		Tabla adp= new Tabla(contactos);
		
		tbContactos.setModel(adp);
		
		this.setVisible(true);
	}
}
