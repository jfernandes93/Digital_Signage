/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restapi;

import models.Cliente;
import DAO.ClienteDAO;
import DAO.DigitalSignageFacade;
import beans.ClienteBeanLocal;
import org.hibernate.Session;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.WebApplicationContext;

/**
 *
 * @author joaof
 */
@RestController
@CrossOrigin
@RequestMapping("cliente")
public class ClienteController {
    
    @Autowired
    private DigitalSignageFacade facade;
    @RequestMapping(value="{id}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public Cliente getCliente(@PathVariable int id) throws PersistentException {
        

        
        return facade.procurarCliente(id);
    }
    @RequestMapping(method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public Cliente[] getAllClientes() throws PersistentException{
    return facade.getAllClientes();
    }
    
    @RequestMapping(method=RequestMethod.POST)
    public void insertCliente(@RequestBody Cliente c) throws PersistentException{
        
        facade.inserirCliente(c);
    
    }
    
    
}
