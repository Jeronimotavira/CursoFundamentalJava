package presentacion.graficos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import javaBeans.Contacto;
import modelo.GestionAgenda;
import presentacion.adaptadores.AdaptadorTabla;

public class JVContactos extends JFrame {
	

	private JPanel contentPane;
	private JTable tbContactos;
	
	
	
	public JVContactos(String nam) {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JVContactos.this.dispose();
			}
		});
		btnSalir.setBounds(170, 227, 89, 23);
		contentPane.add(btnSalir);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 30, 414, 114);
		contentPane.add(scrollPane);
		
		tbContactos = new JTable();
		scrollPane.setViewportView(tbContactos);
		
		//carga del JTable
		
		GestionAgenda agenda=new GestionAgenda();
		List<Contacto> contactos= agenda.buscarContactos(nam);
		//creamos objeto adaptador
		AdaptadorTabla adp=new AdaptadorTabla(contactos);
		tbContactos.setModel(adp);
		
		this.setVisible(true);
	}
}
