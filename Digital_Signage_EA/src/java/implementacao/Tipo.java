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
public abstract class Tipo implements Serializable {
	public Tipo() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == implementacao.ORMConstants.KEY_TIPO__TIPO) {
			return ORM__tipo;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int ID;
	
	private java.util.Set ORM__tipo = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	private void setORM__tipo(java.util.Set value) {
		this.ORM__tipo = value;
	}
	
	private java.util.Set getORM__tipo() {
		return ORM__tipo;
	}
	
	public final implementacao.ConteudoSetCollection _tipo = new implementacao.ConteudoSetCollection(this, _ormAdapter, implementacao.ORMConstants.KEY_TIPO__TIPO, implementacao.ORMConstants.KEY_CONTEUDO__CONTEUDO, implementacao.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
