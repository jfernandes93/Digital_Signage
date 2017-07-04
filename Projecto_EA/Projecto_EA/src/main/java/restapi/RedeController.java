/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restapi;

import models.Cliente;
import DAO.ClienteDAO;
import models.Rede;
import DAO.RedeDAO;
import org.orm.PersistentException;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author joaof
 */
@RestController
@CrossOrigin
@RequestMapping("rede")
public class RedeController {
    @RequestMapping(value="{id}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public Rede getRede(@PathVariable int id) throws PersistentException {
        return RedeDAO.getRedeByORMID(id);
    }
    @RequestMapping(method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public Rede[] getAllRedes() throws PersistentException  {
        return RedeDAO.listRedeByQuery(null, null);
    }
    @RequestMapping(method=RequestMethod.POST)
    public void insertRede(@RequestBody Rede r) throws PersistentException {
        RedeDAO.save(r);
    
    }
}
