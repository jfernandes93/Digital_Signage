/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import DAO.RedeDAO;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Rede;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.springframework.context.annotation.Scope;

/**
 *
 * @author joaof
 */
@Scope("prototype")
public class RedeBean implements RedeBeanLocal{
    private static PersistentSession getSession() throws PersistentException {
        
        return DigitalSignagePersistentManager.instance().getSession();
    }

    @Override
    public Rede getRede(int id) {
        try {
            return RedeDAO.getRedeByORMID(getSession(), id);
        } catch (PersistentException ex) {
            Logger.getLogger(RedeBean.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public Rede[] getRedes() {
        try {
            return RedeDAO.listRedeByQuery(getSession(), null, null);
        } catch (PersistentException ex) {
            Logger.getLogger(RedeBean.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public void inserirRede(Rede r) {
        try {
            RedeDAO.save(r);
        } catch (PersistentException ex) {
            Logger.getLogger(RedeBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
