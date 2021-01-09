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
    
    private String materiales;
    private String empresa;
    private String persona;
    public Empresa empresas;
    public Proyecto proyecto;

    public Recursos(String materiales, String empresa, String persona) {
        this.materiales = materiales;
        this.empresa = empresa;
        this.persona = persona;
    }

    public String getMateriales() {
        return materiales;
    }

    public void setMateriales(String materiales) {
        this.materiales = materiales;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }
    
}
