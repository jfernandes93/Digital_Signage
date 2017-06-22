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
public class CoordenadaProcessor {
	private int ID;
	
	private double Latitude;
	
	private double Longitude;
	
	private String action="";
	
	public void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setLatitude(double value) {
		this.Latitude = value;
	}
	
	public double getLatitude() {
		return Latitude;
	}
	
	public void setLongitude(double value) {
		this.Longitude = value;
	}
	
	public double getLongitude() {
		return Longitude;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
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
				implementacao.Coordenada _coordenada = implementacao.CoordenadaDAO.loadCoordenadaByORMID(getID());
				if (_coordenada!= null) {
					copyFromBean(_coordenada);
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
				implementacao.Coordenada _coordenada = implementacao.CoordenadaDAO.createCoordenada();
				copyToBean(_coordenada);
				if (implementacao.CoordenadaDAO.save(_coordenada)) {
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
				implementacao.Coordenada _coordenada= implementacao.CoordenadaDAO.loadCoordenadaByORMID(getID());
				if (_coordenada != null) {
					copyToBean(_coordenada);
					if (implementacao.CoordenadaDAO.save(_coordenada)) {
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
				implementacao.Coordenada _coordenada = implementacao.CoordenadaDAO.loadCoordenadaByORMID(getID());
				if (_coordenada != null && implementacao.CoordenadaDAO.deleteAndDissociate(_coordenada)) {
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
	
	private void copyFromBean(implementacao.Coordenada _coordenada) {
		setLatitude(_coordenada.getLatitude());
		setLongitude(_coordenada.getLongitude());
		setID(_coordenada.getORMID());
		
		{
			implementacao.Player _player = _coordenada.get_player();
			if (_player != null) {
				set_player_playerID(_player.getORMID());
			}
		}
		
	}
	
	private void copyToBean(implementacao.Coordenada _coordenada) {
		_coordenada.setLatitude(getLatitude());
		_coordenada.setLongitude(getLongitude());
		try  {
			implementacao.Player __player = implementacao.PlayerDAO.loadPlayerByORMID(get_player_playerID());
			_coordenada.set_player(__player);
		}
		catch (PersistentException e) {
		}
		
	}
	
}

