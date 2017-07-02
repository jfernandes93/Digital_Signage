
import models.Canal;
import DAO.CanalDAO;
import models.Cliente;
import DAO.ClienteDAO;
import models.Conteudo;
import DAO.ConteudoDAO;
import models.Rede;
import DAO.RedeDAO;
import models.Tipo;
import DAO.TipoDAO;
import java.util.HashSet;
import java.util.Set;
import org.orm.PersistentException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joaof
 */
public class Teste {
    public static void main(String[] args) throws PersistentException {
        Cliente cli=new Cliente();
        Canal c=new Canal();
        HashSet<Canal> canais=new HashSet<>();
        canais.add(c);
        cli.setCanais(canais);
        ClienteDAO.save(cli);
        
       
    }
}
