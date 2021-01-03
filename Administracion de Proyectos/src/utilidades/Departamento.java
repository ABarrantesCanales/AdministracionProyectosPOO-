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
    private ArrayList <Proyecto> proyectos;
    private String [] nombreDepartamento;
    private float presupuesto;
    private float cargaTrabajo;
    public Proyecto proyecto;

    public Departamento(ArrayList<Proyecto> proyectos, String[] nombreDepartamento, float presupuesto, float cargaTrabajo) {
        this.proyectos = proyectos;
        this.nombreDepartamento = nombreDepartamento;
        this.presupuesto = presupuesto;
        this.cargaTrabajo = cargaTrabajo;
    }

    public ArrayList<Proyecto> getProyectos() {
        return proyectos;
    }

    public void setProyectos(ArrayList<Proyecto> proyectos) {
        this.proyectos = proyectos;
    }

    public String[] getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String[] nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public float getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(float presupuesto) {
        this.presupuesto = presupuesto;
    }

    public float getCargaTrabajo() {
        return cargaTrabajo;
    }

    public void setCargaTrabajo(float cargaTrabajo) {
        this.cargaTrabajo = cargaTrabajo;
    }
    
}
