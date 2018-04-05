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
public class Examen {
    public int np;
    private Pregunta[] P;
    public Examen(){
    }
    public Examen(int np){
        this.np=np;
        P=new Pregunta[np];
        for(int i=0;i<np;i++)
        {
         P[i]=new Pregunta();
        }
    }
    public void leer(){
        if(np==0){
            np=leerEntero("Numero de Preguntas");
            P=new Pregunta[np];
        }
        for (int i = 0; i < np; i++) {
            P[i]=new Pregunta();
            P[i].leer(np);
        }
    }
    public void mostrar(){
        String cad="";
        for (int i = 0; i < np; i++) {
            cad=cad+P[i]+"\n";
            
        }
        showMessageDialog(null, cad+"\n"+calificar());
    }
    public String calificar(){
        int calif=0;
        for (int i = 0; i < np; i++) {
            calif=calif+P[i].getPuntos();
        }
        return "Calificacion: "+calif;
    }
    
    public static void main(String[] args) {
        
        Examen X=new Examen();
        X.leer();
        X.mostrar();
        
    }

}
