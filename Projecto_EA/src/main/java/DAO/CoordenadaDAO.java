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

import models.Coordenada;
import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class CoordenadaDAO {
	public static Coordenada loadCoordenadaByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = beans.DigitalSignagePersistentManager.instance().getSession();
			return loadCoordenadaByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Coordenada getCoordenadaByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = beans.DigitalSignagePersistentManager.instance().getSession();
			return getCoordenadaByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Coordenada loadCoordenadaByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = beans.DigitalSignagePersistentManager.instance().getSession();
			return loadCoordenadaByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Coordenada getCoordenadaByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = beans.DigitalSignagePersistentManager.instance().getSession();
			return getCoordenadaByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Coordenada loadCoordenadaByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Coordenada) session.load(Coordenada.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Coordenada getCoordenadaByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Coordenada)session.get(Coordenada.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Coordenada loadCoordenadaByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Coordenada) session.load(Coordenada.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Coordenada getCoordenadaByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Coordenada) session.get(Coordenada.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCoordenada(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = beans.DigitalSignagePersistentManager.instance().getSession();
			return queryCoordenada(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCoordenada(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = beans.DigitalSignagePersistentManager.instance().getSession();
			return queryCoordenada(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Coordenada[] listCoordenadaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = beans.DigitalSignagePersistentManager.instance().getSession();
			return listCoordenadaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Coordenada[] listCoordenadaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = beans.DigitalSignagePersistentManager.instance().getSession();
			return listCoordenadaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCoordenada(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From models.Coordenada as Coordenada");
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
	
	public static List queryCoordenada(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From models.Coordenada as Coordenada");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Coordenada", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Coordenada[] listCoordenadaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryCoordenada(session, condition, orderBy);
			return (Coordenada[]) list.toArray(new Coordenada[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Coordenada[] listCoordenadaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryCoordenada(session, condition, orderBy, lockMode);
			return (Coordenada[]) list.toArray(new Coordenada[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Coordenada loadCoordenadaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = beans.DigitalSignagePersistentManager.instance().getSession();
			return loadCoordenadaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Coordenada loadCoordenadaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = beans.DigitalSignagePersistentManager.instance().getSession();
			return loadCoordenadaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Coordenada loadCoordenadaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Coordenada[] coordenadas = listCoordenadaByQuery(session, condition, orderBy);
		if (coordenadas != null && coordenadas.length > 0)
			return coordenadas[0];
		else
			return null;
	}
	
	public static Coordenada loadCoordenadaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Coordenada[] coordenadas = listCoordenadaByQuery(session, condition, orderBy, lockMode);
		if (coordenadas != null && coordenadas.length > 0)
			return coordenadas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateCoordenadaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = beans.DigitalSignagePersistentManager.instance().getSession();
			return iterateCoordenadaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCoordenadaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = beans.DigitalSignagePersistentManager.instance().getSession();
			return iterateCoordenadaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCoordenadaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From models.Coordenada as Coordenada");
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
	
	public static java.util.Iterator iterateCoordenadaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From models.Coordenada as Coordenada");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Coordenada", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Coordenada createCoordenada() {
		return new Coordenada();
	}
	
	public static boolean save(Coordenada coordenada) throws PersistentException {
		try {
			beans.DigitalSignagePersistentManager.instance().saveObject(coordenada);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Coordenada coordenada) throws PersistentException {
		try {
			beans.DigitalSignagePersistentManager.instance().deleteObject(coordenada);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	
	public static boolean refresh(Coordenada coordenada)throws PersistentException {
		
		try {
			beans.DigitalSignagePersistentManager.instance().getSession().refresh(coordenada);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Coordenada coordenada)throws PersistentException {
		
		try {
			beans.DigitalSignagePersistentManager.instance().getSession().evict(coordenada);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	
}
