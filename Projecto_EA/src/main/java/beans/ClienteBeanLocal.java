/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.ejb.Local;
import models.Cliente;

/**
 *
 * @author joaof
 */

public interface ClienteBeanLocal {
    Cliente getCliente(int id);
    Cliente[]getClientes();
    String getId();
    void inserirCliente(Cliente c);
}
