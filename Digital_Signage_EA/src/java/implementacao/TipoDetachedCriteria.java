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

public class TipoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final CollectionExpression _tipo;
	
	public TipoDetachedCriteria() {
		super(implementacao.Tipo.class, implementacao.TipoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		_tipo = new CollectionExpression("ORM__tipo", this.getDetachedCriteria());
	}
	
	public TipoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, implementacao.TipoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		_tipo = new CollectionExpression("ORM__tipo", this.getDetachedCriteria());
	}
	
	public implementacao.ConteudoDetachedCriteria create_tipoCriteria() {
		return new implementacao.ConteudoDetachedCriteria(createCriteria("ORM__tipo"));
	}
	
	public Tipo uniqueTipo(PersistentSession session) {
		return (Tipo) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Tipo[] listTipo(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Tipo[]) list.toArray(new Tipo[list.size()]);
	}
}

