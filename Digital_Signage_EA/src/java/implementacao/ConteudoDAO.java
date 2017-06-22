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

public class ConteudoDAO {
	public static Conteudo loadConteudoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = implementacao.DigitalSignagePersistentManager.instance().getSession();
			return loadConteudoByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Conteudo getConteudoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = implementacao.DigitalSignagePersistentManager.instance().getSession();
			return getConteudoByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Conteudo loadConteudoByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = implementacao.DigitalSignagePersistentManager.instance().getSession();
			return loadConteudoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Conteudo getConteudoByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = implementacao.DigitalSignagePersistentManager.instance().getSession();
			return getConteudoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Conteudo loadConteudoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Conteudo) session.load(implementacao.Conteudo.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Conteudo getConteudoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Conteudo) session.get(implementacao.Conteudo.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Conteudo loadConteudoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Conteudo) session.load(implementacao.Conteudo.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Conteudo getConteudoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Conteudo) session.get(implementacao.Conteudo.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryConteudo(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = implementacao.DigitalSignagePersistentManager.instance().getSession();
			return queryConteudo(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryConteudo(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = implementacao.DigitalSignagePersistentManager.instance().getSession();
			return queryConteudo(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Conteudo[] listConteudoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = implementacao.DigitalSignagePersistentManager.instance().getSession();
			return listConteudoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Conteudo[] listConteudoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = implementacao.DigitalSignagePersistentManager.instance().getSession();
			return listConteudoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryConteudo(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From implementacao.Conteudo as Conteudo");
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
	
	public static List queryConteudo(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From implementacao.Conteudo as Conteudo");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Conteudo", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Conteudo[] listConteudoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryConteudo(session, condition, orderBy);
			return (Conteudo[]) list.toArray(new Conteudo[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Conteudo[] listConteudoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryConteudo(session, condition, orderBy, lockMode);
			return (Conteudo[]) list.toArray(new Conteudo[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Conteudo loadConteudoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = implementacao.DigitalSignagePersistentManager.instance().getSession();
			return loadConteudoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Conteudo loadConteudoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = implementacao.DigitalSignagePersistentManager.instance().getSession();
			return loadConteudoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Conteudo loadConteudoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Conteudo[] conteudos = listConteudoByQuery(session, condition, orderBy);
		if (conteudos != null && conteudos.length > 0)
			return conteudos[0];
		else
			return null;
	}
	
	public static Conteudo loadConteudoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Conteudo[] conteudos = listConteudoByQuery(session, condition, orderBy, lockMode);
		if (conteudos != null && conteudos.length > 0)
			return conteudos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateConteudoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = implementacao.DigitalSignagePersistentManager.instance().getSession();
			return iterateConteudoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateConteudoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = implementacao.DigitalSignagePersistentManager.instance().getSession();
			return iterateConteudoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateConteudoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From implementacao.Conteudo as Conteudo");
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
	
	public static java.util.Iterator iterateConteudoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From implementacao.Conteudo as Conteudo");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Conteudo", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Conteudo createConteudo() {
		return new implementacao.Conteudo();
	}
	
	public static boolean save(implementacao.Conteudo conteudo) throws PersistentException {
		try {
			implementacao.DigitalSignagePersistentManager.instance().saveObject(conteudo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(implementacao.Conteudo conteudo) throws PersistentException {
		try {
			implementacao.DigitalSignagePersistentManager.instance().deleteObject(conteudo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(implementacao.Conteudo conteudo)throws PersistentException {
		try {
			if (conteudo.get_conteudo() != null) {
				conteudo.get_conteudo()._tipo.remove(conteudo);
			}
			
			if (conteudo.get_canal() != null) {
				conteudo.get_canal()._conteudo.remove(conteudo);
			}
			
			return delete(conteudo);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(implementacao.Conteudo conteudo, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (conteudo.get_conteudo() != null) {
				conteudo.get_conteudo()._tipo.remove(conteudo);
			}
			
			if (conteudo.get_canal() != null) {
				conteudo.get_canal()._conteudo.remove(conteudo);
			}
			
			try {
				session.delete(conteudo);
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
	
	public static boolean refresh(implementacao.Conteudo conteudo) throws PersistentException {
		try {
			implementacao.DigitalSignagePersistentManager.instance().getSession().refresh(conteudo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(implementacao.Conteudo conteudo) throws PersistentException {
		try {
			implementacao.DigitalSignagePersistentManager.instance().getSession().evict(conteudo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Conteudo loadConteudoByCriteria(ConteudoCriteria conteudoCriteria) {
		Conteudo[] conteudos = listConteudoByCriteria(conteudoCriteria);
		if(conteudos == null || conteudos.length == 0) {
			return null;
		}
		return conteudos[0];
	}
	
	public static Conteudo[] listConteudoByCriteria(ConteudoCriteria conteudoCriteria) {
		return conteudoCriteria.listConteudo();
	}
}
