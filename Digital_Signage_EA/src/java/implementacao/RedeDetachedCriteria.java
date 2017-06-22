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

public class RedeDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression _clienteId;
	public final AssociationExpression _cliente;
	public final StringExpression Descricao;
	public final StringExpression Nome;
	public final CollectionExpression _player;
	
	public RedeDetachedCriteria() {
		super(implementacao.Rede.class, implementacao.RedeCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		_clienteId = new IntegerExpression("_cliente.ID", this.getDetachedCriteria());
		_cliente = new AssociationExpression("_cliente", this.getDetachedCriteria());
		Descricao = new StringExpression("Descricao", this.getDetachedCriteria());
		Nome = new StringExpression("Nome", this.getDetachedCriteria());
		_player = new CollectionExpression("ORM__player", this.getDetachedCriteria());
	}
	
	public RedeDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, implementacao.RedeCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		_clienteId = new IntegerExpression("_cliente.ID", this.getDetachedCriteria());
		_cliente = new AssociationExpression("_cliente", this.getDetachedCriteria());
		Descricao = new StringExpression("Descricao", this.getDetachedCriteria());
		Nome = new StringExpression("Nome", this.getDetachedCriteria());
		_player = new CollectionExpression("ORM__player", this.getDetachedCriteria());
	}
	
	public ClienteDetachedCriteria create_clienteCriteria() {
		return new ClienteDetachedCriteria(createCriteria("_cliente"));
	}
	
	public implementacao.PlayerDetachedCriteria create_playerCriteria() {
		return new implementacao.PlayerDetachedCriteria(createCriteria("ORM__player"));
	}
	
	public Rede uniqueRede(PersistentSession session) {
		return (Rede) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Rede[] listRede(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Rede[]) list.toArray(new Rede[list.size()]);
	}
}

