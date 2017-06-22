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
public class ClienteProcessor {
	private int ID;
	
	private String Nome;
	
	private int NIF;
	
	private String Email;
	
	private String Password;
	
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
		return Email == null ? "" : Email;
	}
	
	public void setPassword(String value) {
		this.Password = value;
	}
	
	public String getPassword() {
		return Password == null ? "" : Password;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				implementacao.Cliente _cliente = implementacao.ClienteDAO.loadClienteByORMID(getID());
				if (_cliente!= null) {
					copyFromBean(_cliente);
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
				implementacao.Cliente _cliente = implementacao.ClienteDAO.createCliente();
				copyToBean(_cliente);
				if (implementacao.ClienteDAO.save(_cliente)) {
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
				implementacao.Cliente _cliente= implementacao.ClienteDAO.loadClienteByORMID(getID());
				if (_cliente != null) {
					copyToBean(_cliente);
					if (implementacao.ClienteDAO.save(_cliente)) {
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
				implementacao.Cliente _cliente = implementacao.ClienteDAO.loadClienteByORMID(getID());
				if (_cliente != null && implementacao.ClienteDAO.deleteAndDissociate(_cliente)) {
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
	
	private void copyFromBean(implementacao.Cliente _cliente) {
		setNome(_cliente.getNome());
		setNIF(_cliente.getNIF());
		setEmail(_cliente.getEmail());
		setPassword(_cliente.getPassword());
		setID(_cliente.getORMID());
	}
	
	private void copyToBean(implementacao.Cliente _cliente) {
		_cliente.setNome(getNome());
		_cliente.setNIF(getNIF());
		_cliente.setEmail(getEmail());
		_cliente.setPassword(getPassword());
	}
	
}

