/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



/**
 *
 * @author jesus
 */
@Entity
@Table(name = "personas")
//El valor por default del atributo "strategy" en @Inheritance es "InheritanceType.SINGLE_TABLE"
//@Inheritance
@Inheritance(strategy = InheritanceType.JOINED)
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@DiscriminatorColumn solo está presente en SINGLE_TABLE
//Si no indicamos nada el nombre de la columna será "DTYPE" y el tipo será "String", por lo tanto es opcional
//@DiscriminatorColumn(name="DISC", discriminatorType = DiscriminatorType.STRING)
public abstract class Persona implements Serializable {

    @Id
    //Para herencia SINGLE_TABLE o JOINED usaremos IDENTITY
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Para la herencia TABLE_PER_CLASS es obligatorio GenerationType.TABLE
//    @GeneratedValue(strategy = GenerationType.TABLE)
    protected Integer id;
    @Temporal(TemporalType.DATE)
    protected Date fechNac;
    protected String nombre;

    public Persona() {
    }

    public Persona(Integer id, Date fechNac, String nombre) {
        this.id = id;
        this.fechNac = fechNac;
        this.nombre = nombre;
    }

    public Date getFechNac() {
        return fechNac;
    }

    public void setFechNac(Date fechNac) {
        this.fechNac = fechNac;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
