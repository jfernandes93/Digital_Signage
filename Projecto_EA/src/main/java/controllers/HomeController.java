/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

/**
 *
 * @author joaof
 */
import models.Cliente;
import DAO.ClienteDAO;
import org.orm.PersistentException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller
@RequestMapping("/")
public class HomeController {
    
    @RequestMapping(method = RequestMethod.GET)
    public String sayHello(ModelMap model) {
        return "index";
    }
    
    @RequestMapping(value="ClienteList",method = RequestMethod.GET)
    public String clientlist(ModelMap model){
        return "ClienteList";
    }
    @RequestMapping(value="Conteudo",method = RequestMethod.GET)
    public String canal(ModelMap model){
        return "Conteudo";
    }
    @RequestMapping(value="Cliente",method = RequestMethod.GET)
    public String client(ModelMap model){
        return "Cliente";
    }
    @RequestMapping(value="Cliente",method = RequestMethod.POST)
    public void addclient(@ModelAttribute("Cliente")Cliente cliente) throws PersistentException{
        System.out.println("1");
        Cliente c=new Cliente();
        c.setNome(cliente.getNome());
        c.setNIF(cliente.getNIF());
        c.setPassword(cliente.getPassword());
        c.setEmail(cliente.getEmail());
        
        ClienteDAO.save(c);
    }
    
 
}
