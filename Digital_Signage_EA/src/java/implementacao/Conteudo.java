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
public class Conteudo implements Serializable {
	public Conteudo() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == implementacao.ORMConstants.KEY_CONTEUDO__CANAL) {
			this._canal = (implementacao.Canal) owner;
		}
		
		else if (key == implementacao.ORMConstants.KEY_CONTEUDO__CONTEUDO) {
			this._conteudo = (implementacao.Tipo) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int ID;
	
	private implementacao.Tipo _conteudo;
	
	private implementacao.Canal _canal;
	
	private java.sql.Time Duracao;
	
	private int Reproducoes;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
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
	
	public void set_canal(implementacao.Canal value) {
		if (_canal != null) {
			_canal._conteudo.remove(this);
		}
		if (value != null) {
			value._conteudo.add(this);
		}
	}
	
	public implementacao.Canal get_canal() {
		return _canal;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM__canal(implementacao.Canal value) {
		this._canal = value;
	}
	
	private implementacao.Canal getORM__canal() {
		return _canal;
	}
	
	public void set_conteudo(implementacao.Tipo value) {
		if (_conteudo != null) {
			_conteudo._tipo.remove(this);
		}
		if (value != null) {
			value._tipo.add(this);
		}
	}
	
	public implementacao.Tipo get_conteudo() {
		return _conteudo;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM__conteudo(implementacao.Tipo value) {
		this._conteudo = value;
	}
	
	private implementacao.Tipo getORM__conteudo() {
		return _conteudo;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
