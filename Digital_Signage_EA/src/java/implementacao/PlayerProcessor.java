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
public class PlayerProcessor {
	private int ID;
	
	private String Nome;
	
	private String Descricao;
	
	private double Tamanho;
	
	private String Estado;
	
	private String action="";
	
	public void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setNome(String value) {
		this.Nome = value;
	}
	
	public String getNome() {
		return Nome == null ? "" : Nome;
	}
	
	public void setDescricao(String value) {
		this.Descricao = value;
	}
	
	public String getDescricao() {
		return Descricao == null ? "" : Descricao;
	}
	
	public void setTamanho(double value) {
		this.Tamanho = value;
	}
	
	public double getTamanho() {
		return Tamanho;
	}
	
	public void setEstado(String value) {
		this.Estado = value;
	}
	
	public String getEstado() {
		return Estado == null ? "" : Estado;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	private int _rede_redeID;
	
	public void set_rede_redeID(int value) {
		this._rede_redeID = value;
	}
	
	public int get_rede_redeID() {
		return _rede_redeID;
	}
	
	private int _canal_canalID;
	
	public void set_canal_canalID(int value) {
		this._canal_canalID = value;
	}
	
	public int get_canal_canalID() {
		return _canal_canalID;
	}
	
	private int _coordenada_coordenadaID;
	
	public void set_coordenada_coordenadaID(int value) {
		this._coordenada_coordenadaID = value;
	}
	
	public int get_coordenada_coordenadaID() {
		return _coordenada_coordenadaID;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				implementacao.Player _player = implementacao.PlayerDAO.loadPlayerByORMID(getID());
				if (_player!= null) {
					copyFromBean(_player);
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
				implementacao.Player _player = implementacao.PlayerDAO.createPlayer();
				copyToBean(_player);
				if (implementacao.PlayerDAO.save(_player)) {
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
				implementacao.Player _player= implementacao.PlayerDAO.loadPlayerByORMID(getID());
				if (_player != null) {
					copyToBean(_player);
					if (implementacao.PlayerDAO.save(_player)) {
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
				implementacao.Player _player = implementacao.PlayerDAO.loadPlayerByORMID(getID());
				if (_player != null && implementacao.PlayerDAO.deleteAndDissociate(_player)) {
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
	
	private void copyFromBean(implementacao.Player _player) {
		setNome(_player.getNome());
		setDescricao(_player.getDescricao());
		setTamanho(_player.getTamanho());
		setEstado(_player.getEstado());
		setID(_player.getORMID());
		
		{
			implementacao.Rede _rede = _player.get_rede();
			if (_rede != null) {
				set_rede_redeID(_rede.getORMID());
			}
		}
		
		
		{
			implementacao.Canal _canal = _player.get_canal();
			if (_canal != null) {
				set_canal_canalID(_canal.getORMID());
			}
		}
		
		
		{
			implementacao.Coordenada _coordenada = _player.get_coordenada();
			if (_coordenada != null) {
				set_coordenada_coordenadaID(_coordenada.getORMID());
			}
		}
		
	}
	
	private void copyToBean(implementacao.Player _player) {
		_player.setNome(getNome());
		_player.setDescricao(getDescricao());
		_player.setTamanho(getTamanho());
		_player.setEstado(getEstado());
		try  {
			implementacao.Rede __rede = implementacao.RedeDAO.loadRedeByORMID(get_rede_redeID());
			_player.set_rede(__rede);
		}
		catch (PersistentException e) {
		}
		
		try  {
			implementacao.Canal __canal = implementacao.CanalDAO.loadCanalByORMID(get_canal_canalID());
			_player.set_canal(__canal);
		}
		catch (PersistentException e) {
		}
		
		try  {
			implementacao.Coordenada __coordenada = implementacao.CoordenadaDAO.loadCoordenadaByORMID(get_coordenada_coordenadaID());
			_player.set_coordenada(__coordenada);
		}
		catch (PersistentException e) {
		}
		
	}
	
}

