package presentacion.graficos;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ListCellRenderer;
import javax.swing.border.EmptyBorder;

import beans.Contacto;
import modelo.GestionAgenda;
import presentacion.adaptadores.AdaptadorCombo;

public class JVPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField tfBuscar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JVPrincipal frame = new JVPrincipal();
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
	public JVPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 337);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lblBuscar = new JLabel("New label");
		JButton btnNuevoContacto = new JButton("Nuevo contacto");
		btnNuevoContacto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JVNuevo jv=JVNuevo.getVentana();
				
			}
		});
		btnNuevoContacto.setBounds(50, 48, 129, 23);
		contentPane.add(btnNuevoContacto);
		
		JButton btnNewButton = new JButton("Buscar contacto");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GestionAgenda agenda=new GestionAgenda();
				Contacto c=agenda.buscar(tfBuscar.getText());
				if(c!=null) {
					lblBuscar.setText(c.getNombre()+"-"+c.getEmail()+"-"+c.getTelefono());
				}else {
					lblBuscar.setText("No existe ese contacto");
				}
			}
		});
		btnNewButton.setBounds(50, 136, 129, 23);
		contentPane.add(btnNewButton);
		
		tfBuscar = new JTextField();
		tfBuscar.setBounds(212, 137, 129, 20);
		contentPane.add(tfBuscar);
		tfBuscar.setColumns(10);
		
		
		lblBuscar.setBounds(50, 196, 329, 14);
		contentPane.add(lblBuscar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//JVPrincipal.this.dispose();
				System.exit(0); //finaliza Java
			}
		});
		btnSalir.setBounds(240, 249, 89, 23);
		contentPane.add(btnSalir);
		
		JButton btnVerContactos = new JButton("Ver contactos");
		btnVerContactos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JVContactos v=new JVContactos();
			}
		});
		btnVerContactos.setBounds(50, 249, 112, 23);
		contentPane.add(btnVerContactos);
		
		JComboBox cbContactos = new JComboBox();
		cbContactos.setBounds(278, 48, 120, 22);
		// para cambiar en la capa presentacion el estilo de un JComboBox. 
		cbContactos.setRenderer(new ListCellRenderer<Contacto>(){
				
		@Override
		public Component getListCellRendererComponent(JList<? extends Contacto> arg0, Contacto arg1, int arg2,
				boolean arg3, boolean arg4) {
			JLabel lb= new JLabel();
			if(arg1!=null) {
			lb.setText(arg1.getEmail() );
			}
			return lb;
		}
		
		});	
		
		
		//programar evento de cargar la lista cuando se haga foco. 
		cbContactos.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void focusGained(FocusEvent arg0) {
				// y aqui lo cargamos todo. 
				//carga del combo
				GestionAgenda agenda=new GestionAgenda();
				AdaptadorCombo<Contacto> adp=new AdaptadorCombo<>(agenda.recuperarTodos());
				cbContactos.setModel(adp);
				
				
			}
		});
		contentPane.add(cbContactos);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Contacto c=(Contacto)cbContactos.getSelectedItem();
				GestionAgenda agenda=new GestionAgenda();
				agenda.eliminar(c.getEmail());
			}
		});
		btnEliminar.setBounds(281, 11, 89, 23);
		contentPane.add(btnEliminar);
		
		
		
	}
}
