/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

/**
 *
 * @author joaof
 */
@Entity

@Table(name = "rede")
public class Rede {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idRede")
	private int idRede;
	
	
	@Column(name="Descricao", nullable=true, length=255)	
	private String Descricao;
	
	@Column(name="Nome", nullable=true, length=255)	
	private String Nome;
	
        @OneToMany	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.ALL, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
    @JoinColumn(name="RedeID")
    private Set<Player> players;
	
    public Rede(){
        this.players=new HashSet<>();
    }
    
    public int getID() {
        return idRede;
    }

    public void setID(int ID) {
        this.idRede= ID;
    }


    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public Set<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Set<Player> players) {
        this.players = players;
    }

   
        
}
