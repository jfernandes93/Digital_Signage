/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import beans.ClienteBeanLocal;
import beans.CanalBeanLocal;
import beans.PlayerBeanLocal;
import javax.naming.Context;
import javax.naming.InitialContext;
import models.Cliente;
import models.Canal;
import models.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

/**
 *
 * @author joaof
 */
@Scope("prototype")
public class DigitalSignageFacade {
    @Autowired
    private ClienteBeanLocal clientBean;
    
   @Autowired
private CanalBeanLocal canalBean;
    
   @Autowired
   private PlayerBeanLocal playerBean;

    public Cliente procurarCliente(int id){
       
        return clientBean.getCliente(id);
    }
    public Cliente[] getAllClientes(){
        return clientBean.getClientes();
    }
    public void inserirCliente(Cliente c){
        clientBean.inserirCliente(c);
    }
    

    public Canal procurarCanal(int id){
        return canalBean.getCanal(id);
    }
    public Canal[] getAllCanais(){
        return canalBean.getCanais();
    }
    public Player[] getAllPlayers(){
        return canalBean.getPlayers();
    }
    public void inserirCanal(Canal c){
        canalBean.inserirCanal(c);
    }

    public void inserirPlayer(Player p) {
        playerBean.inserirPlayer(p);
    }

    public Player procurarPlayer(int id) {
        return playerBean.getPlayer(id);
    }
}
