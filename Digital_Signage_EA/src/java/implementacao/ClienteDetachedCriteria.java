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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ClienteDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression Nome;
	public final StringExpression Email;
	public final StringExpression Password;
	public final CollectionExpression _rede;
	public final CollectionExpression _canal;
	
	public ClienteDetachedCriteria() {
		super(implementacao.Cliente.class, implementacao.ClienteCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		Nome = new StringExpression("Nome", this.getDetachedCriteria());
		Email = new StringExpression("Email", this.getDetachedCriteria());
		Password = new StringExpression("Password", this.getDetachedCriteria());
		_rede = new CollectionExpression("ORM__rede", this.getDetachedCriteria());
		_canal = new CollectionExpression("ORM__canal", this.getDetachedCriteria());
	}
	
	public ClienteDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, implementacao.ClienteCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		Nome = new StringExpression("Nome", this.getDetachedCriteria());
		Email = new StringExpression("Email", this.getDetachedCriteria());
		Password = new StringExpression("Password", this.getDetachedCriteria());
		_rede = new CollectionExpression("ORM__rede", this.getDetachedCriteria());
		_canal = new CollectionExpression("ORM__canal", this.getDetachedCriteria());
	}
	
	public implementacao.RedeDetachedCriteria create_redeCriteria() {
		return new implementacao.RedeDetachedCriteria(createCriteria("ORM__rede"));
	}
	
	public implementacao.CanalDetachedCriteria create_canalCriteria() {
		return new implementacao.CanalDetachedCriteria(createCriteria("ORM__canal"));
	}
	
	public Cliente uniqueCliente(PersistentSession session) {
		return (Cliente) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Cliente[] listCliente(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Cliente[]) list.toArray(new Cliente[list.size()]);
	}
}

