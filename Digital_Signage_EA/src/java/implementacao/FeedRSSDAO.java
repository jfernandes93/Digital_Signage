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

public class FeedRSSDAO {
	public static FeedRSS loadFeedRSSByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = implementacao.DigitalSignagePersistentManager.instance().getSession();
			return loadFeedRSSByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static FeedRSS getFeedRSSByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = implementacao.DigitalSignagePersistentManager.instance().getSession();
			return getFeedRSSByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static FeedRSS loadFeedRSSByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = implementacao.DigitalSignagePersistentManager.instance().getSession();
			return loadFeedRSSByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static FeedRSS getFeedRSSByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = implementacao.DigitalSignagePersistentManager.instance().getSession();
			return getFeedRSSByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static FeedRSS loadFeedRSSByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (FeedRSS) session.load(implementacao.FeedRSS.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static FeedRSS getFeedRSSByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (FeedRSS) session.get(implementacao.FeedRSS.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static FeedRSS loadFeedRSSByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (FeedRSS) session.load(implementacao.FeedRSS.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static FeedRSS getFeedRSSByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (FeedRSS) session.get(implementacao.FeedRSS.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryFeedRSS(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = implementacao.DigitalSignagePersistentManager.instance().getSession();
			return queryFeedRSS(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryFeedRSS(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = implementacao.DigitalSignagePersistentManager.instance().getSession();
			return queryFeedRSS(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static FeedRSS[] listFeedRSSByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = implementacao.DigitalSignagePersistentManager.instance().getSession();
			return listFeedRSSByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static FeedRSS[] listFeedRSSByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = implementacao.DigitalSignagePersistentManager.instance().getSession();
			return listFeedRSSByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryFeedRSS(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From implementacao.FeedRSS as FeedRSS");
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
	
	public static List queryFeedRSS(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From implementacao.FeedRSS as FeedRSS");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("FeedRSS", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static FeedRSS[] listFeedRSSByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryFeedRSS(session, condition, orderBy);
			return (FeedRSS[]) list.toArray(new FeedRSS[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static FeedRSS[] listFeedRSSByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryFeedRSS(session, condition, orderBy, lockMode);
			return (FeedRSS[]) list.toArray(new FeedRSS[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static FeedRSS loadFeedRSSByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = implementacao.DigitalSignagePersistentManager.instance().getSession();
			return loadFeedRSSByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static FeedRSS loadFeedRSSByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = implementacao.DigitalSignagePersistentManager.instance().getSession();
			return loadFeedRSSByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static FeedRSS loadFeedRSSByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		FeedRSS[] feedRSSs = listFeedRSSByQuery(session, condition, orderBy);
		if (feedRSSs != null && feedRSSs.length > 0)
			return feedRSSs[0];
		else
			return null;
	}
	
	public static FeedRSS loadFeedRSSByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		FeedRSS[] feedRSSs = listFeedRSSByQuery(session, condition, orderBy, lockMode);
		if (feedRSSs != null && feedRSSs.length > 0)
			return feedRSSs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateFeedRSSByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = implementacao.DigitalSignagePersistentManager.instance().getSession();
			return iterateFeedRSSByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateFeedRSSByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = implementacao.DigitalSignagePersistentManager.instance().getSession();
			return iterateFeedRSSByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateFeedRSSByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From implementacao.FeedRSS as FeedRSS");
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
	
	public static java.util.Iterator iterateFeedRSSByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From implementacao.FeedRSS as FeedRSS");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("FeedRSS", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static FeedRSS createFeedRSS() {
		return new implementacao.FeedRSS();
	}
	
	public static boolean save(implementacao.FeedRSS feedRSS) throws PersistentException {
		try {
			implementacao.DigitalSignagePersistentManager.instance().saveObject(feedRSS);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(implementacao.FeedRSS feedRSS) throws PersistentException {
		try {
			implementacao.DigitalSignagePersistentManager.instance().deleteObject(feedRSS);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(implementacao.FeedRSS feedRSS)throws PersistentException {
		try {
			implementacao.Conteudo[] l_tipos = feedRSS._tipo.toArray();
			for(int i = 0; i < l_tipos.length; i++) {
				l_tipos[i].set_conteudo(null);
			}
			return delete(feedRSS);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(implementacao.FeedRSS feedRSS, org.orm.PersistentSession session)throws PersistentException {
		try {
			implementacao.Conteudo[] l_tipos = feedRSS._tipo.toArray();
			for(int i = 0; i < l_tipos.length; i++) {
				l_tipos[i].set_conteudo(null);
			}
			try {
				session.delete(feedRSS);
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
	
	public static boolean refresh(implementacao.FeedRSS feedRSS) throws PersistentException {
		try {
			implementacao.DigitalSignagePersistentManager.instance().getSession().refresh(feedRSS);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(implementacao.FeedRSS feedRSS) throws PersistentException {
		try {
			implementacao.DigitalSignagePersistentManager.instance().getSession().evict(feedRSS);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static FeedRSS loadFeedRSSByCriteria(FeedRSSCriteria feedRSSCriteria) {
		FeedRSS[] feedRSSs = listFeedRSSByCriteria(feedRSSCriteria);
		if(feedRSSs == null || feedRSSs.length == 0) {
			return null;
		}
		return feedRSSs[0];
	}
	
	public static FeedRSS[] listFeedRSSByCriteria(FeedRSSCriteria feedRSSCriteria) {
		return feedRSSCriteria.listFeedRSS();
	}
}
