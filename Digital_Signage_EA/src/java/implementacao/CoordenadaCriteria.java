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

public class CoordenadaCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression _playerId;
	public final AssociationExpression _player;
	public final DoubleExpression Latitude;
	public final DoubleExpression Longitude;
	
	public CoordenadaCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		_playerId = new IntegerExpression("_player.ID", this);
		_player = new AssociationExpression("_player", this);
		Latitude = new DoubleExpression("Latitude", this);
		Longitude = new DoubleExpression("Longitude", this);
	}
	
	public CoordenadaCriteria(PersistentSession session) {
		this(session.createCriteria(Coordenada.class));
	}
	
	public CoordenadaCriteria() throws PersistentException {
		this(implementacao.DigitalSignagePersistentManager.instance().getSession());
	}
	
	public PlayerCriteria create_playerCriteria() {
		return new PlayerCriteria(createCriteria("_player"));
	}
	
	public Coordenada uniqueCoordenada() {
		return (Coordenada) super.uniqueResult();
	}
	
	public Coordenada[] listCoordenada() {
		java.util.List list = super.list();
		return (Coordenada[]) list.toArray(new Coordenada[list.size()]);
	}
}

