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
package DAO;

import models.Rede;
import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class RedeDAO {
	public static Rede loadRedeByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = beans.DigitalSignagePersistentManager.instance().getSession();
			return loadRedeByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Rede getRedeByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = beans.DigitalSignagePersistentManager.instance().getSession();
			return getRedeByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Rede loadRedeByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = beans.DigitalSignagePersistentManager.instance().getSession();
			return loadRedeByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Rede getRedeByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = beans.DigitalSignagePersistentManager.instance().getSession();
			return getRedeByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Rede loadRedeByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Rede) session.load(Rede.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Rede getRedeByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Rede)session.get(Rede.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Rede loadRedeByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Rede)session.load(Rede.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Rede getRedeByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Rede) session.get(Rede.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryRede(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = beans.DigitalSignagePersistentManager.instance().getSession();
			return queryRede(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryRede(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = beans.DigitalSignagePersistentManager.instance().getSession();
			return queryRede(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Rede[] listRedeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = beans.DigitalSignagePersistentManager.instance().getSession();
			return listRedeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Rede[] listRedeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = beans.DigitalSignagePersistentManager.instance().getSession();
			return listRedeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryRede(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From models.Rede as Rede");
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
	
	public static List queryRede(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From models.Rede as Rede");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Rede", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Rede[] listRedeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryRede(session, condition, orderBy);
			return (Rede[]) list.toArray(new Rede[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Rede[] listRedeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryRede(session, condition, orderBy, lockMode);
			return (Rede[]) list.toArray(new Rede[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Rede loadRedeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = beans.DigitalSignagePersistentManager.instance().getSession();
			return loadRedeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Rede loadRedeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = beans.DigitalSignagePersistentManager.instance().getSession();
			return loadRedeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Rede loadRedeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Rede[] redes = listRedeByQuery(session, condition, orderBy);
		if (redes != null && redes.length > 0)
			return redes[0];
		else
			return null;
	}
	
	public static Rede loadRedeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Rede[] redes = listRedeByQuery(session, condition, orderBy, lockMode);
		if (redes != null && redes.length > 0)
			return redes[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateRedeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = beans.DigitalSignagePersistentManager.instance().getSession();
			return iterateRedeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateRedeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = beans.DigitalSignagePersistentManager.instance().getSession();
			return iterateRedeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateRedeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From models.Rede as Rede");
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
	
	public static java.util.Iterator iterateRedeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From models.Rede as Rede");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Rede", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Rede createRede() {
		return new Rede();
	}
	
	public static boolean save(Rede rede)throws PersistentException {
		
		try {
			beans.DigitalSignagePersistentManager.instance().saveObject(rede);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Rede rede) throws PersistentException {
		
		try {
			beans.DigitalSignagePersistentManager.instance().deleteObject(rede);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	
	
	public static boolean refresh(Rede rede) throws PersistentException {
		try {
			beans.DigitalSignagePersistentManager.instance().getSession().refresh(rede);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Rede rede) throws PersistentException{
		try {
			beans.DigitalSignagePersistentManager.instance().getSession().evict(rede);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	
}
