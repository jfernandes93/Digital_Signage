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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.WebApplicationContext;

/**
 *
 * @author joaof
 */
@RestController
@RequestMapping("cliente")
public class ClienteController {
    
    @RequestMapping(value="{id}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public Cliente getCliente(@PathVariable int id) throws PersistentException {
        

        
        return DigitalSignageFacade.procurarCliente(id);
    }
    @RequestMapping(method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public Cliente[] getAllClientes() throws PersistentException{
    return DigitalSignageFacade.getAllClientes();
    }
    
    @RequestMapping(method=RequestMethod.POST)
    public void insertCliente(@RequestBody Cliente c) throws PersistentException{
        
        DigitalSignageFacade.inserirCliente(c);
    
    }
    
}
