/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectos_tec;

import static javax.swing.JOptionPane.*;

/**
 *
 * @author jmanu
 */
public class Alumno {
    private String nc,nombre;
    private int edad;
    public String getNc(){
        return nc;
    }
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    @Override
    public String toString(){
        return nc+" "+nombre+"  "+edad;
    }
    public void leer(){
        nc=showInputDialog("N° Control");
        nombre=showInputDialog("Nombre");
        edad=EjerciciosU3.leerEntero("Edad");
    }
    public void mostrar(){
        
    }
}
