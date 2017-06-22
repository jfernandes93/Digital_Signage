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

public class CanalDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression clienteId;
	public final AssociationExpression cliente;
	public final StringExpression Descricao;
	public final StringExpression Nome;
	public final CollectionExpression _conteudo;
	public final IntegerExpression _playerId;
	public final AssociationExpression _player;
	
	public CanalDetachedCriteria() {
		super(implementacao.Canal.class, implementacao.CanalCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		clienteId = new IntegerExpression("cliente.ID", this.getDetachedCriteria());
		cliente = new AssociationExpression("cliente", this.getDetachedCriteria());
		Descricao = new StringExpression("Descricao", this.getDetachedCriteria());
		Nome = new StringExpression("Nome", this.getDetachedCriteria());
		_conteudo = new CollectionExpression("ORM__conteudo", this.getDetachedCriteria());
		_playerId = new IntegerExpression("_player.ID", this.getDetachedCriteria());
		_player = new AssociationExpression("_player", this.getDetachedCriteria());
	}
	
	public CanalDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, implementacao.CanalCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		clienteId = new IntegerExpression("cliente.ID", this.getDetachedCriteria());
		cliente = new AssociationExpression("cliente", this.getDetachedCriteria());
		Descricao = new StringExpression("Descricao", this.getDetachedCriteria());
		Nome = new StringExpression("Nome", this.getDetachedCriteria());
		_conteudo = new CollectionExpression("ORM__conteudo", this.getDetachedCriteria());
		_playerId = new IntegerExpression("_player.ID", this.getDetachedCriteria());
		_player = new AssociationExpression("_player", this.getDetachedCriteria());
	}
	
	public ClienteDetachedCriteria createClienteCriteria() {
		return new ClienteDetachedCriteria(createCriteria("cliente"));
	}
	
	public implementacao.ConteudoDetachedCriteria create_conteudoCriteria() {
		return new implementacao.ConteudoDetachedCriteria(createCriteria("ORM__conteudo"));
	}
	
	public PlayerDetachedCriteria create_playerCriteria() {
		return new PlayerDetachedCriteria(createCriteria("_player"));
	}
	
	public Canal uniqueCanal(PersistentSession session) {
		return (Canal) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Canal[] listCanal(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Canal[]) list.toArray(new Canal[list.size()]);
	}
}

