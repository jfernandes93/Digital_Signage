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
public class Canal implements Serializable {
	public Canal() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == implementacao.ORMConstants.KEY_CANAL__CONTEUDO) {
			return ORM__conteudo;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == implementacao.ORMConstants.KEY_CANAL_CLIENTE) {
			this.cliente = (implementacao.Cliente) owner;
		}
		
		else if (key == implementacao.ORMConstants.KEY_CANAL__PLAYER) {
			this._player = (implementacao.Player) owner;
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
	
	private implementacao.Cliente cliente;
	
	private String Descricao;
	
	private String Nome;
	
	private java.util.Set ORM__conteudo = new java.util.HashSet();
	
	private implementacao.Player _player;
	
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
	
	public void setCliente(implementacao.Cliente value) {
		if (cliente != null) {
			cliente._canal.remove(this);
		}
		if (value != null) {
			value._canal.add(this);
		}
	}
	
	public implementacao.Cliente getCliente() {
		return cliente;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Cliente(implementacao.Cliente value) {
		this.cliente = value;
	}
	
	private implementacao.Cliente getORM_Cliente() {
		return cliente;
	}
	
	private void setORM__conteudo(java.util.Set value) {
		this.ORM__conteudo = value;
	}
	
	private java.util.Set getORM__conteudo() {
		return ORM__conteudo;
	}
	
	public final implementacao.ConteudoSetCollection _conteudo = new implementacao.ConteudoSetCollection(this, _ormAdapter, implementacao.ORMConstants.KEY_CANAL__CONTEUDO, implementacao.ORMConstants.KEY_CONTEUDO__CANAL, implementacao.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void set_player(implementacao.Player value) {
		if (this._player != value) {
			implementacao.Player l_player = this._player;
			this._player = value;
			if (value != null) {
				_player.set_canal(this);
			}
			if (l_player != null && l_player.get_canal() == this) {
				l_player.set_canal(null);
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
