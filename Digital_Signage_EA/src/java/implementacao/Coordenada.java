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

import java.io.Serializable;
public class Coordenada implements Serializable {
	public Coordenada() {
	}
	
	private int ID;
	
	private implementacao.Player _player;
	
	private double Latitude;
	
	private double Longitude;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
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
	
	public void set_player(implementacao.Player value) {
		if (this._player != value) {
			implementacao.Player l_player = this._player;
			this._player = value;
			if (value != null) {
				_player.set_coordenada(this);
			}
			if (l_player != null && l_player.get_coordenada() == this) {
				l_player.set_coordenada(null);
			}
		}
	}
	
	public implementacao.Player get_player() {
		return _player;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
