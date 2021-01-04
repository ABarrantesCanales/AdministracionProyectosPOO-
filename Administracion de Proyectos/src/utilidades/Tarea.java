/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.util.Date;

/**
 *
 * @author Ignacio Brenes
 */
public class Tarea {
    private String nombreTarea;
    private int indentificador ;
    private float duracion;
    private float tiempo;   
    private Date fechaEntrega;
    private boolean terminada;
    

    public Tarea(String nombreTarea, int indentificador, float duracion, float tiempo) {
        this.nombreTarea = nombreTarea;
        this.indentificador = indentificador;
        this.duracion = duracion;
        this.tiempo = tiempo;
    }

    public String getNombreTarea() {
        return nombreTarea;
    }

    public void setNombreTarea(String nombreTarea) {
        this.nombreTarea = nombreTarea;
    }

    public int getIndentificador() {
        return indentificador;
    }

    public void setIndentificador(int indentificador) {
        this.indentificador = indentificador;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public float getTiempo() {
        return tiempo;
    }

    public void setTiempo(float tiempo) {
        this.tiempo = tiempo;
    }
   
    public boolean estaTerminada(){
        return terminada;
    }
    
    public void setTerminada(boolean ter){
        this.terminada = ter;
    }
    
}
