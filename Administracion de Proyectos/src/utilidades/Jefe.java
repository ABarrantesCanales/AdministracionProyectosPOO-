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
    private ArrayList cantProyectos;
    public Proyecto proyecto;

    public Jefe(ArrayList<Proyecto> canProyectos, String usuario, String contra) {
        super(usuario, contra);
        this.cantProyectos = canProyectos;
    }

    public ArrayList<Proyecto> getCanProyectos() {
        return cantProyectos;
    }

    public void setCanProyectos(ArrayList proyectos) {
        cantProyectos.add(proyectos);
    }
    
}
 
