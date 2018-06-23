/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class adminMensajes {
    
     private ArrayList <Mensajes> listaMensajes = new ArrayList();
    private File archivo = null;

    public adminMensajes(String path) {
        archivo = new File(path);
    }

    public ArrayList<Mensajes> getListaMensajes() {
        return listaMensajes;
    }

    public void setListaMensajes(ArrayList<Mensajes> listaMensajes) {
        this.listaMensajes = listaMensajes;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setMensaje(Mensajes a){
        listaMensajes.add(a);
    }
    
    public void cargarArchivo(){
        try {
            listaMensajes = new ArrayList();
            Mensajes temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while((temp = (Mensajes) objeto.readObject()) != null){
                        listaMensajes.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public void escribirArchivo(){
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Mensajes t : listaMensajes) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception e) {
        }finally{
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }
        
    }
}
