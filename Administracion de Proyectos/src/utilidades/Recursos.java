/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

/**
 *
 * @author Ignacio Brenes
 */
public class Recursos {
    private String nombre;
    private boolean estado;
    private boolean proyecto;

    public Recursos(String nombre){
        this.nombre = nombre;
        this.estado = false;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public boolean getEstado() {
        return estado;
    }

    public boolean getProyecto() {
        return proyecto;
    }
    
    
}
