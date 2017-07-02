/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author joaof
 */
@Entity
@Table(name = "conteudo")
public class Conteudo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int ID;
    
}
