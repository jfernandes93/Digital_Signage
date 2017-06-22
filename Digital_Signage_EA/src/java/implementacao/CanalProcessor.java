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
public class CanalProcessor {
	private int ID;
	
	private String Descricao;
	
	private String Nome;
	
	private String action="";
	
	public void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setDescricao(String value) {
		this.Descricao = value;
	}
	
	public String getDescricao() {
		return Descricao == null ? "" : Descricao;
	}
	
	public void setNome(String value) {
		this.Nome = value;
	}
	
	public String getNome() {
		return Nome == null ? "" : Nome;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	private int cliente_clienteID;
	
	public void setCliente_clienteID(int value) {
		this.cliente_clienteID = value;
	}
	
	public int getCliente_clienteID() {
		return cliente_clienteID;
	}
	
	private int _player_playerID;
	
	public void set_player_playerID(int value) {
		this._player_playerID = value;
	}
	
	public int get_player_playerID() {
		return _player_playerID;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				implementacao.Canal _canal = implementacao.CanalDAO.loadCanalByORMID(getID());
				if (_canal!= null) {
					copyFromBean(_canal);
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
				implementacao.Canal _canal = implementacao.CanalDAO.createCanal();
				copyToBean(_canal);
				if (implementacao.CanalDAO.save(_canal)) {
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
				implementacao.Canal _canal= implementacao.CanalDAO.loadCanalByORMID(getID());
				if (_canal != null) {
					copyToBean(_canal);
					if (implementacao.CanalDAO.save(_canal)) {
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
				implementacao.Canal _canal = implementacao.CanalDAO.loadCanalByORMID(getID());
				if (_canal != null && implementacao.CanalDAO.deleteAndDissociate(_canal)) {
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
	
	private void copyFromBean(implementacao.Canal _canal) {
		setDescricao(_canal.getDescricao());
		setNome(_canal.getNome());
		setID(_canal.getORMID());
		
		{
			implementacao.Cliente _cliente = _canal.getCliente();
			if (_cliente != null) {
				setCliente_clienteID(_cliente.getORMID());
			}
		}
		
		
		{
			implementacao.Player _player = _canal.get_player();
			if (_player != null) {
				set_player_playerID(_player.getORMID());
			}
		}
		
	}
	
	private void copyToBean(implementacao.Canal _canal) {
		_canal.setDescricao(getDescricao());
		_canal.setNome(getNome());
		try  {
			implementacao.Cliente _cliente = implementacao.ClienteDAO.loadClienteByORMID(getCliente_clienteID());
			_canal.setCliente(_cliente);
		}
		catch (PersistentException e) {
		}
		
		try  {
			implementacao.Player __player = implementacao.PlayerDAO.loadPlayerByORMID(get_player_playerID());
			_canal.set_player(__player);
		}
		catch (PersistentException e) {
		}
		
	}
	
}

