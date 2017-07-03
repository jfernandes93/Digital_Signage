/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;
import DAO.CanalDAO;
import DAO.PlayerDAO;
import java.util.logging.Level;
import java.util.logging.Logger;

import models.Canal;
import models.Player;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
/**
 *
 * @author Daniel
 */
@Scope("prototype")
public class CanalBean implements CanalBeanLocal {
    private static PersistentSession session=null;
    
    
    private static PersistentSession getSession() {
        if (session == null) {
            try {
                session = DigitalSignagePersistentManager.instance().getSession();
            } catch (PersistentException e) {
                e.printStackTrace();
            }
        }
        return session;
    }
    
    public Canal getCanal(int id) {
        try {
            return CanalDAO.getCanalByORMID(getSession(), id);
        } catch (PersistentException ex) {
            Logger.getLogger(CanalBean.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
     public Canal[] getCanais() {
        try {
            return CanalDAO.listCanalByQuery(getSession(), null, null);
        } catch (PersistentException ex) {
            Logger.getLogger(CanalBean.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }   
     
    public void inserirCanal(Canal c){
        try {
            CanalDAO.save(c);
        } catch (PersistentException ex) {
            Logger.getLogger(CanalBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Player[] getPlayers() {
        try {
            return PlayerDAO.listPlayerByQuery(getSession(), null, null);
        } catch (PersistentException ex) {
            Logger.getLogger(CanalBean.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
