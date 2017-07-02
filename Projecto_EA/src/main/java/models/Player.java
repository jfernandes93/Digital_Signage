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

        public int getID() {
        return ID;
        }

        public void setID(int ID) {
        this.ID = ID;
        }

        public String getNome() {
        return Nome;
        }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public double getTamanho() {
        return Tamanho;
    }

    public void setTamanho(double Tamanho) {
        this.Tamanho = Tamanho;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
        
        
}
