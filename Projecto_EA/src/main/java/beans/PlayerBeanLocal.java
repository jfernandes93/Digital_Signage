/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import models.Player;

/**
 *
 * @author joaof
 */
public interface PlayerBeanLocal {
    Player getPlayer(int id);
    Player[]getPlayers();
    
    void inserirPlayer(Player p);
}
