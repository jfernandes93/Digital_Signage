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

public class CoordenadaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression _playerId;
	public final AssociationExpression _player;
	public final DoubleExpression Latitude;
	public final DoubleExpression Longitude;
	
	public CoordenadaDetachedCriteria() {
		super(implementacao.Coordenada.class, implementacao.CoordenadaCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		_playerId = new IntegerExpression("_player.ID", this.getDetachedCriteria());
		_player = new AssociationExpression("_player", this.getDetachedCriteria());
		Latitude = new DoubleExpression("Latitude", this.getDetachedCriteria());
		Longitude = new DoubleExpression("Longitude", this.getDetachedCriteria());
	}
	
	public CoordenadaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, implementacao.CoordenadaCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		_playerId = new IntegerExpression("_player.ID", this.getDetachedCriteria());
		_player = new AssociationExpression("_player", this.getDetachedCriteria());
		Latitude = new DoubleExpression("Latitude", this.getDetachedCriteria());
		Longitude = new DoubleExpression("Longitude", this.getDetachedCriteria());
	}
	
	public PlayerDetachedCriteria create_playerCriteria() {
		return new PlayerDetachedCriteria(createCriteria("_player"));
	}
	
	public Coordenada uniqueCoordenada(PersistentSession session) {
		return (Coordenada) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Coordenada[] listCoordenada(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Coordenada[]) list.toArray(new Coordenada[list.size()]);
	}
}

