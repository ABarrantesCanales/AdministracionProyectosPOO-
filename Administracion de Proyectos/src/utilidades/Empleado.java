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
public class Empleado {
    //private double [] cantidadEmpleados;
    private double salario;
    private String nombreEmpleado;
    private int ced;
    public Proyecto proyecto;

    public Empleado(double salario, String nombreEmpleado, int ced) {
       // this.cantidadEmpleados = cantidadEmpleados;
        this.salario = salario;
        this.nombreEmpleado = nombreEmpleado;
        this.ced = ced;
    }

//    public double[] getCantidadEmpleados() {
//        return cantidadEmpleados;
//    }
//
//    public void setCantidadEmpleados(double[] cantidadEmpleados) {
//        this.cantidadEmpleados = cantidadEmpleados;
//    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public int getCed() {
        return ced;
    }

    public void setCed(int ced) {
        this.ced = ced;
    }
    
}
