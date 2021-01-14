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
    }
    
    public void addProyecto(Proyecto p){
        proyectos.add(p);
    }
    
    public Proyecto buscarProyecto(Proyecto p){
        if(proyectos.isEmpty()){
            return null;
        }
        if(proyectos.contains(p)){
            return p;
        }
        return null;
    }

    //Getters

    public ArrayList<Proyecto> getProyectos() {
        return proyectos;
    }

    public Departamento getDepartamento() {
        return departamento;
    }
    
    //Setters
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    
}
