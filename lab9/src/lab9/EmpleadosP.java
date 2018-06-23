/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;

/**
 *
 * @author Usuario
 */
public class EmpleadosP {
    
    
    private String nombre;
    private String idEmpresa;
    private String contrasena;
    private String salario;
    private String puesto;
    private EmpleadosArea jefe;

    public EmpleadosP(String nombre, String idEmpresa, String contrasena, String salario, String puesto, EmpleadosArea jefe) {
        this.nombre = nombre;
        this.idEmpresa = idEmpresa;
        this.contrasena = contrasena;
        this.salario = salario;
        this.puesto = puesto;
        this.jefe = jefe;
    }  
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(String idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public EmpleadosArea getJefe() {
        return jefe;
    }

    public void setJefe(EmpleadosArea jefe) {
        this.jefe = jefe;
    }
    
    
 
    
    @Override
    public String toString() {
        return nombre;
    }
}
