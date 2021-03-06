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
    private int indentificador;
    private double duracion;
    private double horasRequeridas;
    private Date fechaEntrega;
    private boolean estado;
    private boolean requerimientos;
    private Proyecto proyecto;
    private ArrayList<Tarea> listaRequerimientos;
    private ArrayList<Empleado> responsables;

    public Tarea(String nombre, Date fechaEntrega, double duracion, double horasR, boolean requerimientos, int id, Proyecto proyecto) {
        this.nombre = nombre;
        this.fechaEntrega = fechaEntrega;
        this.indentificador++;
        this.duracion = duracion;
        this.horasRequeridas = horasR;
        this.estado = false;
        this.indentificador = id;
        this.requerimientos = requerimientos;
        this.proyecto = proyecto;
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

    public int getIndentificador() {
        return indentificador;
    }

    public double getDuracion() {
        return duracion;
    }

    public double getHorasRequeridas() {
        return horasRequeridas;
    }
    
    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public boolean getEstado() {
        return estado;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }
    
    
    public ArrayList<Tarea> getRequerimientos(){
        return listaRequerimientos; 
    }

    public ArrayList<Empleado> getResponsables() {
        return responsables;
    }
    
    
    
    //Setters
    public void setCompleta() {
        this.estado = true;
    }
    
    public void setRequerimientos(ArrayList<Tarea> requerimientos){
        this.listaRequerimientos = requerimientos;
    }
    
}
