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
public class RedeProcessor {
	private int ID;
	
	private String Descricao;
	
	private String Nome;
	
	private String action="";
	
	public void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setDescricao(String value) {
		this.Descricao = value;
	}
	
	public String getDescricao() {
		return Descricao == null ? "" : Descricao;
	}
	
	public void setNome(String value) {
		this.Nome = value;
	}
	
	public String getNome() {
		return Nome == null ? "" : Nome;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	private int _cliente_clienteID;
	
	public void set_cliente_clienteID(int value) {
		this._cliente_clienteID = value;
	}
	
	public int get_cliente_clienteID() {
		return _cliente_clienteID;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				implementacao.Rede _rede = implementacao.RedeDAO.loadRedeByORMID(getID());
				if (_rede!= null) {
					copyFromBean(_rede);
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
				implementacao.Rede _rede = implementacao.RedeDAO.createRede();
				copyToBean(_rede);
				if (implementacao.RedeDAO.save(_rede)) {
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
				implementacao.Rede _rede= implementacao.RedeDAO.loadRedeByORMID(getID());
				if (_rede != null) {
					copyToBean(_rede);
					if (implementacao.RedeDAO.save(_rede)) {
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
				implementacao.Rede _rede = implementacao.RedeDAO.loadRedeByORMID(getID());
				if (_rede != null && implementacao.RedeDAO.deleteAndDissociate(_rede)) {
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
	
	private void copyFromBean(implementacao.Rede _rede) {
		setDescricao(_rede.getDescricao());
		setNome(_rede.getNome());
		setID(_rede.getORMID());
		
		{
			implementacao.Cliente _cliente = _rede.get_cliente();
			if (_cliente != null) {
				set_cliente_clienteID(_cliente.getORMID());
			}
		}
		
	}
	
	private void copyToBean(implementacao.Rede _rede) {
		_rede.setDescricao(getDescricao());
		_rede.setNome(getNome());
		try  {
			implementacao.Cliente __cliente = implementacao.ClienteDAO.loadClienteByORMID(get_cliente_clienteID());
			_rede.set_cliente(__cliente);
		}
		catch (PersistentException e) {
		}
		
	}
	
}

