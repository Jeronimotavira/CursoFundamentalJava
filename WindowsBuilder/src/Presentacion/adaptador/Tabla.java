package Presentacion.adaptador;

import java.lang.reflect.Field;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import beans.Contacto;

public class Tabla extends AbstractTableModel {

	List<Contacto> contactos;
	public Tabla(List<Contacto>contactos) {
		this.contactos=contactos;
	}
	@Override
	public int getColumnCount() {
		
		Field[]tamano; 
		tamano = Contacto.class.getFields();
		int total = tamano.length;
		
		return total;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return contactos.size();
	}

	@Override
	public Object getValueAt(int fila, int col) {
		String valor="";
		switch(col){
		case 0:
			valor=contactos.get(fila).getNombre();
		case 1:
			valor=contactos.get(fila).getEmail();
		case 2:
			valor=String.valueOf(contactos.get(fila).getTelefono());
		}
		
		return valor;
	}

	@Override
	public String getColumnName(int arg0) {
		
		String nombre ="";
		switch(arg0) {
		case 0:
			nombre="Nombre";
		case 1:
			nombre="Email";
		case 2:
			nombre="telefono";
		}
		return nombre;
	}

}
