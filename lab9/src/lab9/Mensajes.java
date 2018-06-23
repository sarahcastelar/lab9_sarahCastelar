/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Mensajes implements Serializable{
    
    private String destino;
    private String fuente;
    private boolean esCifrado;
    private boolean esCifradoTabla;
    private String cuerpo;
    private ArrayList <Mensajes> listaMensajes1 = new ArrayList();
    private static final long SerialVersionUID=777L;

    public Mensajes(String destino, String fuente, boolean esCifrado, boolean esCifradoTabla, String cuerpo) {
        this.destino = destino;
        this.fuente = fuente;
        this.esCifrado = esCifrado;
        this.esCifradoTabla = esCifradoTabla;
        this.cuerpo = cuerpo;
    }

    
    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getFuente() {
        return fuente;
    }

    public void setFuente(String fuente) {
        this.fuente = fuente;
    }

    public boolean isEsCifrado() {
        return esCifrado;
    }

    public void setEsCifrado(boolean esCifrado) {
        this.esCifrado = esCifrado;
    }

    public boolean isEsCifradoTabla() {
        return esCifradoTabla;
    }

    public void setEsCifradoTabla(boolean esCifradoTabla) {
        this.esCifradoTabla = esCifradoTabla;
    }

    public ArrayList<Mensajes> getListaMensajes1() {
        return listaMensajes1;
    }

    public void setListaMensajes1(ArrayList<Mensajes> listaMensajes1) {
        this.listaMensajes1 = listaMensajes1;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    
    
    
    
    
}
