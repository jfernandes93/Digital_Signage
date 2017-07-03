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

import models.Canal;
import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;


public class CanalDAO {
	public static Canal loadCanalByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = beans.DigitalSignagePersistentManager.instance().getSession();
			return loadCanalByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Canal getCanalByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = beans.DigitalSignagePersistentManager.instance().getSession();
			return getCanalByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Canal loadCanalByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = beans.DigitalSignagePersistentManager.instance().getSession();
			return loadCanalByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Canal getCanalByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = beans.DigitalSignagePersistentManager.instance().getSession();
			return getCanalByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Canal loadCanalByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Canal) session.load(models.Canal.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Canal getCanalByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Canal) session.get(models.Canal.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Canal loadCanalByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Canal) session.load(models.Canal.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Canal getCanalByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Canal) session.get(models.Canal.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCanal(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = beans.DigitalSignagePersistentManager.instance().getSession();
			return queryCanal(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCanal(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = beans.DigitalSignagePersistentManager.instance().getSession();
			return queryCanal(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Canal[] listCanalByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = beans.DigitalSignagePersistentManager.instance().getSession();
			return listCanalByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Canal[] listCanalByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = beans.DigitalSignagePersistentManager.instance().getSession();
			return listCanalByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCanal(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From models.Canal as Canal");
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
	
	public static List queryCanal(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From models.Canal as Canal");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Canal", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Canal[] listCanalByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryCanal(session, condition, orderBy);
			return (Canal[]) list.toArray(new Canal[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Canal[] listCanalByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryCanal(session, condition, orderBy, lockMode);
			return (Canal[]) list.toArray(new Canal[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Canal loadCanalByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = beans.DigitalSignagePersistentManager.instance().getSession();
			return loadCanalByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Canal loadCanalByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = beans.DigitalSignagePersistentManager.instance().getSession();
			return loadCanalByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Canal loadCanalByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Canal[] canals = listCanalByQuery(session, condition, orderBy);
		if (canals != null && canals.length > 0)
			return canals[0];
		else
			return null;
	}
	
	public static Canal loadCanalByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Canal[] canals = listCanalByQuery(session, condition, orderBy, lockMode);
		if (canals != null && canals.length > 0)
			return canals[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateCanalByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = beans.DigitalSignagePersistentManager.instance().getSession();
			return iterateCanalByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCanalByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = beans.DigitalSignagePersistentManager.instance().getSession();
			return iterateCanalByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCanalByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From models.Canal as Canal");
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
	
	public static java.util.Iterator iterateCanalByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From models.Canal as Canal");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Canal", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Canal createCanal() {
		return new models.Canal();
	}
	
	public static boolean save(models.Canal canal) throws PersistentException {
		try {
			beans.DigitalSignagePersistentManager.instance().saveObject(canal);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(models.Canal canal) throws PersistentException {
		try {
			beans.DigitalSignagePersistentManager.instance().deleteObject(canal);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	
	
	public static boolean refresh(models.Canal canal) throws PersistentException {
		try {
			beans.DigitalSignagePersistentManager.instance().getSession().refresh(canal);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(models.Canal canal) throws PersistentException {
		try {
			beans.DigitalSignagePersistentManager.instance().getSession().evict(canal);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	
}
