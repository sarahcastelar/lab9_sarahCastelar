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
public class EmpleadosArea  {
    private String nombre;
    private String idEmpresa;
    private String contrasena;
    private String salario;
    private String puesto;
    private Gerente jefe;
    private ArrayList <EmpleadosP> listaEmpleadosP = new ArrayList();

    public EmpleadosArea(String nombre, String idEmpresa, String contrasena, String salario, String puesto, Gerente jefe) {
        this.nombre = nombre;
        this.idEmpresa = idEmpresa;
        this.contrasena = contrasena;
        this.salario = salario;
        this.puesto = puesto;
        this.jefe = jefe;
    }
    
    public Gerente getJefe() {
        return jefe;
    }

    public void setJefe(Gerente jefe) {
        this.jefe = jefe;
    }

    public ArrayList<EmpleadosP> getListaEmpleadosP() {
        return listaEmpleadosP;
    }

    public void setListaEmpleados(ArrayList<EmpleadosP> listaEmpleadosP) {
        this.listaEmpleadosP = listaEmpleadosP;
    }
    
    
    @Override
    public String toString() {
        return nombre;
    }
    
}
