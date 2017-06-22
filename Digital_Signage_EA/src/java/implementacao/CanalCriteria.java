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

public class CanalCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression clienteId;
	public final AssociationExpression cliente;
	public final StringExpression Descricao;
	public final StringExpression Nome;
	public final CollectionExpression _conteudo;
	public final IntegerExpression _playerId;
	public final AssociationExpression _player;
	
	public CanalCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		clienteId = new IntegerExpression("cliente.ID", this);
		cliente = new AssociationExpression("cliente", this);
		Descricao = new StringExpression("Descricao", this);
		Nome = new StringExpression("Nome", this);
		_conteudo = new CollectionExpression("ORM__conteudo", this);
		_playerId = new IntegerExpression("_player.ID", this);
		_player = new AssociationExpression("_player", this);
	}
	
	public CanalCriteria(PersistentSession session) {
		this(session.createCriteria(Canal.class));
	}
	
	public CanalCriteria() throws PersistentException {
		this(implementacao.DigitalSignagePersistentManager.instance().getSession());
	}
	
	public ClienteCriteria createClienteCriteria() {
		return new ClienteCriteria(createCriteria("cliente"));
	}
	
	public implementacao.ConteudoCriteria create_conteudoCriteria() {
		return new implementacao.ConteudoCriteria(createCriteria("ORM__conteudo"));
	}
	
	public PlayerCriteria create_playerCriteria() {
		return new PlayerCriteria(createCriteria("_player"));
	}
	
	public Canal uniqueCanal() {
		return (Canal) super.uniqueResult();
	}
	
	public Canal[] listCanal() {
		java.util.List list = super.list();
		return (Canal[]) list.toArray(new Canal[list.size()]);
	}
}

