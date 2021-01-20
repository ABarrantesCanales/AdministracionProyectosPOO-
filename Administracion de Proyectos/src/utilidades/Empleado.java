/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.util.ArrayList;

/**
 *
 * @author Ignacio Brenes
 */
public class Empleado extends Persona{
    private ArrayList<Proyecto> proyectos;
    private ArrayList<Tarea> tareas;
    private Departamento departamento;

    
    public Empleado(double salario, String nombreEmpleado, int ced, Departamento depa) {
        super(salario, nombreEmpleado, ced);
        this.departamento = depa;
        depa.addEmpleado(this);
        proyectos = new ArrayList<>();
        tareas = new ArrayList<>();
    }
    
    
    //Proyectos
    public void addProyecto(Proyecto p){
        proyectos.add(p);
    }
    
    public Proyecto buscarProyecto(String pro){
        if(proyectos.isEmpty()){
            return null;
        }
        for(Proyecto p: proyectos){
            if(p.getNombre().equals(pro)){
                return p;
            }
        }
        return null;
    }
    
    //Tareas
    public void addTarea(Tarea t){
        tareas.add(t);
    }
    
    public Tarea buscarTarea(String tarea){
        if(tareas.isEmpty()){
            return null;
        }
        for(Tarea t: tareas){
            if(t.getNombre().equals(tarea)){
                return t;
            }
        }
        return null;
    }

    //Getters

    public ArrayList<Proyecto> getProyectos() {
        return proyectos;
    }

    public ArrayList<Tarea> getTareas() {
        return tareas;
    }

    public Departamento getDepartamento() {
        return departamento;
    }
    
    
    
    //Setters
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    
}
