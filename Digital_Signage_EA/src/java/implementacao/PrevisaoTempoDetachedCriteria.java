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

public class PrevisaoTempoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final CollectionExpression _tipo;
	public final StringExpression URL;
	
	public PrevisaoTempoDetachedCriteria() {
		super(implementacao.PrevisaoTempo.class, implementacao.PrevisaoTempoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		_tipo = new CollectionExpression("ORM__tipo", this.getDetachedCriteria());
		URL = new StringExpression("URL", this.getDetachedCriteria());
	}
	
	public PrevisaoTempoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, implementacao.PrevisaoTempoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		_tipo = new CollectionExpression("ORM__tipo", this.getDetachedCriteria());
		URL = new StringExpression("URL", this.getDetachedCriteria());
	}
	
	public implementacao.ConteudoDetachedCriteria create_tipoCriteria() {
		return new implementacao.ConteudoDetachedCriteria(createCriteria("ORM__tipo"));
	}
	
	public PrevisaoTempo uniquePrevisaoTempo(PersistentSession session) {
		return (PrevisaoTempo) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public PrevisaoTempo[] listPrevisaoTempo(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (PrevisaoTempo[]) list.toArray(new PrevisaoTempo[list.size()]);
	}
}

