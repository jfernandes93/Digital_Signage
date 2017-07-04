/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;
import org.hibernate.annotations.CascadeType;
/**
 *
 * @author joaof
 */
@Entity
@Table(name = "canal")
public class Canal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idCanal;

    @Column(name = "Descricao", nullable = true, length = 255)
    private String Descricao;

    @Column(name = "Nome", nullable = true, length = 255)
    private String Nome;
    @OneToMany
    @org.hibernate.annotations.Cascade({CascadeType.SAVE_UPDATE, CascadeType.LOCK})
    @org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)
    @JoinColumn(name = "CanalID")
    @JsonIgnore
    private Set<Player> players;
    
    
    @OneToMany	
	@org.hibernate.annotations.Cascade(CascadeType.ALL)
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
    @JoinColumn(name="CanalID")

    private Set<Conteudo> conteudos;
    
    
    public Canal(){
        this.conteudos=new HashSet<>();
        this.players=new HashSet<>();
    }
    public int getID() {
        return idCanal;
    }

    public void setID(int ID) {
        this.idCanal = ID;
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

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }
    

}
