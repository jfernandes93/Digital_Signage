/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;


import models.Cliente;

/**
 *
 * @author joaof
 */

public interface ClienteBeanLocal {
    Cliente getCliente(int id);
    Cliente[]getClientes();
    
    void inserirCliente(Cliente c);
}
