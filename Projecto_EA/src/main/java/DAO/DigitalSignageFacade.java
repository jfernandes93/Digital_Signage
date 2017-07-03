/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import beans.ClienteBeanLocal;
import beans.CanalBeanLocal;
import javax.naming.Context;
import javax.naming.InitialContext;
import models.Cliente;
import models.Canal;
import models.Player;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;

/**
 *
 * @author joaof
 */
public class DigitalSignageFacade {
     static ClienteBeanLocal clientBean = lookupClienteBeanLocal();

    private static ClienteBeanLocal lookupClienteBeanLocal() {
        
        ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
        return (ClienteBeanLocal) context.getBean("ClienteBean");
        
    }
    public static Cliente procurarCliente(int id){
        return clientBean.getCliente(id);
    }
    public static Cliente[] getAllClientes(){
        return clientBean.getClientes();
    }
    public static void inserirCliente(Cliente c){
        clientBean.inserirCliente(c);
    }
    
    static CanalBeanLocal canalBean = lookupCanalBeanLocal();

    private static CanalBeanLocal lookupCanalBeanLocal() {
        
        ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
        return (CanalBeanLocal) context.getBean("CanalBean");
        
    }
    public static Canal procurarCanal(int id){
        return canalBean.getCanal(id);
    }
    public static Canal[] getAllCanais(){
        return canalBean.getCanais();
    }
    public static Player[] getAllPlayers(){
        return canalBean.getPlayers();
    }
    public static void inserirCanal(Canal c){
        canalBean.inserirCanal(c);
    }
}
