package presentacion.graficos;

import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import beans.Contacto;
import modelo.GestionAgenda;
import presentacion.adaptadores.AdaptadorTabla;
import java.awt.event.ActionListener;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;

public class JVPedidos extends JFrame {

	private JPanel contentPane;
	private JTable tbContactos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JVPedidos frame = new JVPedidos();
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
	public JVPedidos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 564, 383);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JVPedidos.this.dispose();
			}
		});
		btnSalir.setBounds(393, 275, 112, 39);
		contentPane.add(btnSalir);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 82, 517, 182);
		contentPane.add(scrollPane);
		
		tbContactos = new JTable();
		scrollPane.setViewportView(tbContactos);
		
		JLabel lblListaDePedidos = new JLabel("LISTA DE PEDIDOS");
		lblListaDePedidos.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblListaDePedidos.setBounds(129, 32, 231, 39);
		contentPane.add(lblListaDePedidos);
		
		JButton btnNewPedido = new JButton("Nuevo Pedido");
		btnNewPedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JVNuevo jv=JVNuevo.getVentana();
			}
		});
		btnNewPedido.setBounds(370, 32, 112, 33);
		contentPane.add(btnNewPedido);
		
		//carga del JTable
	/*	GestionAgenda agenda=new GestionAgenda();
		List<Contacto> contactos=agenda.recuperarTodos();
		//creamos objeto adaptador
		AdaptadorTabla adp=new AdaptadorTabla(contactos);
		tbContactos.setModel(adp);*/
		
		this.setVisible(true);
	}
}
