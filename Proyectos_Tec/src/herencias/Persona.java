/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;

import static javax.swing.JOptionPane.*;
import static proyectos_tec.EjerciciosU3.*;
/**
 *
 * @author jmanu
 */
public class Persona {
    protected String nombre;
    protected int edad;
    public Persona(){
        nombre="Juan";
        edad=18;
    }
    public Persona(String n,int e){
        nombre=n; 
        edad=e;
    }
    void leer(){
        nombre=showInputDialog("Nombre");
        edad=leerEntero("Edad");
    }
    public String toString(){
        return nombre+"\n"+edad+"\n";
    }
}
