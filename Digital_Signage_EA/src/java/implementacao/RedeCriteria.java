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

public class RedeCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression _clienteId;
	public final AssociationExpression _cliente;
	public final StringExpression Descricao;
	public final StringExpression Nome;
	public final CollectionExpression _player;
	
	public RedeCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		_clienteId = new IntegerExpression("_cliente.ID", this);
		_cliente = new AssociationExpression("_cliente", this);
		Descricao = new StringExpression("Descricao", this);
		Nome = new StringExpression("Nome", this);
		_player = new CollectionExpression("ORM__player", this);
	}
	
	public RedeCriteria(PersistentSession session) {
		this(session.createCriteria(Rede.class));
	}
	
	public RedeCriteria() throws PersistentException {
		this(implementacao.DigitalSignagePersistentManager.instance().getSession());
	}
	
	public ClienteCriteria create_clienteCriteria() {
		return new ClienteCriteria(createCriteria("_cliente"));
	}
	
	public implementacao.PlayerCriteria create_playerCriteria() {
		return new implementacao.PlayerCriteria(createCriteria("ORM__player"));
	}
	
	public Rede uniqueRede() {
		return (Rede) super.uniqueResult();
	}
	
	public Rede[] listRede() {
		java.util.List list = super.list();
		return (Rede[]) list.toArray(new Rede[list.size()]);
	}
}

