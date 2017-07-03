/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restapi;

import models.Canal;
import DAO.CanalDAO;
import models.Cliente;
import DAO.ClienteDAO;
import DAO.DigitalSignageFacade;
import models.Player;
import DAO.PlayerDAO;
import models.Rede;
import DAO.RedeDAO;
import org.orm.PersistentException;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("player")
public class PlayerController {
    @Autowired
    private DigitalSignageFacade facade;
    @RequestMapping(value="{id}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Player getPlayer(@PathVariable int id) throws PersistentException{
        return facade.procurarPlayer(id);
    }
    
    @RequestMapping(method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Player[] getAllPlayers() throws PersistentException  {
        return facade.getAllPlayers();
    }
    @RequestMapping(method=RequestMethod.POST)
    public void insertPlayer(@RequestBody Player p) throws PersistentException {
        facade.inserirPlayer(p);
    
    }
    
}
