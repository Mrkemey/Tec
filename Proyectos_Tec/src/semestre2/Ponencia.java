/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semestre2;
import static proyectos_tec.EjerciciosU3.*;
import static javax.swing.JOptionPane.*;

/**
 *
 * @author jmanu
 */
public class Ponencia {
    private String clave,titulo;
    private int dur;
    public Ponencia(){
        clave=titulo="";
        dur=0;
    }
    public Ponencia(String c, String t, int d){
        clave=c;
        titulo=t;
        dur=d;
    }
    public String getClave(){
        return clave;
    }
    public String getTitulo(){
        return titulo;
    }
    public int getDur(){
        return dur;
    }
    public void leer(){
        clave=showInputDialog("Clave");
        titulo=showInputDialog("Titulo");
        dur=leerEntero("Duracion (minutos)");
    }
    @Override
    public String toString(){
        return clave+" - "+titulo+" - "+dur;
    }
}
