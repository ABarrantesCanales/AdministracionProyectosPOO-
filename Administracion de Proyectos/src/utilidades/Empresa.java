/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Ignacio Brenes
 */
public class Empresa implements Serializable{
    private String nombre;
    private ArrayList <Proyecto> listProyecto;
    private ArrayList <Departamento> departamentos;
    private ArrayList<Empleado> listaEmpleados;
    private int cedulaJuridica;
    public Recursos recursos;
    public Departamento departamento;
    public static Empresa singletonObj;
    
    /*
    Se declara la empresa como un objeto singleton para asi tener acceso a sus datos en todas las clases
    */
    public static synchronized Empresa getProyecto(){
        if(singletonObj == null){
            singletonObj = new Empresa();
        }
        return singletonObj;
    }
    
    public void setData(String nombre, ArrayList<Proyecto> listProyecto, int cedulaJuridica, ArrayList<Departamento> departamentos){
        this.nombre = nombre;
        this.listProyecto = listProyecto;
        this.cedulaJuridica = cedulaJuridica;
        this.departamentos = departamentos;
        this.listaEmpleados = new ArrayList<>();
    }
    
    
//
//    public Empresa(String nombre, ArrayList<Proyecto> listProyecto, int cedulaJuridica, ArrayList<Departamento> departamentos) {
//        this.nombre = nombre;
//        this.listProyecto = listProyecto;
//        this.cedulaJuridica = cedulaJuridica;
//        this.departamentos = departamentos;
//    }
    
    public void addEmpleado(Empleado e){
        listaEmpleados.add(e);
    }
    
    public ArrayList<Empleado> getEmpleados(){
        return listaEmpleados;
    }
    
    public Empleado buscarEmpleado(Empleado e){
        if(listaEmpleados.isEmpty()){
            return null;
        }
        if(listaEmpleados.contains(e)){
            return e;
        }
        return null;
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
