/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.util.Date;

/**
 *
 * @author Ignacio Brenes
 */
public class Tarea {
    private String nombre;
    private String Descripcion;
    private int indentificador = 0;
    private double duracion;
    private Date fechaEntrega;
    private boolean estado;

    public Tarea(String nombre, String Descripcion, Date fechaEntrega) {
        this.nombre = nombre;
        this.Descripcion = Descripcion;
        this.fechaEntrega = fechaEntrega;
        this.indentificador++;
        this.duracion = 0;
        this.estado = false;
    }
    
    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public int getIndentificador() {
        return indentificador;
    }

    public double getDuracion() {
        return duracion;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public boolean isEstado() {
        return estado;
    }
    
    //Setters

    public void addDuracion(double duracion) {
        this.duracion += duracion;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    

    
}
