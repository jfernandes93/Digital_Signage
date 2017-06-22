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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ClienteCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression Nome;
	public final StringExpression Email;
	public final StringExpression Password;
	public final CollectionExpression _rede;
	public final CollectionExpression _canal;
	
	public ClienteCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		Nome = new StringExpression("Nome", this);
		Email = new StringExpression("Email", this);
		Password = new StringExpression("Password", this);
		_rede = new CollectionExpression("ORM__rede", this);
		_canal = new CollectionExpression("ORM__canal", this);
	}
	
	public ClienteCriteria(PersistentSession session) {
		this(session.createCriteria(Cliente.class));
	}
	
	public ClienteCriteria() throws PersistentException {
		this(implementacao.DigitalSignagePersistentManager.instance().getSession());
	}
	
	public implementacao.RedeCriteria create_redeCriteria() {
		return new implementacao.RedeCriteria(createCriteria("ORM__rede"));
	}
	
	public implementacao.CanalCriteria create_canalCriteria() {
		return new implementacao.CanalCriteria(createCriteria("ORM__canal"));
	}
	
	public Cliente uniqueCliente() {
		return (Cliente) super.uniqueResult();
	}
	
	public Cliente[] listCliente() {
		java.util.List list = super.list();
		return (Cliente[]) list.toArray(new Cliente[list.size()]);
	}
}

