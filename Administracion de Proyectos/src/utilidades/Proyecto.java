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
public class Proyecto {
    private String nombre;
    private double presupuesto;
    private int cargaTrabajo;
    private Date fechaInicio;
    private ArrayList <Tarea> tareas;
    public Jefe jefe;
    public Departamento departamento;
    public Empleado empleado;
    public Recursos recursos;

    public Proyecto(String nombre, float presupuesto, int cargaTrabajo, Date fechaInicio, ArrayList<Tarea> tareas) {
        this.nombre = nombre;
        this.presupuesto = presupuesto;
        this.cargaTrabajo = cargaTrabajo;
        this.fechaInicio = fechaInicio;
        this.tareas = tareas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(float presupuesto) {
        this.presupuesto = presupuesto;
    }

    public float getCargaTrabajo() {
        return cargaTrabajo;
    }

    public void setCargaTrabajo(int cargaTrabajo) {
        this.cargaTrabajo = cargaTrabajo;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public ArrayList<Tarea> getTareas() {
        return tareas;
    }

    public void setTareas(ArrayList<Tarea> tareas) {
        this.tareas = tareas;
    }
    
}
