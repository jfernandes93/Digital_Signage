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

public class PlayerDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public PlayerDetachedCriteria() {
		super(implementacao.Player.class, implementacao.PlayerCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		_canalId = new IntegerExpression("_canal.ID", this.getDetachedCriteria());
		_canal = new AssociationExpression("_canal", this.getDetachedCriteria());
		_redeId = new IntegerExpression("_rede.ID", this.getDetachedCriteria());
		_rede = new AssociationExpression("_rede", this.getDetachedCriteria());
		Nome = new StringExpression("Nome", this.getDetachedCriteria());
		Descricao = new StringExpression("Descricao", this.getDetachedCriteria());
		Tamanho = new DoubleExpression("Tamanho", this.getDetachedCriteria());
		Estado = new StringExpression("Estado", this.getDetachedCriteria());
		_coordenadaId = new IntegerExpression("_coordenada.ID", this.getDetachedCriteria());
		_coordenada = new AssociationExpression("_coordenada", this.getDetachedCriteria());
	}
	
	public PlayerDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, implementacao.PlayerCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		_canalId = new IntegerExpression("_canal.ID", this.getDetachedCriteria());
		_canal = new AssociationExpression("_canal", this.getDetachedCriteria());
		_redeId = new IntegerExpression("_rede.ID", this.getDetachedCriteria());
		_rede = new AssociationExpression("_rede", this.getDetachedCriteria());
		Nome = new StringExpression("Nome", this.getDetachedCriteria());
		Descricao = new StringExpression("Descricao", this.getDetachedCriteria());
		Tamanho = new DoubleExpression("Tamanho", this.getDetachedCriteria());
		Estado = new StringExpression("Estado", this.getDetachedCriteria());
		_coordenadaId = new IntegerExpression("_coordenada.ID", this.getDetachedCriteria());
		_coordenada = new AssociationExpression("_coordenada", this.getDetachedCriteria());
	}
	
	public CanalDetachedCriteria create_canalCriteria() {
		return new CanalDetachedCriteria(createCriteria("_canal"));
	}
	
	public RedeDetachedCriteria create_redeCriteria() {
		return new RedeDetachedCriteria(createCriteria("_rede"));
	}
	
	public CoordenadaDetachedCriteria create_coordenadaCriteria() {
		return new CoordenadaDetachedCriteria(createCriteria("_coordenada"));
	}
	
	public Player uniquePlayer(PersistentSession session) {
		return (Player) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Player[] listPlayer(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Player[]) list.toArray(new Player[list.size()]);
	}
}

