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
@Table(name = "normales")
//@DiscriminatorValue solo está presente en SINGLE_TABLE
//@DiscriminatorValue(value="Normal")
@PrimaryKeyJoinColumn(name = "IdPersona", foreignKey = @ForeignKey(name = "FK_normales_personas"))
public class Normal extends Persona implements Serializable {

    protected String ocupacion;

    public Normal() {
    }

    public Normal(String ocupacion, Integer id, Date edad, String nombre) {
        super(id, edad, nombre);
        this.ocupacion = ocupacion;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

}
