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
    private ArrayList<Proyecto> listaProyectos;
    private ArrayList<Departamento> listaDepartamentos;
    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Jefe> listaJefes;
    private static Empresa instancia;
    
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
        this.listaJefes = new ArrayList<>();
        
    }
    
    //Empleados
    public boolean addEmpleado(Empleado em){
        if(buscarEmpleado(em.getCed()) == null){
            listaEmpleados.add(em);
            return true;
        }
        return false;
    }
    
    public void addJefe(Jefe j){
        listaJefes.add(j);
    }
    
    public Empleado buscarEmpleado(int id){
        if(listaEmpleados.isEmpty()){
            return null;
        }
        for(Empleado e: listaEmpleados){
            if(e.getCed() == id){
                return e;
            }
        }
        return null;
    }
    
    public Empleado buscarEmpleadoNombre(String name){
        if(listaEmpleados.isEmpty()){
            return null;
        }
        for(Empleado e: listaEmpleados){
            if(e.getNombre().equals(name)){
                return e;
            }
        }
        return null;
    }

    //Departamentos
    public boolean addDepartamento(Departamento dep){
        if(buscarDepartamento(dep.getNombreDepartamento()) == null){
            listaDepartamentos.add(dep);
            return true;
        }
        return false;
    }
    
    public Departamento buscarDepartamento(String dep){
        if(listaDepartamentos.isEmpty()){
            return null;
        }
        for(Departamento d: listaDepartamentos){
            if(d.getNombreDepartamento().equals(dep)){
                return d;
            }
        }
        return null;
    }
    //Proyectos
    public boolean addProyecto(Proyecto p){
        if(buscarProyecto(p.getNombre()) == null){
            listaProyectos.add(p);
            return true;
        }
        return false;
    }
    
    public Proyecto buscarProyecto(String pro){
        if(listaProyectos.isEmpty()){
            return null;
        }
        for(Proyecto p: listaProyectos){
            if(p.getNombre().equals(pro)){
                return p;
            }
        }
        return null;
    }
    
    //Recursos
    public boolean addRecurso(Recursos r){
        if(buscarRecurso(r.getNombre()) == null){
            listaRecursos.add(r);
            return true;
        }
        return false;
    }
    
    public Recursos buscarRecurso(String ree){
        if(listaRecursos.isEmpty()){
            return null;
        }
        for(Recursos r: listaRecursos){
            if(r.getNombre().equals(ree)){
                return r;
            }
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
    
    public ArrayList<Jefe> getListaJefes(){
        return listaJefes;
    }
    
    //Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedulaJuridica(int cedulaJuridica) {
        this.cedulaJuridica = cedulaJuridica;
    }
    
}
