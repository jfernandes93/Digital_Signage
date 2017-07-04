/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import DAO.PlayerDAO;

import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Player;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.springframework.context.annotation.Scope;

/**
 *
 * @author joaof
 */
@Scope("prototype")
public class PlayerBean implements PlayerBeanLocal{
    private static PersistentSession session=null;
    
    
    private static PersistentSession getSession() {
        
        try {
            return DigitalSignagePersistentManager.instance().getSession();
        } catch (PersistentException ex) {
            Logger.getLogger(CanalBean.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    @Override
    public Player validatePlayer(String name,String password) {
        try {

           Player p=PlayerDAO.getPlayerByName(getSession(),name,password);

            p.setEstado("ON");
            PlayerDAO.save(p);
            return p;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public Player getPlayer(int id){
        try {
            return PlayerDAO.getPlayerByORMID(id);
        } catch (PersistentException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Player[] getPlayers() {
        try {
            return PlayerDAO.listPlayerByQuery(getSession(), null,null);
        } catch (PersistentException ex) {
            Logger.getLogger(PlayerBean.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public void inserirPlayer(Player p) {
        try {
            PlayerDAO.save(p);
        } catch (PersistentException ex) {
            Logger.getLogger(PlayerBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    
}
