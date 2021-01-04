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
    private ArrayList<Tarea> tareas;
    private Jefe jefe;
    public Departamento departamento;
    public ArrayList<Empleado> empleados;
    public ArrayList<Recursos> recursos;

    public Proyecto(String nombre, Date fechaInicio, Departamento depa) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.departamento = depa;
        this.empleados = new ArrayList<>();
        this.recursos = new ArrayList<>();
        this.tareas = new ArrayList<>();
    }
    
    public boolean anadirEmpleado(Empleado e){
        if(empleados.contains(e)){
            return false;
        }
        empleados.add(e);
        return true;
    }
    
    public boolean anadirTarea(Tarea t){
        if(tareas.contains(t)){
            return false;
        }
        tareas.add(t);
        return true;
    }
    
    public boolean anadirRecurso(Recursos r){
        if(recursos.contains(r)){
            return false;
        }
        recursos.add(r);
        return true;
    }
    
    public Tarea getTarea(int id){
        if(!tareas.isEmpty()){
            for(Tarea t: tareas){
                if(t.getIndentificador() == id){
                    return t;
                }
            }
        }
        return null;
    }
    
    public Empleado getEmpleado(int id){
        if(!empleados.isEmpty()){
            for(Empleado e: empleados){
                if(e.getCed() == id){
                    return e;
                }
            }
        }
        return null;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public int getCargaTrabajo() {
        return cargaTrabajo;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public ArrayList<Tarea> getTareas() {
        return tareas;
    }

    public Jefe getJefe() {
        return jefe;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public ArrayList<Recursos> getRecursos() {
        return recursos;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public void setCargaTrabajo(int cargaTrabajo) {
        this.cargaTrabajo = cargaTrabajo;
    }

    public void setJefe(Jefe jefe) {
        this.jefe = jefe;
    }

    
}
