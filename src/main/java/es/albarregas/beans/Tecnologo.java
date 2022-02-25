/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 *
 * @author jesus
 */
@Entity
@Table(name = "tecnologos")
//@DiscriminatorValue solo está presente en SINGLE_TABLE
//@DiscriminatorValue(value = "Tecnologo")
@PrimaryKeyJoinColumn(name = "IdPersona", foreignKey = @ForeignKey(name = "FK_tecnologos_personas"))
public class Tecnologo extends Persona implements Serializable{

    protected Integer aniosDeEstudios;

    public Tecnologo() {
    }

    public Tecnologo(Integer aniosDeEstudios, Integer id, Date edad, String nombre) {
        super(id, edad, nombre);
        this.aniosDeEstudios = aniosDeEstudios;
    }

    public Integer getAniosDeEstudios() {
        return aniosDeEstudios;
    }

    public void setAniosDeEstudios(Integer aniosDeEstudios) {
        this.aniosDeEstudios = aniosDeEstudios;
    }

}
