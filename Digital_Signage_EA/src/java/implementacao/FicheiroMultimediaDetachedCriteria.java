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

public class FicheiroMultimediaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final CollectionExpression _tipo;
	public final StringExpression URL;
	
	public FicheiroMultimediaDetachedCriteria() {
		super(implementacao.FicheiroMultimedia.class, implementacao.FicheiroMultimediaCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		_tipo = new CollectionExpression("ORM__tipo", this.getDetachedCriteria());
		URL = new StringExpression("URL", this.getDetachedCriteria());
	}
	
	public FicheiroMultimediaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, implementacao.FicheiroMultimediaCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		_tipo = new CollectionExpression("ORM__tipo", this.getDetachedCriteria());
		URL = new StringExpression("URL", this.getDetachedCriteria());
	}
	
	public implementacao.ConteudoDetachedCriteria create_tipoCriteria() {
		return new implementacao.ConteudoDetachedCriteria(createCriteria("ORM__tipo"));
	}
	
	public FicheiroMultimedia uniqueFicheiroMultimedia(PersistentSession session) {
		return (FicheiroMultimedia) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public FicheiroMultimedia[] listFicheiroMultimedia(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (FicheiroMultimedia[]) list.toArray(new FicheiroMultimedia[list.size()]);
	}
}

