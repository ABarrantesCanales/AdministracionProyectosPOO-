/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

/**
 *
 * @author josue
 */

//Clase usada para implementar el patron factory en los objetos jefe y empleado
public abstract class Persona {
    private double salario;
    private String nombreEmpleado;
    private int ced;

    public Persona(double salario, String nombreEmpleado, int ced) {
        this.salario = salario;
        this.nombreEmpleado = nombreEmpleado;
        this.ced = ced;
    }

    public double getSalario() {
        return salario;
    }

    public String getNombre() {
        return nombreEmpleado;
    }

    public int getCed() {
        return ced;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setNombre(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public void setCed(int ced) {
        this.ced = ced;
    }
    
    
}
