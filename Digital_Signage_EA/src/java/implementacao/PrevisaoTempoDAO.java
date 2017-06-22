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

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class PrevisaoTempoDAO {
	public static PrevisaoTempo loadPrevisaoTempoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = implementacao.DigitalSignagePersistentManager.instance().getSession();
			return loadPrevisaoTempoByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PrevisaoTempo getPrevisaoTempoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = implementacao.DigitalSignagePersistentManager.instance().getSession();
			return getPrevisaoTempoByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PrevisaoTempo loadPrevisaoTempoByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = implementacao.DigitalSignagePersistentManager.instance().getSession();
			return loadPrevisaoTempoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PrevisaoTempo getPrevisaoTempoByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = implementacao.DigitalSignagePersistentManager.instance().getSession();
			return getPrevisaoTempoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PrevisaoTempo loadPrevisaoTempoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (PrevisaoTempo) session.load(implementacao.PrevisaoTempo.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PrevisaoTempo getPrevisaoTempoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (PrevisaoTempo) session.get(implementacao.PrevisaoTempo.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PrevisaoTempo loadPrevisaoTempoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (PrevisaoTempo) session.load(implementacao.PrevisaoTempo.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PrevisaoTempo getPrevisaoTempoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (PrevisaoTempo) session.get(implementacao.PrevisaoTempo.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPrevisaoTempo(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = implementacao.DigitalSignagePersistentManager.instance().getSession();
			return queryPrevisaoTempo(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPrevisaoTempo(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = implementacao.DigitalSignagePersistentManager.instance().getSession();
			return queryPrevisaoTempo(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PrevisaoTempo[] listPrevisaoTempoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = implementacao.DigitalSignagePersistentManager.instance().getSession();
			return listPrevisaoTempoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PrevisaoTempo[] listPrevisaoTempoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = implementacao.DigitalSignagePersistentManager.instance().getSession();
			return listPrevisaoTempoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPrevisaoTempo(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From implementacao.PrevisaoTempo as PrevisaoTempo");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPrevisaoTempo(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From implementacao.PrevisaoTempo as PrevisaoTempo");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("PrevisaoTempo", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PrevisaoTempo[] listPrevisaoTempoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryPrevisaoTempo(session, condition, orderBy);
			return (PrevisaoTempo[]) list.toArray(new PrevisaoTempo[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PrevisaoTempo[] listPrevisaoTempoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryPrevisaoTempo(session, condition, orderBy, lockMode);
			return (PrevisaoTempo[]) list.toArray(new PrevisaoTempo[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PrevisaoTempo loadPrevisaoTempoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = implementacao.DigitalSignagePersistentManager.instance().getSession();
			return loadPrevisaoTempoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PrevisaoTempo loadPrevisaoTempoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = implementacao.DigitalSignagePersistentManager.instance().getSession();
			return loadPrevisaoTempoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PrevisaoTempo loadPrevisaoTempoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		PrevisaoTempo[] previsaoTempos = listPrevisaoTempoByQuery(session, condition, orderBy);
		if (previsaoTempos != null && previsaoTempos.length > 0)
			return previsaoTempos[0];
		else
			return null;
	}
	
	public static PrevisaoTempo loadPrevisaoTempoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		PrevisaoTempo[] previsaoTempos = listPrevisaoTempoByQuery(session, condition, orderBy, lockMode);
		if (previsaoTempos != null && previsaoTempos.length > 0)
			return previsaoTempos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePrevisaoTempoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = implementacao.DigitalSignagePersistentManager.instance().getSession();
			return iteratePrevisaoTempoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePrevisaoTempoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = implementacao.DigitalSignagePersistentManager.instance().getSession();
			return iteratePrevisaoTempoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePrevisaoTempoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From implementacao.PrevisaoTempo as PrevisaoTempo");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePrevisaoTempoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From implementacao.PrevisaoTempo as PrevisaoTempo");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("PrevisaoTempo", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PrevisaoTempo createPrevisaoTempo() {
		return new implementacao.PrevisaoTempo();
	}
	
	public static boolean save(implementacao.PrevisaoTempo previsaoTempo) throws PersistentException {
		try {
			implementacao.DigitalSignagePersistentManager.instance().saveObject(previsaoTempo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(implementacao.PrevisaoTempo previsaoTempo) throws PersistentException {
		try {
			implementacao.DigitalSignagePersistentManager.instance().deleteObject(previsaoTempo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(implementacao.PrevisaoTempo previsaoTempo)throws PersistentException {
		try {
			implementacao.Conteudo[] l_tipos = previsaoTempo._tipo.toArray();
			for(int i = 0; i < l_tipos.length; i++) {
				l_tipos[i].set_conteudo(null);
			}
			return delete(previsaoTempo);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(implementacao.PrevisaoTempo previsaoTempo, org.orm.PersistentSession session)throws PersistentException {
		try {
			implementacao.Conteudo[] l_tipos = previsaoTempo._tipo.toArray();
			for(int i = 0; i < l_tipos.length; i++) {
				l_tipos[i].set_conteudo(null);
			}
			try {
				session.delete(previsaoTempo);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(implementacao.PrevisaoTempo previsaoTempo) throws PersistentException {
		try {
			implementacao.DigitalSignagePersistentManager.instance().getSession().refresh(previsaoTempo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(implementacao.PrevisaoTempo previsaoTempo) throws PersistentException {
		try {
			implementacao.DigitalSignagePersistentManager.instance().getSession().evict(previsaoTempo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PrevisaoTempo loadPrevisaoTempoByCriteria(PrevisaoTempoCriteria previsaoTempoCriteria) {
		PrevisaoTempo[] previsaoTempos = listPrevisaoTempoByCriteria(previsaoTempoCriteria);
		if(previsaoTempos == null || previsaoTempos.length == 0) {
			return null;
		}
		return previsaoTempos[0];
	}
	
	public static PrevisaoTempo[] listPrevisaoTempoByCriteria(PrevisaoTempoCriteria previsaoTempoCriteria) {
		return previsaoTempoCriteria.listPrevisaoTempo();
	}
}
