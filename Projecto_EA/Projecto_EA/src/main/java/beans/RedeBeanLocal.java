/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import models.Rede;

/**
 *
 * @author joaof
 */
public interface RedeBeanLocal {
    Rede getRede(int id);
    Rede[]getRedes();
    
    void inserirRede(Rede r);
}
