/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.util.ArrayList;
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
    private double horasRequeridas;
    private Date fechaEntrega;
    private boolean estado;
    private boolean requerimientos;
    private ArrayList<Tarea> listaRequerimientos;

    public Tarea(String nombre, String Descripcion, Date fechaEntrega, double duracion, double horasR, boolean requerimientos) {
        this.nombre = nombre;
        this.Descripcion = Descripcion;
        this.fechaEntrega = fechaEntrega;
        this.indentificador++;
        this.duracion = duracion;
        this.horasRequeridas = horasR;
        this.estado = false;
        this.requerimientos = requerimientos;
        if(requerimientos){
            this.listaRequerimientos = new ArrayList<>();
        }
    }
    
    public void addRequerimiento(Tarea t){
        this.listaRequerimientos.add(t);
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

    public boolean getEstado() {
        return estado;
    }
    
    public ArrayList<Tarea> getRequerimientos(){
        return listaRequerimientos; 
    }
    
    //Setters
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
}
