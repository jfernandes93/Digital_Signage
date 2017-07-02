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
import models.Player;
import DAO.PlayerDAO;
import models.Rede;
import DAO.RedeDAO;
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
@RequestMapping("player")
public class PlayerController {
    
    @RequestMapping(value="{id}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Player getPlayer(@PathVariable int id) throws PersistentException{
        return PlayerDAO.getPlayerByORMID(id);
    }
    
    @RequestMapping(method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Player[] getAllPlayers() throws PersistentException  {
        return PlayerDAO.listPlayerByQuery(null, null);
    }
    @RequestMapping(method=RequestMethod.POST)
    public void insertPlayer(@RequestBody Player p) throws PersistentException {
        PlayerDAO.save(p);
    
    }
    
}
