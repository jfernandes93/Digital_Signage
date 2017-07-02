/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restapi;

import models.Canal;
import DAO.CanalDAO;
import org.orm.PersistentException;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author joaof
 */
@RestController
@RequestMapping("canal")
public class CanalController {
    
    @RequestMapping(value="{id}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Canal getCliente(@PathVariable int id) throws PersistentException  {
        return CanalDAO.getCanalByORMID(id);
    }
    
    @RequestMapping(method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Canal[] getAllCanais() throws PersistentException {
        return CanalDAO.listCanalByQuery(null, null);
    }
    @RequestMapping(method=RequestMethod.POST)
    public void insertCanal(@RequestBody Canal c) throws PersistentException {
        CanalDAO.save(c);
    
    }
    
}