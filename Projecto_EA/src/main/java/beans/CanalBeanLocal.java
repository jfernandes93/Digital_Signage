/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;


import models.Canal;
import models.Player;

/**
 *
 * @author Daniel
 */
public interface CanalBeanLocal {
    Canal getCanal(int id);
    Player[] getPlayers();
    Canal[] getCanais();
    
    void inserirCanal(Canal c);
}
