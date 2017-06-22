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
public class ConteudoProcessor {
	private int ID;
	
	private java.sql.Time Duracao;
	
	private int Reproducoes;
	
	private String action="";
	
	public void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setDuracao(java.sql.Time value) {
		this.Duracao = value;
	}
	
	public java.sql.Time getDuracao() {
		return Duracao;
	}
	
	public void setReproducoes(int value) {
		this.Reproducoes = value;
	}
	
	public int getReproducoes() {
		return Reproducoes;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	private int _canal_canalID;
	
	public void set_canal_canalID(int value) {
		this._canal_canalID = value;
	}
	
	public int get_canal_canalID() {
		return _canal_canalID;
	}
	
	private int _conteudo_tipoID;
	
	public void set_conteudo_tipoID(int value) {
		this._conteudo_tipoID = value;
	}
	
	public int get_conteudo_tipoID() {
		return _conteudo_tipoID;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				implementacao.Conteudo _conteudo = implementacao.ConteudoDAO.loadConteudoByORMID(getID());
				if (_conteudo!= null) {
					copyFromBean(_conteudo);
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
				implementacao.Conteudo _conteudo = implementacao.ConteudoDAO.createConteudo();
				copyToBean(_conteudo);
				if (implementacao.ConteudoDAO.save(_conteudo)) {
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
				implementacao.Conteudo _conteudo= implementacao.ConteudoDAO.loadConteudoByORMID(getID());
				if (_conteudo != null) {
					copyToBean(_conteudo);
					if (implementacao.ConteudoDAO.save(_conteudo)) {
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
				implementacao.Conteudo _conteudo = implementacao.ConteudoDAO.loadConteudoByORMID(getID());
				if (_conteudo != null && implementacao.ConteudoDAO.deleteAndDissociate(_conteudo)) {
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
	
	private void copyFromBean(implementacao.Conteudo _conteudo) {
		setDuracao(_conteudo.getDuracao());
		setReproducoes(_conteudo.getReproducoes());
		setID(_conteudo.getORMID());
		
		{
			implementacao.Canal _canal = _conteudo.get_canal();
			if (_canal != null) {
				set_canal_canalID(_canal.getORMID());
			}
		}
		
		
		{
			implementacao.Tipo _tipo = _conteudo.get_conteudo();
			if (_tipo != null) {
				set_conteudo_tipoID(_tipo.getORMID());
			}
		}
		
	}
	
	private void copyToBean(implementacao.Conteudo _conteudo) {
		_conteudo.setDuracao(getDuracao());
		_conteudo.setReproducoes(getReproducoes());
		try  {
			implementacao.Canal __canal = implementacao.CanalDAO.loadCanalByORMID(get_canal_canalID());
			_conteudo.set_canal(__canal);
		}
		catch (PersistentException e) {
		}
		
		try  {
			implementacao.Tipo __conteudo = implementacao.TipoDAO.loadTipoByORMID(get_conteudo_tipoID());
			_conteudo.set_conteudo(__conteudo);
		}
		catch (PersistentException e) {
		}
		
	}
	
}

