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
@Table(name = "coordenada")
public class Coordenada {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idCoordenada")
	private int idCoordenada;
    
    @Column(name = "Latitude", nullable = false)
    private double Latitude;
    
    @Column(name = "Longitude", nullable = false)
    private double Longitude;

    public int getID() {
        return idCoordenada;
    }

    public void setID(int ID) {
        this.idCoordenada = ID;
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
    
    
}
