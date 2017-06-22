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
public class Cliente implements Serializable {
	public Cliente() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == implementacao.ORMConstants.KEY_CLIENTE__REDE) {
			return ORM__rede;
		}
		else if (key == implementacao.ORMConstants.KEY_CLIENTE__CANAL) {
			return ORM__canal;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int ID;
	
	private String Nome;
	
	private int NIF;
	
	private String Email;
	
	private String Password;
	
	private java.util.Set ORM__rede = new java.util.HashSet();
	
	private java.util.Set ORM__canal = new java.util.HashSet();
	
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
	
	public void setNIF(int value) {
		this.NIF = value;
	}
	
	public int getNIF() {
		return NIF;
	}
	
	public void setEmail(String value) {
		this.Email = value;
	}
	
	public String getEmail() {
		return Email;
	}
	
	public void setPassword(String value) {
		this.Password = value;
	}
	
	public String getPassword() {
		return Password;
	}
	
	private void setORM__rede(java.util.Set value) {
		this.ORM__rede = value;
	}
	
	private java.util.Set getORM__rede() {
		return ORM__rede;
	}
	
	public final implementacao.RedeSetCollection _rede = new implementacao.RedeSetCollection(this, _ormAdapter, implementacao.ORMConstants.KEY_CLIENTE__REDE, implementacao.ORMConstants.KEY_REDE__CLIENTE, implementacao.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM__canal(java.util.Set value) {
		this.ORM__canal = value;
	}
	
	private java.util.Set getORM__canal() {
		return ORM__canal;
	}
	
	public final implementacao.CanalSetCollection _canal = new implementacao.CanalSetCollection(this, _ormAdapter, implementacao.ORMConstants.KEY_CLIENTE__CANAL, implementacao.ORMConstants.KEY_CANAL_CLIENTE, implementacao.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
