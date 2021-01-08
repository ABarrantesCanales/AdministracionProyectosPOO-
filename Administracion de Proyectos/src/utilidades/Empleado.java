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
public class Empleado {
    
    private double salario;
    private String nombreEmpleado;
    private int ced;
    private ArrayList<Proyecto> proyectos;
    private Departamento departamento;

    //Constructor usado para la clase jefe
    public Empleado(double salario, String nombreEmpleado, int ced) {
        this.salario = salario;
        this.nombreEmpleado = nombreEmpleado;
        this.ced = ced;
    }    
    
    public Empleado(double salario, String nombreEmpleado, int ced, Departamento depa) {
        this.salario = salario;
        this.nombreEmpleado = nombreEmpleado;
        this.ced = ced;
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

    public double getSalario() {
        return salario;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public int getCed() {
        return ced;
    }

    public ArrayList<Proyecto> getProyectos() {
        return proyectos;
    }

    public Departamento getDepartamento() {
        return departamento;
    }
    
    //Setters

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public void setCed(int ced) {
        this.ced = ced;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    
}
