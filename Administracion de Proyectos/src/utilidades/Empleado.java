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
    public ArrayList<Proyecto> proyectos;

    public Empleado(double salario, String nombreEmpleado, int ced) {
        this.salario = salario;
        this.nombreEmpleado = nombreEmpleado;
        this.ced = ced;
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public int getCed() {
        return ced;
    }

    public void setCed(int ced) {
        this.ced = ced;
    }
    
}
