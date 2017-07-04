/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restapi;

import models.Canal;
import DAO.CanalDAO;
import DAO.DigitalSignageFacade;
import beans.CanalBeanLocal;
import org.orm.PersistentException;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author joaof
 */
@RestController
@CrossOrigin
@RequestMapping("canal")
public class CanalController {
    @Autowired
    private DigitalSignageFacade facade;
    @RequestMapping(value="{id}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Canal getCanal(@PathVariable int id) throws PersistentException  {
        return facade.procurarCanal(id);
    }
    
    @RequestMapping(method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Canal[] getAllCanais() throws PersistentException {
        return facade.getAllCanais();
    }
    @RequestMapping(method=RequestMethod.POST)
    public void insertCanal(@RequestBody Canal c) throws PersistentException {
        //CanalDAO.save(c);
        facade.inserirCanal(c);
    }
    
}
