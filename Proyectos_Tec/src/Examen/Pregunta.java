/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen;

import static javax.swing.JOptionPane.*;
import static proyectos_tec.EjerciciosU3.*;

/**
 *
 * @author jmanu
 */
public class Pregunta {
    private int num,puntos;
    private String texto;
    public Pregunta(){
    }
    public Pregunta(int num, int puntos, String texto) {
        this.num = num;
        this.puntos = puntos;
        this.texto = texto;
    }
    public void leer(int np){
        String Error="Puntos (no mayor de "+100/np+")";
        num=leerEntero("Numero de la pregunta");
        texto=showInputDialog("Pregunta");
        do {            
            puntos=leerEntero(Error);
            if (puntos>100/np) {
                Error="No es posible ese puntaje para la pregunta\nMaximo x Pregunta ="+100/np;
            }
        } while (puntos>100/np);    
    }
    public void mostrar(){
        showMessageDialog(null, num+".- "+texto+"\nPuntos= "+puntos);
    }
    @Override
    public String toString(){
        return num+".- "+texto+"\nPuntos= "+puntos;
    }

    public int getPuntos() {
        return puntos;
    }
}
