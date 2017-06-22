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

public class PlayerCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression _canalId;
	public final AssociationExpression _canal;
	public final IntegerExpression _redeId;
	public final AssociationExpression _rede;
	public final StringExpression Nome;
	public final StringExpression Descricao;
	public final DoubleExpression Tamanho;
	public final StringExpression Estado;
	public final IntegerExpression _coordenadaId;
	public final AssociationExpression _coordenada;
	
	public PlayerCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		_canalId = new IntegerExpression("_canal.ID", this);
		_canal = new AssociationExpression("_canal", this);
		_redeId = new IntegerExpression("_rede.ID", this);
		_rede = new AssociationExpression("_rede", this);
		Nome = new StringExpression("Nome", this);
		Descricao = new StringExpression("Descricao", this);
		Tamanho = new DoubleExpression("Tamanho", this);
		Estado = new StringExpression("Estado", this);
		_coordenadaId = new IntegerExpression("_coordenada.ID", this);
		_coordenada = new AssociationExpression("_coordenada", this);
	}
	
	public PlayerCriteria(PersistentSession session) {
		this(session.createCriteria(Player.class));
	}
	
	public PlayerCriteria() throws PersistentException {
		this(implementacao.DigitalSignagePersistentManager.instance().getSession());
	}
	
	public CanalCriteria create_canalCriteria() {
		return new CanalCriteria(createCriteria("_canal"));
	}
	
	public RedeCriteria create_redeCriteria() {
		return new RedeCriteria(createCriteria("_rede"));
	}
	
	public CoordenadaCriteria create_coordenadaCriteria() {
		return new CoordenadaCriteria(createCriteria("_coordenada"));
	}
	
	public Player uniquePlayer() {
		return (Player) super.uniqueResult();
	}
	
	public Player[] listPlayer() {
		java.util.List list = super.list();
		return (Player[]) list.toArray(new Player[list.size()]);
	}
}

