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

public class TipoCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final CollectionExpression _tipo;
	
	public TipoCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		_tipo = new CollectionExpression("ORM__tipo", this);
	}
	
	public TipoCriteria(PersistentSession session) {
		this(session.createCriteria(Tipo.class));
	}
	
	public TipoCriteria() throws PersistentException {
		this(implementacao.DigitalSignagePersistentManager.instance().getSession());
	}
	
	public implementacao.ConteudoCriteria create_tipoCriteria() {
		return new implementacao.ConteudoCriteria(createCriteria("ORM__tipo"));
	}
	
	public Tipo uniqueTipo() {
		return (Tipo) super.uniqueResult();
	}
	
	public Tipo[] listTipo() {
		java.util.List list = super.list();
		return (Tipo[]) list.toArray(new Tipo[list.size()]);
	}
}

