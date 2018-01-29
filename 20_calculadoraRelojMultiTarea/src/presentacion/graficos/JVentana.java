package presentacion.graficos;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JVentana extends JFrame implements Runnable {
public JVentana() {
	
		//definición de título para la ventana
		super("Primera ventana");
		//comportamiento de botón de cierre
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//posicionamiento y tamaño
		this.setBounds(100, 100, 800, 400);
		//realizamos creación y colocación de
		//componentes gráficos
		iniciarComponentes();
		//visibilidad
		this.setVisible(true);
		
	}
	private void iniciarComponentes() {
		//Anular gestor de organización
		Timer temp = new Timer();
		getContentPane().setLayout(null);
		//Creación del objeto
		JTextField tf1=new JTextField();
		JTextField tf2=new JTextField();
		JButton bt1=new JButton("Sumar");
		JButton bt2=new JButton("Multiplicar");
		JLabel lb=new JLabel("Resultado");
		//posicionamiento del objeto
		tf1.setBounds(50, 30, 151, 40);
		tf2.setBounds(50, 80, 151, 40);
		bt1.setBounds(31, 140, 120, 40);
		bt2.setBounds(176, 140, 120, 40);
		lb.setBounds(150,200,100,40);
		//añadir control a la ventana
		getContentPane().add(tf1);getContentPane().add(tf2);
		getContentPane().add(bt1);getContentPane().add(bt2);
		getContentPane().add(lb);
		
		JLabel RelojLabel = new JLabel("Hora");
		RelojLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		RelojLabel.setBounds(476, 43, 151, 40);
		getContentPane().add(RelojLabel);
		
this.addWindowListener(new WindowListener() {
			
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
				// cerrar tambien el timer
				temp.cancel();
				
			}
			
			@Override
			public void windowActivated(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		// ************* ABAJO ESTE EJERCICIO PERO CON LA CLASE TIMER (TEMPORIZADOR) **************************
	/*	Runnable r1=()->{ while(true) {
		LocalTime lt = LocalTime.now();
		RelojLabel.setText(lt.toString());
		
		try {Thread.sleep(500);}catch(Exception s) {
			s.printStackTrace();
		}
		}
		};*/
		
      /// ***************** Timer temp = new Timer();
		temp.schedule(new TimerTask() {
			
			@Override
			public void run() {
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
				String lt = LocalTime.now().format(dtf);
				RelojLabel.setText(lt.toString());	
				
			}
		}, 0,300);
		
		
		ActionListener lst1=e->{
			int n1=Integer.parseInt(tf1.getText());
			int n2=Integer.parseInt(tf2.getText());
			lb.setText(""+(n1+n2));
		};
		ActionListener lst2=e->{
			int n1=Integer.parseInt(tf1.getText());
			int n2=Integer.parseInt(tf2.getText());
			lb.setText(""+(n1*n2));
		};
		bt1.addActionListener(lst1);
		bt2.addActionListener(lst2);
	}
	
	
	
	@Override
	public void run() {
		
		
	}
	

}
