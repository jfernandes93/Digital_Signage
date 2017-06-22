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

public class PrevisaoTempoCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final CollectionExpression _tipo;
	public final StringExpression URL;
	
	public PrevisaoTempoCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		_tipo = new CollectionExpression("ORM__tipo", this);
		URL = new StringExpression("URL", this);
	}
	
	public PrevisaoTempoCriteria(PersistentSession session) {
		this(session.createCriteria(PrevisaoTempo.class));
	}
	
	public PrevisaoTempoCriteria() throws PersistentException {
		this(implementacao.DigitalSignagePersistentManager.instance().getSession());
	}
	
	public implementacao.ConteudoCriteria create_tipoCriteria() {
		return new implementacao.ConteudoCriteria(createCriteria("ORM__tipo"));
	}
	
	public PrevisaoTempo uniquePrevisaoTempo() {
		return (PrevisaoTempo) super.uniqueResult();
	}
	
	public PrevisaoTempo[] listPrevisaoTempo() {
		java.util.List list = super.list();
		return (PrevisaoTempo[]) list.toArray(new PrevisaoTempo[list.size()]);
	}
}

