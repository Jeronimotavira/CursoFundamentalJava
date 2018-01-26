package Presentacion.adaptador;

import java.util.List;

import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;

import beans.Contacto;

public class AdaptadorCombo<contactos> implements ComboBoxModel<contactos> {
	
	List<Contacto> contactos;
	Contacto seleccion;
	public AdaptadorCombo(List<Contacto>contactos) {
		this.contactos=contactos;
	}

	@Override
	public void addListDataListener(ListDataListener arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public contactos getElementAt(int arg0) {
		return (contactos) contactos.get(arg0);
		
	}

	@Override
	public int getSize() {
		
		 return contactos.size();
	}

	@Override
	public void removeListDataListener(ListDataListener arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object getSelectedItem() {
		// TODO Auto-generated method stub
		return seleccion;
	}

	@Override
	public void setSelectedItem(Object arg0) {
		// TODO Auto-generated method stub
		
	}

}
