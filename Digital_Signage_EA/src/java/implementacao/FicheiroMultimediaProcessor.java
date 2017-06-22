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
public class FicheiroMultimediaProcessor {
	private int ID;
	
	private String URL;
	
	private String action="";
	
	public void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setURL(String value) {
		this.URL = value;
	}
	
	public String getURL() {
		return URL == null ? "" : URL;
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
				implementacao.FicheiroMultimedia _ficheiroMultimedia = implementacao.FicheiroMultimediaDAO.loadFicheiroMultimediaByORMID(getID());
				if (_ficheiroMultimedia!= null) {
					copyFromBean(_ficheiroMultimedia);
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
			try {
				implementacao.FicheiroMultimedia _ficheiroMultimedia = implementacao.FicheiroMultimediaDAO.createFicheiroMultimedia();
				copyToBean(_ficheiroMultimedia);
				if (implementacao.FicheiroMultimediaDAO.save(_ficheiroMultimedia)) {
					result = "Insert success";
				}
				else {
					result = "Insert failed";
				}
			}
			catch (Exception e) {
				result = "Insert error: " + e.toString();
			}
		}
		else if (action.equals("update")) {
			try {
				implementacao.FicheiroMultimedia _ficheiroMultimedia= implementacao.FicheiroMultimediaDAO.loadFicheiroMultimediaByORMID(getID());
				if (_ficheiroMultimedia != null) {
					copyToBean(_ficheiroMultimedia);
					if (implementacao.FicheiroMultimediaDAO.save(_ficheiroMultimedia)) {
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
				implementacao.FicheiroMultimedia _ficheiroMultimedia = implementacao.FicheiroMultimediaDAO.loadFicheiroMultimediaByORMID(getID());
				if (_ficheiroMultimedia != null && implementacao.FicheiroMultimediaDAO.delete(_ficheiroMultimedia)) {
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
	
	private void copyFromBean(implementacao.FicheiroMultimedia _ficheiroMultimedia) {
		setURL(_ficheiroMultimedia.getURL());
		setID(_ficheiroMultimedia.getORMID());
	}
	
	private void copyToBean(implementacao.FicheiroMultimedia _ficheiroMultimedia) {
		_ficheiroMultimedia.setURL(getURL());
	}
	
}

