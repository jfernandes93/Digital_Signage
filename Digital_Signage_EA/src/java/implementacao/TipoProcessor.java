/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Universidade do Minho
 * License Type: Academic
 */
package implementacao;

import org.orm.PersistentException;
public class TipoProcessor {
	private int ID;
	
	private String action="";
	
	public void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				implementacao.Tipo _tipo = implementacao.TipoDAO.loadTipoByORMID(getID());
				if (_tipo!= null) {
					copyFromBean(_tipo);
					result = "Search success";
				}
				else {
					result = "Search failed";
				}
			}
			catch (PersistentException e) {
				result = "Search error: " + e.toString();
			}
		}
		else if(action.equals("insert"))  {
			result = "Insert failed : Cannot insert abstract class";
		}
		else if (action.equals("update")) {
			try {
				implementacao.Tipo _tipo= implementacao.TipoDAO.loadTipoByORMID(getID());
				if (_tipo != null) {
					copyToBean(_tipo);
					if (implementacao.TipoDAO.save(_tipo)) {
						result = "Update success";
					}
					 else {
						result = "Update failed";
					}
				}
				 else  {
					result = "Update failed";
				}
				
			}
			catch (PersistentException e) {
				result = "Update error: " + e.toString();
			}
		}
		else if (action.equals("delete")) {
			try {
				implementacao.Tipo _tipo = implementacao.TipoDAO.loadTipoByORMID(getID());
				if (_tipo != null && implementacao.TipoDAO.deleteAndDissociate(_tipo)) {
					result = "Delete success";
				}
				else {
					result = "Delete failed";
				}
			}
			catch (PersistentException e)  {
				result = "Delete error: " + e.toString();
			}
		}
		else if (action.equals("")) {
			result = "";
		}
		action = "";
		return result;
	}
	
	private void copyFromBean(implementacao.Tipo _tipo) {
		setID(_tipo.getORMID());
	}
	
	private void copyToBean(implementacao.Tipo _tipo) {
	}
	
}

