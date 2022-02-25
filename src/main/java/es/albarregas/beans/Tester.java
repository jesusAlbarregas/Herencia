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
@Table(name = "testers")
//@DiscriminatorValue solo está presente en SINGLE_TABLE
//@DiscriminatorValue(value = "Tester")
@PrimaryKeyJoinColumn(name = "IdPersona", foreignKey = @ForeignKey(name = "FK_testers_personas"))
public class Tester extends Tecnologo implements Serializable {

    protected String herramientaDeTesteo;

    public Tester() {
    }

    public Tester(String herramientaDeTesteo, Integer aniosDeEstudios, Integer id, Date edad, String nombre) {
        super(aniosDeEstudios, id, edad, nombre);
        this.herramientaDeTesteo = herramientaDeTesteo;
    }

    public String getHerramientaDeTesteo() {
        return herramientaDeTesteo;
    }

    public void setHerramientaDeTesteo(String herramientaDeTesteo) {
        this.herramientaDeTesteo = herramientaDeTesteo;
    }

}
