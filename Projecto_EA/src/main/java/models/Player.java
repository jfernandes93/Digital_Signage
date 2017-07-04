/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import javax.persistence.*;

/**
 *
 * @author joaof
 */
@Entity
@Table(name = "player")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idPlayer")
    private int idPlayer;
    @Column(name = "Nome", nullable = false, unique = true, length = 255)
    private String Nome;
    @Column(name = "Password", nullable = true, length = 255)
    private String Password;

    @Column(name = "Descricao", nullable = true, length = 255)
    private String Descricao;


    @Column(name = "Estado", nullable = true, length = 255)
    private String Estado;
    
    @Column(name = "Latitude", nullable = false)
    private double Latitude;
    
    @Column(name = "Longitude", nullable = false)
    private double Longitude;

    @ManyToOne
    @JoinColumn(name="CanalID")
    private Canal canal;


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

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public int getIdPlayer() {
        return idPlayer;
    }

    public void setIdPlayer(int idPlayer) {
        this.idPlayer = idPlayer;
    }

    public double getLatitude() {
        return Latitude;
    }

    public void setLatitude(double Latitude) {
        this.Latitude = Latitude;
    }

    public double getLongitude() {
        return Longitude;
    }

    public void setLongitude(double Longitude) {
        this.Longitude = Longitude;
    }


    public Canal getCanal() {
        return canal;
    }

    public void setCanal(Canal canal) {
        this.canal = canal;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
