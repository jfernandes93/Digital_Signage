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
public class Player implements Serializable {
	public Player() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == implementacao.ORMConstants.KEY_PLAYER__REDE) {
			this._rede = (implementacao.Rede) owner;
		}
		
		else if (key == implementacao.ORMConstants.KEY_PLAYER__CANAL) {
			this._canal = (implementacao.Canal) owner;
		}
		
		else if (key == implementacao.ORMConstants.KEY_PLAYER__COORDENADA) {
			this._coordenada = (implementacao.Coordenada) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int ID;
	
	private implementacao.Canal _canal;
	
	private implementacao.Rede _rede;
	
	private String Nome;
	
	private String Descricao;
	
	private double Tamanho;
	
	private String Estado;
	
	private implementacao.Coordenada _coordenada;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setNome(String value) {
		this.Nome = value;
	}
	
	public String getNome() {
		return Nome;
	}
	
	public void setDescricao(String value) {
		this.Descricao = value;
	}
	
	public String getDescricao() {
		return Descricao;
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
		return Estado;
	}
	
	public void set_rede(implementacao.Rede value) {
		if (_rede != null) {
			_rede._player.remove(this);
		}
		if (value != null) {
			value._player.add(this);
		}
	}
	
	public implementacao.Rede get_rede() {
		return _rede;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM__rede(implementacao.Rede value) {
		this._rede = value;
	}
	
	private implementacao.Rede getORM__rede() {
		return _rede;
	}
	
	public void set_canal(implementacao.Canal value) {
		if (this._canal != value) {
			implementacao.Canal l_canal = this._canal;
			this._canal = value;
			if (value != null) {
				_canal.set_player(this);
			}
			if (l_canal != null && l_canal.get_player() == this) {
				l_canal.set_player(null);
			}
		}
	}
	
	public implementacao.Canal get_canal() {
		return _canal;
	}
	
	public void set_coordenada(implementacao.Coordenada value) {
		if (this._coordenada != value) {
			implementacao.Coordenada l_coordenada = this._coordenada;
			this._coordenada = value;
			if (value != null) {
				_coordenada.set_player(this);
			}
			if (l_coordenada != null && l_coordenada.get_player() == this) {
				l_coordenada.set_player(null);
			}
		}
	}
	
	public implementacao.Coordenada get_coordenada() {
		return _coordenada;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
