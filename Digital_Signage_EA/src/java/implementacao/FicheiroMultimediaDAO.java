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

public class FicheiroMultimediaDAO {
	public static FicheiroMultimedia loadFicheiroMultimediaByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = implementacao.DigitalSignagePersistentManager.instance().getSession();
			return loadFicheiroMultimediaByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static FicheiroMultimedia getFicheiroMultimediaByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = implementacao.DigitalSignagePersistentManager.instance().getSession();
			return getFicheiroMultimediaByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static FicheiroMultimedia loadFicheiroMultimediaByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = implementacao.DigitalSignagePersistentManager.instance().getSession();
			return loadFicheiroMultimediaByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static FicheiroMultimedia getFicheiroMultimediaByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = implementacao.DigitalSignagePersistentManager.instance().getSession();
			return getFicheiroMultimediaByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static FicheiroMultimedia loadFicheiroMultimediaByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (FicheiroMultimedia) session.load(implementacao.FicheiroMultimedia.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static FicheiroMultimedia getFicheiroMultimediaByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (FicheiroMultimedia) session.get(implementacao.FicheiroMultimedia.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static FicheiroMultimedia loadFicheiroMultimediaByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (FicheiroMultimedia) session.load(implementacao.FicheiroMultimedia.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static FicheiroMultimedia getFicheiroMultimediaByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (FicheiroMultimedia) session.get(implementacao.FicheiroMultimedia.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryFicheiroMultimedia(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = implementacao.DigitalSignagePersistentManager.instance().getSession();
			return queryFicheiroMultimedia(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryFicheiroMultimedia(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = implementacao.DigitalSignagePersistentManager.instance().getSession();
			return queryFicheiroMultimedia(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static FicheiroMultimedia[] listFicheiroMultimediaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = implementacao.DigitalSignagePersistentManager.instance().getSession();
			return listFicheiroMultimediaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static FicheiroMultimedia[] listFicheiroMultimediaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = implementacao.DigitalSignagePersistentManager.instance().getSession();
			return listFicheiroMultimediaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryFicheiroMultimedia(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From implementacao.FicheiroMultimedia as FicheiroMultimedia");
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
	
	public static List queryFicheiroMultimedia(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From implementacao.FicheiroMultimedia as FicheiroMultimedia");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("FicheiroMultimedia", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static FicheiroMultimedia[] listFicheiroMultimediaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryFicheiroMultimedia(session, condition, orderBy);
			return (FicheiroMultimedia[]) list.toArray(new FicheiroMultimedia[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static FicheiroMultimedia[] listFicheiroMultimediaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryFicheiroMultimedia(session, condition, orderBy, lockMode);
			return (FicheiroMultimedia[]) list.toArray(new FicheiroMultimedia[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static FicheiroMultimedia loadFicheiroMultimediaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = implementacao.DigitalSignagePersistentManager.instance().getSession();
			return loadFicheiroMultimediaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static FicheiroMultimedia loadFicheiroMultimediaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = implementacao.DigitalSignagePersistentManager.instance().getSession();
			return loadFicheiroMultimediaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static FicheiroMultimedia loadFicheiroMultimediaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		FicheiroMultimedia[] ficheiroMultimedias = listFicheiroMultimediaByQuery(session, condition, orderBy);
		if (ficheiroMultimedias != null && ficheiroMultimedias.length > 0)
			return ficheiroMultimedias[0];
		else
			return null;
	}
	
	public static FicheiroMultimedia loadFicheiroMultimediaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		FicheiroMultimedia[] ficheiroMultimedias = listFicheiroMultimediaByQuery(session, condition, orderBy, lockMode);
		if (ficheiroMultimedias != null && ficheiroMultimedias.length > 0)
			return ficheiroMultimedias[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateFicheiroMultimediaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = implementacao.DigitalSignagePersistentManager.instance().getSession();
			return iterateFicheiroMultimediaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateFicheiroMultimediaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = implementacao.DigitalSignagePersistentManager.instance().getSession();
			return iterateFicheiroMultimediaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateFicheiroMultimediaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From implementacao.FicheiroMultimedia as FicheiroMultimedia");
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
	
	public static java.util.Iterator iterateFicheiroMultimediaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From implementacao.FicheiroMultimedia as FicheiroMultimedia");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("FicheiroMultimedia", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static FicheiroMultimedia createFicheiroMultimedia() {
		return new implementacao.FicheiroMultimedia();
	}
	
	public static boolean save(implementacao.FicheiroMultimedia ficheiroMultimedia) throws PersistentException {
		try {
			implementacao.DigitalSignagePersistentManager.instance().saveObject(ficheiroMultimedia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(implementacao.FicheiroMultimedia ficheiroMultimedia) throws PersistentException {
		try {
			implementacao.DigitalSignagePersistentManager.instance().deleteObject(ficheiroMultimedia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(implementacao.FicheiroMultimedia ficheiroMultimedia)throws PersistentException {
		try {
			implementacao.Conteudo[] l_tipos = ficheiroMultimedia._tipo.toArray();
			for(int i = 0; i < l_tipos.length; i++) {
				l_tipos[i].set_conteudo(null);
			}
			return delete(ficheiroMultimedia);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(implementacao.FicheiroMultimedia ficheiroMultimedia, org.orm.PersistentSession session)throws PersistentException {
		try {
			implementacao.Conteudo[] l_tipos = ficheiroMultimedia._tipo.toArray();
			for(int i = 0; i < l_tipos.length; i++) {
				l_tipos[i].set_conteudo(null);
			}
			try {
				session.delete(ficheiroMultimedia);
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
	
	public static boolean refresh(implementacao.FicheiroMultimedia ficheiroMultimedia) throws PersistentException {
		try {
			implementacao.DigitalSignagePersistentManager.instance().getSession().refresh(ficheiroMultimedia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(implementacao.FicheiroMultimedia ficheiroMultimedia) throws PersistentException {
		try {
			implementacao.DigitalSignagePersistentManager.instance().getSession().evict(ficheiroMultimedia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static FicheiroMultimedia loadFicheiroMultimediaByCriteria(FicheiroMultimediaCriteria ficheiroMultimediaCriteria) {
		FicheiroMultimedia[] ficheiroMultimedias = listFicheiroMultimediaByCriteria(ficheiroMultimediaCriteria);
		if(ficheiroMultimedias == null || ficheiroMultimedias.length == 0) {
			return null;
		}
		return ficheiroMultimedias[0];
	}
	
	public static FicheiroMultimedia[] listFicheiroMultimediaByCriteria(FicheiroMultimediaCriteria ficheiroMultimediaCriteria) {
		return ficheiroMultimediaCriteria.listFicheiroMultimedia();
	}
}
