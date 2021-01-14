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
public class Jefe extends Persona{
    private ArrayList<Proyecto> Proyectos;
    private boolean check;
    private String usuario;
    private String contrasegna;
    

    //Constructor usado para jefe de proyecto
    public Jefe(double salario, String nombreEmpleado, int ced, String usuario, String contra) {
        super(salario, nombreEmpleado, ced);
        this.usuario = usuario;
        this.contrasegna = contra;
        this.check = false;
        Proyectos = new ArrayList<>();
    }
    
    //Constructor usado para jefe de la empresa, que puede ver diferentes reportes y datos
//    public Jefe(double salario, String nombreEmpleado, int ced, String usuario, String contra, boolean check) {
//        super(salario, nombreEmpleado, ced);
//        this.check = check;
//        this.usuario = usuario;
//        this.contrasegna = contra;
//    }
        
    public ArrayList<Proyecto> getProyectos() {
        return Proyectos;
    }
    
    public boolean getCheck(){
        return check;
    }

    public boolean anadeProyecto(Proyecto proyecto){
        if(Proyectos.isEmpty()){
            Proyectos.add(proyecto);
            return true;
        }else if(Proyectos.size() < 2){
            Proyectos.add(proyecto);
            return true;
        }
        return false;
    }
    
    public Proyecto getProyecto(String nombre){
        if(!Proyectos.isEmpty()){
            for(Proyecto p: Proyectos){
                if(p.getNombre().equals(nombre)){
                    return p;
                }
            }
        }
        return null;
    }
    
}
 
