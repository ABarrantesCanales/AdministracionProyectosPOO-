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
public class Empresa {
    private String nombre;
    private ArrayList <Proyecto> listProyecto;
    private int cedulaJuridica;
    private ArrayList <Departamento> departamentos;
    public Recursos recursos;
    public Departamento departamento;

    public Empresa(String nombre, ArrayList<Proyecto> listProyecto, int cedulaJuridica, ArrayList<Departamento> departamentos) {
        this.nombre = nombre;
        this.listProyecto = listProyecto;
        this.cedulaJuridica = cedulaJuridica;
        this.departamentos = departamentos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Proyecto> getListProyecto() {
        return listProyecto;
    }

    public void setListProyecto(ArrayList<Proyecto> listProyecto) {
        this.listProyecto = listProyecto;
    }

    public int getCedulaJuridica() {
        return cedulaJuridica;
    }

    public void setCedulaJuridica(int cedulaJuridica) {
        this.cedulaJuridica = cedulaJuridica;
    }

    public ArrayList<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(ArrayList<Departamento> departamentos) {
        this.departamentos = departamentos;
    }
    
}
