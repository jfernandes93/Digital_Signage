/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import models.Rede;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;


/**
 *
 * @author joaof
 */
@Entity
@Table(name = "cliente")
public class Cliente {

    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idCliente")	
    private int idCliente;

    @Column(name = "Nome", nullable = true, length = 255)
    private String Nome;

    @Column(name = "NIF", nullable = true, length = 10)
    private int NIF;

    @Column(name = "Email", nullable = true, length = 255)
    private String Email;

    @Column(name = "Password", nullable = true, length = 255)
    private String Password;
    
    @OneToMany	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.ALL, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
    @JoinColumn(name="ClienteID")
    private Set<Rede> redes;
    
    @OneToMany	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.ALL, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
    @JoinColumn(name="ClienteID")
    private Set<Canal> canais;
    
    public Cliente(){
        this.redes=new HashSet<>();
        this.canais=new HashSet<>();
    }
    
    /**
     * @return the ID
     */
    public int getID() {
        return idCliente;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.idCliente = ID;
    }

    /**
     * @return the canais
     */
    public Set<Canal> getCanais() {
        return canais;
    }

    /**
     * @param canais the canais to set
     */
    public void setCanais(Set<Canal> canais) {
        this.canais = canais;
    }


    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getNIF() {
        return NIF;
    }

    public void setNIF(int NIF) {
        this.NIF = NIF;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public Set getRedes() {
        return redes;
    }

    public void setRedes(Set ORM__rede) {
        this.redes = ORM__rede;
    }
    
    
}
