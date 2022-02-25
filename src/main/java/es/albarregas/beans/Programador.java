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
@Table(name = "programadores")
//@DiscriminatorValue solo está presente en SINGLE_TABLE
//@DiscriminatorValue(value = "Programador")
@PrimaryKeyJoinColumn(name = "IdPersona", foreignKey = @ForeignKey(name = "FK_programadores_personas"))
public class Programador extends Tecnologo implements Serializable {

    protected String lenguajeFavorito;
    protected Integer aniosDeExperiencia;

    public Programador() {
    }

    public Programador(String lenguajeFavorito, Integer aniosDeExperiencia, Integer aniosDeEstudios, Integer id, Date edad, String nombre) {
        super(aniosDeEstudios, id, edad, nombre);
        this.lenguajeFavorito = lenguajeFavorito;
        this.aniosDeExperiencia = aniosDeExperiencia;
    }

    public String getLenguajeFavorito() {
        return lenguajeFavorito;
    }

    public void setLenguajeFavorito(String lenguajeFavorito) {
        this.lenguajeFavorito = lenguajeFavorito;
    }

    public Integer getAniosDeExperiencia() {
        return aniosDeExperiencia;
    }

    public void setAniosDeExperiencia(Integer aniosDeExperiencia) {
        this.aniosDeExperiencia = aniosDeExperiencia;
    }

}
