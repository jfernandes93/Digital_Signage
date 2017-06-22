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

public class ConteudoCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression _conteudoId;
	public final AssociationExpression _conteudo;
	public final IntegerExpression _canalId;
	public final AssociationExpression _canal;
	public final TimeExpression Duracao;
	
	public ConteudoCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		_conteudoId = new IntegerExpression("_conteudo.ID", this);
		_conteudo = new AssociationExpression("_conteudo", this);
		_canalId = new IntegerExpression("_canal.ID", this);
		_canal = new AssociationExpression("_canal", this);
		Duracao = new TimeExpression("Duracao", this);
	}
	
	public ConteudoCriteria(PersistentSession session) {
		this(session.createCriteria(Conteudo.class));
	}
	
	public ConteudoCriteria() throws PersistentException {
		this(implementacao.DigitalSignagePersistentManager.instance().getSession());
	}
	
	public TipoCriteria create_conteudoCriteria() {
		return new TipoCriteria(createCriteria("_conteudo"));
	}
	
	public CanalCriteria create_canalCriteria() {
		return new CanalCriteria(createCriteria("_canal"));
	}
	
	public Conteudo uniqueConteudo() {
		return (Conteudo) super.uniqueResult();
	}
	
	public Conteudo[] listConteudo() {
		java.util.List list = super.list();
		return (Conteudo[]) list.toArray(new Conteudo[list.size()]);
	}
}

