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
public class Usuario {
    private String usuario;
    private String contrasegna;

    public Usuario(String usuario, String contrasegna) {
        this.usuario = usuario;
        this.contrasegna = contrasegna;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContrasegna() {
        return contrasegna;
    }
    
    
}
