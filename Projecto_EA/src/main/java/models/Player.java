/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import javax.persistence.Column;
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
@Table(name = "player")
public class Player {
   @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int ID;
   @Column(name="Nome", nullable=true, length=255)	
	private String Nome;
	
	@Column(name="Descricao", nullable=true, length=255)	
	private String Descricao;
	
	@Column(name="Tamanho", nullable=false)	
	private double Tamanho;
	
	@Column(name="Estado", nullable=true, length=255)	
	private String Estado;
}
