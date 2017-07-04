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

import models.Player;
import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class PlayerDAO {
	public static Player loadPlayerByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = beans.DigitalSignagePersistentManager.instance().getSession();
			return loadPlayerByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Player getPlayerByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = beans.DigitalSignagePersistentManager.instance().getSession();
			return getPlayerByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Player loadPlayerByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = beans.DigitalSignagePersistentManager.instance().getSession();
			return loadPlayerByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Player getPlayerByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = beans.DigitalSignagePersistentManager.instance().getSession();
			return getPlayerByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Player loadPlayerByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Player) session.load(Player.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Player getPlayerByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Player)session.get(Player.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Player loadPlayerByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Player) session.get(Player.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Player getPlayerByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Player) session.get(Player.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPlayer(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = beans.DigitalSignagePersistentManager.instance().getSession();
			return queryPlayer(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPlayer(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = beans.DigitalSignagePersistentManager.instance().getSession();
			return queryPlayer(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Player[] listPlayerByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = beans.DigitalSignagePersistentManager.instance().getSession();
			return listPlayerByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Player[] listPlayerByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = beans.DigitalSignagePersistentManager.instance().getSession();
			return listPlayerByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPlayer(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From models.Player as Player");
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
	
	public static List queryPlayer(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From models.Player as Player");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Player", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Player[] listPlayerByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryPlayer(session, condition, orderBy);
			return (Player[]) list.toArray(new Player[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Player[] listPlayerByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryPlayer(session, condition, orderBy, lockMode);
			return (Player[]) list.toArray(new Player[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Player loadPlayerByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = beans.DigitalSignagePersistentManager.instance().getSession();
			return loadPlayerByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Player loadPlayerByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = beans.DigitalSignagePersistentManager.instance().getSession();
			return loadPlayerByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Player loadPlayerByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Player[] players = listPlayerByQuery(session, condition, orderBy);
		if (players != null && players.length > 0)
			return players[0];
		else
			return null;
	}
	
	public static Player loadPlayerByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Player[] players = listPlayerByQuery(session, condition, orderBy, lockMode);
		if (players != null && players.length > 0)
			return players[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePlayerByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = beans.DigitalSignagePersistentManager.instance().getSession();
			return iteratePlayerByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePlayerByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = beans.DigitalSignagePersistentManager.instance().getSession();
			return iteratePlayerByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePlayerByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From models.Player as Player");
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
	
	public static java.util.Iterator iteratePlayerByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From models.Player as Player");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Player", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Player createPlayer() {
		return new Player();
	}
	
	public static boolean save(Player player) throws PersistentException {
		try {
			beans.DigitalSignagePersistentManager.instance().saveObject(player);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Player player) throws PersistentException {
		
		try {
			beans.DigitalSignagePersistentManager.instance().deleteObject(player);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	
	
	
	public static boolean refresh(Player player) throws PersistentException {
		
		try {
			beans.DigitalSignagePersistentManager.instance().getSession().refresh(player);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Player player) throws PersistentException {
		try {
			beans.DigitalSignagePersistentManager.instance().getSession().evict(player);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	
}
