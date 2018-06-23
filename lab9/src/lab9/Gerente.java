/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Gerente {
    
    private String nombre;
    private String idEmpresa;
    private String contrasena;
    private String salario;
    private String puesto;
    private ArrayList <EmpleadosArea> listaEmpleadosArea = new ArrayList();

    public Gerente(String nombre, String idEmpresa, String contrasena, String salario, String puesto) {
        this.nombre = nombre;
        this.idEmpresa = idEmpresa;
        this.contrasena = contrasena;
        this.salario = salario;
        this.puesto = puesto;
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

    public ArrayList<EmpleadosArea> getListaEmpleadosArea() {
        return listaEmpleadosArea;
    }

    public void setListaEmpleadosArea(ArrayList<EmpleadosArea> listaEmpleadosArea) {
        this.listaEmpleadosArea = listaEmpleadosArea;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
