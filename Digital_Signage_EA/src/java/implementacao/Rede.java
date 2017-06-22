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
public class Rede implements Serializable {
	public Rede() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == implementacao.ORMConstants.KEY_REDE__PLAYER) {
			return ORM__player;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == implementacao.ORMConstants.KEY_REDE__CLIENTE) {
			this._cliente = (implementacao.Cliente) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int ID;
	
	private implementacao.Cliente _cliente;
	
	private String Descricao;
	
	private String Nome;
	
	private java.util.Set ORM__player = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setDescricao(String value) {
		this.Descricao = value;
	}
	
	public String getDescricao() {
		return Descricao;
	}
	
	public void setNome(String value) {
		this.Nome = value;
	}
	
	public String getNome() {
		return Nome;
	}
	
	public void set_cliente(implementacao.Cliente value) {
		if (_cliente != null) {
			_cliente._rede.remove(this);
		}
		if (value != null) {
			value._rede.add(this);
		}
	}
	
	public implementacao.Cliente get_cliente() {
		return _cliente;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM__cliente(implementacao.Cliente value) {
		this._cliente = value;
	}
	
	private implementacao.Cliente getORM__cliente() {
		return _cliente;
	}
	
	private void setORM__player(java.util.Set value) {
		this.ORM__player = value;
	}
	
	private java.util.Set getORM__player() {
		return ORM__player;
	}
	
	public final implementacao.PlayerSetCollection _player = new implementacao.PlayerSetCollection(this, _ormAdapter, implementacao.ORMConstants.KEY_REDE__PLAYER, implementacao.ORMConstants.KEY_PLAYER__REDE, implementacao.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
