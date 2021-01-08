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
public class Departamento {
    private ArrayList<Proyecto> proyectos; 
    private ArrayList<Empleado> empleados;
    private String nombreDepartamento;
    //private double presupuesto;
    //private float cargaTrabajo;

    public Departamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
        this.proyectos = new ArrayList<>();
        this.empleados = new ArrayList<>();
        //this.presupuesto = presupuesto;
        //this.cargaTrabajo = cargaTrabajo;
    }

    public ArrayList<Proyecto> getProyectos() {
        return proyectos;
    }

    public void addProyecto(Proyecto p){
        proyectos.add(p);
    }
    
    public ArrayList<Empleado> getEmpleados(){
        return empleados;
    }
    
    public boolean addEmpleado(Empleado e){
        if(empleados.contains(e)){
            return false;
        }
        empleados.add(e);
        return true;
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

//    public double getPresupuesto() {
//        return presupuesto;
//    }
//
//    public void setPresupuesto(double presupuesto) {
//        this.presupuesto = presupuesto;
//    }
//
//    public float getCargaTrabajo() {
//        return cargaTrabajo;
//    }
//
//    public void setCargaTrabajo(float cargaTrabajo) {
//        this.cargaTrabajo = cargaTrabajo;
//    }
    
}
