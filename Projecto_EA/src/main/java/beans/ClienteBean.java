/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;
import DAO.ClienteDAO;
import java.util.logging.Level;
import java.util.logging.Logger;

import models.Cliente;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.springframework.context.annotation.Scope;
/**
 *
 * @author joaof
 */
@Scope("prototype")
public class ClienteBean implements ClienteBeanLocal{
    private static PersistentSession session;
    private int counter;
    private static PersistentSession getSession() {
        if (session == null) {
            try {
                session = DAO.DigitalSignagePersistentManager.instance().getSession();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return session;
    }
    public String getId(){
        return " counter is:"+(++counter);
    }
    public Cliente getCliente(int id) {
        try {
            return ClienteDAO.getClienteByORMID(getSession(), id);
        } catch (PersistentException ex) {
            Logger.getLogger(ClienteBean.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    public Cliente[] getClientes() {
        try {
            return ClienteDAO.listClienteByQuery(getSession(), null, null);
        } catch (PersistentException ex) {
            Logger.getLogger(ClienteBean.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    @Override
    public void inserirCliente(Cliente c){
        try {
            ClienteDAO.save(c);
        } catch (PersistentException ex) {
            Logger.getLogger(ClienteBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
