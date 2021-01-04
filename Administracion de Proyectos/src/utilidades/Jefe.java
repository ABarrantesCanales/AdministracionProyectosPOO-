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
public class Jefe extends Usuario{
    private ArrayList<Proyecto> Proyectos;

    public Jefe(String usuario, String contra) {
        super(usuario, contra);
        Proyectos = new ArrayList<>();
    }

    public ArrayList<Proyecto> getProyectos() {
        return Proyectos;
    }

    public boolean addProyecto(Proyecto proyecto){
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
 
