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
    private int cedulaJuridica;
    private ArrayList<Recursos> listaRecursos;
    private ArrayList <Proyecto> listaProyectos;
    private ArrayList <Departamento> listaDepartamentos;
    private ArrayList<Empleado> listaEmpleados;
    public static Empresa instancia;
    
    /*
    Se aplica el patron de disegno Singleton para asi tener acceso a los datos de 
    la empresa en todas las clases.
    */
    public static Empresa getInstance(){
        if(instancia == null){
            instancia = new Empresa();
        }
        return instancia;
    }
    
    public void setData(String nombre, ArrayList<Proyecto> listProyecto, int cedulaJuridica){
        this.nombre = nombre;
        this.listaProyectos = listProyecto;
        this.cedulaJuridica = cedulaJuridica;
        this.listaDepartamentos = new ArrayList<>();
        this.listaEmpleados = new ArrayList<>();
        this.listaProyectos = new ArrayList<>();
        this.listaRecursos = new ArrayList<>();
        
    }
    
    //Empleados
    public void addEmpleado(Empleado em){
        listaEmpleados.add(em);
    }
    
    public Empleado buscarEmpleado(Empleado em){
        if(listaEmpleados.isEmpty()){
            return null;
        }
        if(listaEmpleados.contains(em)){
            return em;
        }
        return null;
    }

    //Departamentos
    public void addDepartamento(Empleado dep){
        listaEmpleados.add(dep);
    }
    
    public Departamento buscarDepartamento(Departamento dep){
        if(listaDepartamentos.isEmpty()){
            return null;
        }
        if(listaDepartamentos.contains(dep)){
            return dep;
        }
        return null;
    }
    //Proyectos
    public void addProyecto(Proyecto p){
        listaProyectos.add(p);
    }
    
    public Proyecto buscarProyecto(Proyecto p){
        if(listaProyectos.isEmpty()){
            return null;
        }
        if(listaProyectos.contains(p)){
            return p;
        }
        return null;
    }
    
    //Recursos
    public void addRecurso(Recursos r){
        listaRecursos.add(r);
    }
    
    public Recursos buscarRecurso(Recursos r){
        if(listaRecursos.isEmpty()){
            return null;
        }
        if(listaRecursos.contains(r)){
            return r;
        }
        return null;
    }
    
    //Getters

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Recursos> getListaRecursos() {
        return listaRecursos;
    }

    public ArrayList<Proyecto> getListaProyectos() {
        return listaProyectos;
    }

    public ArrayList<Departamento> getListaDepartamentos() {
        return listaDepartamentos;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }
    
    //Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedulaJuridica(int cedulaJuridica) {
        this.cedulaJuridica = cedulaJuridica;
    }
    
}
