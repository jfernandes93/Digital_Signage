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
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author joaof
 */
@RestController
@RequestMapping("player")
public class PlayerController {
    @Autowired
    private DigitalSignageFacade facade;
    @CrossOrigin
    @RequestMapping(value="{id}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Player getPlayer(@PathVariable int id) throws PersistentException{
        return facade.procurarPlayer(id);
    }
    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Player[] getAllPlayers() throws PersistentException  {
        return facade.getAllPlayers();
    }
    @CrossOrigin
    @RequestMapping(method=RequestMethod.POST)
    public void insertPlayer(@RequestBody Player p) throws PersistentException {
        facade.inserirPlayer(p);
    
    }
    
}
